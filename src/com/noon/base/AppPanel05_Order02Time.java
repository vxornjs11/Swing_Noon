package com.noon.base;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppPanel05_Order02Time extends JPanel {
	
	private AppPanel05_Order03Menu appPanel05_Order03Menu = new AppPanel05_Order03Menu();
	
	private JLabel lblNewLabel_01;
	private JLabel lblNewLabel_02;
	private JLabel lblNewLabel_03;
	private JLabel lblBtnSelect_09;
	private JLabel lblBtnTabOrder;
	private JLabel lblBtnTabMypage;
	private JLabel lblNewLabel_5;
	private JLabel lblBtnTabHome;
	private JLabel lblBtnTabGift;
	private JLabel lblBtnSidebar;
	private JLabel lblBtnBack;
	private JLabel lblNewLabel_10;
	private JComboBox cbTimeHour;
	private JLabel lblLeftQuentity;
	private JLabel lblNewLabel_06_2;
	private JComboBox cbTimeMinute;
	private JLabel lblNewLabel_03_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	// 바탕화면 그라데이션 -------------------------------------------------------------------------------
	@Override
	protected void paintChildren(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#F4D2C9"), 0, getHeight(), Color.decode("#FAF3E0"));
		g2.setPaint(g3);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
		super.paintChildren(g);
	}
	// ----------------------------------------------------------------------------------------------
	
	/**
	 * Create the panel.
	 */
	public AppPanel05_Order02Time() {
		setBounds(0, 0, 375, 812);
		setOpaque(true);
		setLayout(null);
		
		add(getLblNewLabel_01());
		add(getLblNewLabel_02());
		add(getLblNewLabel_03());
		add(getLblLeftQuentity());
		add(getLblNewLabel_06_2());
		add(getLblNewLabel_5());
		add(getLblBtnSelect_09());
		add(getLblBtnTabHome());
		add(getLblBtnTabOrder());
		add(getLblBtnTabGift());
		add(getLblBtnTabMypage());
		add(getLblBtnSidebar());
		add(getLblBtnBack());
		add(getLblNewLabel_10());
		add(getCbTimeHour());
		add(getCbTimeMinute());
		add(getLblNewLabel_03_1());
		add(getLblNewLabel());
		add(getLblNewLabel_1());
	}
	
	// 상단바 =============================================================================================================
	private JLabel getLblBtnSidebar() {
		if (lblBtnSidebar == null) {
			lblBtnSidebar = new JLabel("");
			lblBtnSidebar.setHorizontalAlignment(SwingConstants.CENTER);
			lblBtnSidebar.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/icon_sidebar.png"));
			lblBtnSidebar.setBounds(13, 26, 36, 32);
		}
		return lblBtnSidebar;
	}
	private JLabel getLblBtnBack() {
		if (lblBtnBack == null) {
			lblBtnBack = new JLabel("");
			lblBtnBack.setHorizontalAlignment(SwingConstants.CENTER);
			lblBtnBack.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/icon_back.png"));
			lblBtnBack.setBounds(51, 26, 32, 32);
		}
		return lblBtnBack;
	}
	private JLabel getLblNewLabel_01() {
		if (lblNewLabel_01 == null) {
			lblNewLabel_01 = new JLabel("매장 선택");
			lblNewLabel_01.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_01.setForeground(new Color(176, 108, 89));
			lblNewLabel_01.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
			lblNewLabel_01.setBounds(131, 26, 115, 37);
		}
		return lblNewLabel_01;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_10.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/profile_photo.png"));
			lblNewLabel_10.setBounds(297, 26, 36, 36);
		}
		return lblNewLabel_10;
	}
	// ==================================================================================================================

	private JLabel getLblNewLabel_02() {
		if (lblNewLabel_02 == null) {
			lblNewLabel_02 = new JLabel("가져갈 시간을 선택해주세요 !");
			lblNewLabel_02.setForeground(new Color(60, 60, 60));
			lblNewLabel_02.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblNewLabel_02.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_02.setBounds(1, 263, 374, 22);
		}
		return lblNewLabel_02;
	}
	private JLabel getLblNewLabel_03() {
		if (lblNewLabel_03 == null) {
			lblNewLabel_03 = new JLabel("남은 개수 :");
			lblNewLabel_03.setBounds(114, 313, 71, 16);
			lblNewLabel_03.setForeground(new Color(176, 108, 89));
			lblNewLabel_03.setFont(new Font("SansSerif", Font.PLAIN, 16));
		}
		return lblNewLabel_03;
	}
	private JComboBox getCbTimeHour() {
		if (cbTimeHour == null) {
			cbTimeHour = new JComboBox();
			cbTimeHour.setFont(new Font("SansSerif", Font.PLAIN, 16));
			cbTimeHour.setModel(new DefaultComboBoxModel(new String[] {"시", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"}));
			cbTimeHour.setBounds(91, 387, 89, 27);
			cbTimeHour.setForeground(Color.decode("#B06C5A"));
			cbTimeHour.setBackground(Color.decode("#FFEAEA"));
		}
		return cbTimeHour;
	}
	private JComboBox getCbTimeMinute() {
		if (cbTimeMinute == null) {
			cbTimeMinute = new JComboBox();
			cbTimeMinute.setModel(new DefaultComboBoxModel(new String[] {"분", "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"}));
			cbTimeMinute.setForeground(new Color(176, 108, 90));
			cbTimeMinute.setFont(new Font("SansSerif", Font.PLAIN, 16));
			cbTimeMinute.setBackground(new Color(255, 234, 234));
			cbTimeMinute.setBounds(192, 387, 89, 27);
		}
		return cbTimeMinute;
	}
	private JLabel getLblBtnSelect_09() {
		if (lblBtnSelect_09 == null) {
			lblBtnSelect_09 = new JLabel("");
			lblBtnSelect_09.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					setVisible(false);
					AppMain.frame.getContentPane().add(appPanel05_Order03Menu);
				}
			});
			lblBtnSelect_09.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/btn_select.png"));
			lblBtnSelect_09.setBounds(15, 644, 345, 61);
		}
		return lblBtnSelect_09;
	}
	// ==================================================================================================================

	// Tabbar ===========================================================================================================
	private JLabel getLblBtnTabHome() {
		if (lblBtnTabHome == null) {
			lblBtnTabHome = new JLabel("");
			lblBtnTabHome.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/tabbar_home.png"));
			lblBtnTabHome.setBounds(1, 729, 94, 50);
		}
		return lblBtnTabHome;
	}
	private JLabel getLblBtnTabOrder() {
		if (lblBtnTabOrder == null) {
			lblBtnTabOrder = new JLabel("");
			lblBtnTabOrder.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/tabbar_order.png"));
			lblBtnTabOrder.setBounds(95, 729, 94, 50);
		}
		return lblBtnTabOrder;
	}
	private JLabel getLblBtnTabGift() {
		if (lblBtnTabGift == null) {
			lblBtnTabGift = new JLabel("");
			lblBtnTabGift.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/tabbar_gift.png"));
			lblBtnTabGift.setBounds(187, 729, 94, 50);
		}
		return lblBtnTabGift;
	}
	private JLabel getLblBtnTabMypage() {
		if (lblBtnTabMypage == null) {
			lblBtnTabMypage = new JLabel("");
			lblBtnTabMypage.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/tabbar_mypage.png"));
			lblBtnTabMypage.setBounds(281, 729, 94, 50);
		}
		return lblBtnTabMypage;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/homeindicator.png"));
			lblNewLabel_5.setBounds(1, 778, 375, 34);
		}
		return lblNewLabel_5;
	}
	// ==================================================================================================================
	
	
	private JLabel getLblLeftQuentity() {
		if (lblLeftQuentity == null) {
			lblLeftQuentity = new JLabel("");
			lblLeftQuentity.setHorizontalAlignment(SwingConstants.TRAILING);
			lblLeftQuentity.setForeground(new Color(176, 108, 89));
			lblLeftQuentity.setFont(new Font("SansSerif", Font.PLAIN, 16));
			lblLeftQuentity.setBounds(183, 313, 42, 16);
		}
		return lblLeftQuentity;
	}
	private JLabel getLblNewLabel_06_2() {
		if (lblNewLabel_06_2 == null) {
			lblNewLabel_06_2 = new JLabel("잔");
			lblNewLabel_06_2.setForeground(new Color(176, 108, 89));
			lblNewLabel_06_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
			lblNewLabel_06_2.setBounds(229, 313, 17, 16);
		}
		return lblNewLabel_06_2;
	}
	private JLabel getLblNewLabel_03_1() {
		if (lblNewLabel_03_1 == null) {
			lblNewLabel_03_1 = new JLabel(":");
			lblNewLabel_03_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_03_1.setForeground(new Color(176, 108, 89));
			lblNewLabel_03_1.setFont(new Font("SansSerif", Font.BOLD, 18));
			lblNewLabel_03_1.setBounds(175, 387, 20, 20);
		}
		return lblNewLabel_03_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon("/Users/sangwon_kim/GitHub/Noon/src/com/noon/app/time_background.png"));
			lblNewLabel.setBounds(15, 352, 345, 95);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("<주의> 선택시간으로부터 30분 이후에도 방문하지 않을 시 폐기됩니다.");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(15, 455, 345, 34);
		}
		return lblNewLabel_1;
	}
} // End