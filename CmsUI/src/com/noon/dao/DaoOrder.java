package com.noon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.noon.dto.DtoOrder;
import com.noon.util.DBConnect;


public class DaoOrder {
	int customerno;
	//대기번호
	int orderno;
	//주문번ㅎ호
	int quantity;
	//ㅈ 주문개수
	String name;
//	// 메뉴 이
	String ordertime;
//	// 주문시간
	String completetime;
	
	
	
	public DaoOrder() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public DaoOrder(int orderno) {
		super();
		this.orderno = orderno;
	}


	


	public ArrayList<DtoOrder> searchAction() {
		ArrayList<DtoOrder> DtoOrder = new ArrayList<>();
//		select o.customerno, o.orderno,o.quantity,m.name,o.ordertime,count(completetime)
//		from menu as m, orderd as o,setting as s, complete as c
//		where o.orderno = s.setno and s.setno = m.name and c.completetime is not null
//		group by o.orderno;
//		String whereStatement = "select detail_no , size, stock from detail";
//		String whereStatement2 = " where p_product_no = " + Panel3.clickNo;
		String whereStatement = "select orderno, customerno,quantity,name,ordertime,completetime \n "
				+ "from menu as m, noon.order as o, setting as s,complete as c ";
				
		String whereStatement2 = "where o.set_setno = s.setno and  o.set_menu_name = m.name  and o.orderno = c.order_orderno" ;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();

			ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);

			while (rs.next()) {
				DtoOrder.add(new DtoOrder(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6)));
				
				// 이거 바꾸니까 테이블 화면이 바뀌더라.
				

		}
			conn_mysql.close();
		} catch (Exception e) {
			e.printStackTrace(); // 개발 할 때는 이렇게, product를 만들 때는 경고문장을 넣어주면 된다.
		
	}
		return DtoOrder;
    }   
	public DtoOrder tableClick() {
		DtoOrder dto = null;

		String whereStatement = "select orderno, customerno,quantity,name,ordertime,completetime\n"
				+ "from menu as m, noon.order as o, setting as s,complete as c  "; // 마지막 띄워주기
		String whereStatement2 = "where o.set_setno = s.setno and  o.set_menu_name = m.name  and o.orderno = c.order_orderno and orderno = " + orderno;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();

			ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);

			if (rs.next()) { // true값일때만 가져온다
				int orderno = rs.getInt(1);
				int customerno = rs.getInt(2);
				int quantity = rs.getInt(3);
				String name = rs.getString(4);
				String ordertime = rs.getString(5);
				String completetime = rs.getString(6);
//				int wkStock = rs.getInt(4);;
				dto = new DtoOrder(orderno, customerno, quantity, name, ordertime,completetime);
			}

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
}
//	public DtoOrder counttable() {
//		DtoOrder dto = null;
//
//		String whereStatement = "select count(*) from complete where completetime is null ;"; // 마지막 띄워주기
//
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
//					DBConnect.pw_mysql);
//			Statement stmt_mysql = conn_mysql.createStatement();
//
//			ResultSet rs = stmt_mysql.executeQuery(whereStatement);
//
//			if (rs.next()) { // true값일때만 가져온다
//				String completetime = rs.getString(1);
////		
//				dto = new DtoOrder(completetime);
//			}
//
//			conn_mysql.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return dto;
//	
//	}
}
