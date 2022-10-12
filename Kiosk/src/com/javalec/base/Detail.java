package com.javalec.base;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.javalec.util.RoundedButton;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Detail extends JPanel implements ActionListener{
	public JTextField tf1 = new JTextField();
	public JTextField tf2 = new JTextField();
	public JTextField tf3 = new JTextField();
	public JTextField tf4 = new JTextField();
	
	private int hotice;
	private int water;
	private int shot;
	private int syrup;
	private int quantity;
	

	public Detail() {
		setLayout(null);
		setBackground(new Color(244, 210, 201));
		setSize(350, 700);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 155, 350, 545);
		panel.setBackground(new Color(255, 255, 255));
		add(panel);
		panel.setLayout(null);
		
		RoundedButton btnCancelAll = new RoundedButton("");
		btnCancelAll.setBackground(new Color(255, 255, 255));
		btnCancelAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelAll.setIcon(new ImageIcon(Detail.class.getResource("/com/javalec/image/Group 69181.png")));
		btnCancelAll.setBounds(12, 399, 326, 65);
		panel.add(btnCancelAll);
		
		RoundedButton btnAddToCart = new RoundedButton("");
		btnAddToCart.setBackground(new Color(255, 255, 255));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame.frame.getContentPane().add(new Cart());
			}
		});
		btnAddToCart.setIcon(new ImageIcon(Detail.class.getResource("/com/javalec/image/Group 69191.png")));
		btnAddToCart.setBounds(12, 470, 326, 65);
		panel.add(btnAddToCart);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 326, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnHot = new JButton("Hot");
		btnHot.setBounds(75, 22, 95, 23);
		btnHot.addActionListener(this);
		panel_1.add(btnHot);
		
		JButton btnIce = new JButton("Ice");
		btnIce.setBounds(182, 22, 95, 23);
		btnIce.addActionListener(this);
		panel_1.add(btnIce);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 75, 326, 55);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTall = new JButton("Tall");
		btnTall.setBounds(67, 22, 77, 23);
		btnTall.addActionListener(this);
		panel_2.add(btnTall);
		
		JButton btnGrande = new JButton("Grande");
		btnGrande.setBounds(156, 22, 85, 23);
		btnGrande.addActionListener(this);
		panel_2.add(btnGrande);
		
		JButton btnVenti = new JButton("Venti");
		btnVenti.setBounds(253, 22, 61, 23);
		btnVenti.addActionListener(this);
		panel_2.add(btnVenti);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 140, 326, 55);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("기본");
		btnNewButton_5.setBounds(32, 22, 56, 23);
		btnNewButton_5.addActionListener(this);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+1");
		btnNewButton_6.setBounds(100, 22, 56, 23);
		btnNewButton_6.addActionListener(this);
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("+2");
		btnNewButton_7.setBounds(176, 22, 56, 23);
		btnNewButton_7.addActionListener(this);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("+3");
		btnNewButton_8.setBounds(258, 22, 56, 23);
		btnNewButton_8.addActionListener(this);
		panel_3.add(btnNewButton_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 205, 326, 55);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("없음");
		btnNewButton_9.setBounds(55, 22, 64, 23);
		btnNewButton_9.addActionListener(this);
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("헤이즐넛");
		btnNewButton_10.setBounds(131, 22, 90, 23);
		btnNewButton_10.addActionListener(this);
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("바닐라");
		btnNewButton_11.setBounds(233, 22, 81, 23);
		btnNewButton_11.addActionListener(this);
		panel_4.add(btnNewButton_11);
		
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setBounds(12, 300, 73, 21);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setColumns(10);
		tf2.setBounds(97, 300, 73, 21);
		panel.add(tf2);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBounds(182, 300, 73, 21);
		panel.add(tf3);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBounds(267, 300, 73, 21);
		panel.add(tf4);
		
		
		RoundedButton btnBack = new RoundedButton("");
		btnBack.setIcon(new ImageIcon(Detail.class.getResource("/com/javalec/image/Vector.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame.frame.getContentPane().add(new MenuMain());
			}
		});
		btnBack.setBackground(new Color(244, 210, 201));
		btnBack.setBounds(12, 10, 33, 36);
		add(btnBack);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Hot")||actionCommand.equals("Ice")) {
			tf1.setText(actionCommand);
			if (tf1.getText() == "Hot") {
				hotice = 0;
			} else {
				hotice = 1;
			}
			
		}
		if (actionCommand.equals("Tall")||actionCommand.equals("Grande")||actionCommand.equals("Venti")) {
			tf2.setText(actionCommand);
			if (tf2.getText() == "Tall") {
				water = 0;
			} else if (tf2.getText() == "Grande"){
				water = 500;
			} else if (tf3.getText() == "Venti")
				water = 1000;
		}

		if (actionCommand.equals("기본")||actionCommand.equals("+1")||actionCommand.equals("+2")||actionCommand.equals("+3")) {
			tf3.setText(actionCommand);
		}
		if (actionCommand.equals("없음")||actionCommand.equals("헤이즐넛")||actionCommand.equals("바닐라")) {
			tf4.setText(actionCommand);

		}
		
	}
}
