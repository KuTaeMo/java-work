package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Swing04 extends JFrame {

	private JPanel jp1,jp2;
	private JButton btn1,btn2,btn3;
	private JLabel la1,la2,la3;
	
	private void initObject() {
		jp1=new JPanel();
		jp2=new JPanel();
		btn1=new JButton("Open");
		btn2=new JButton("Read");
		btn3=new JButton("Close");
		la1=new JLabel("Hello");
		la2=new JLabel("Java");
		la3=new JLabel("Love");
	}
	
	private void initSetting() {
		jp1.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(jp1, BorderLayout.NORTH);
		getContentPane().add(jp2, BorderLayout.CENTER);
		jp2.setLayout(null);
		
		la1.setBounds(170, 26, 57, 15);
		
		la2.setBounds(76, 155, 57, 15);

		la3.setBounds(317, 128, 57, 15);
	}
	
	private void initBatch() {
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		jp2.add(la1);
		jp2.add(la2);
		jp2.add(la3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(44, 195, 32, 23);
		jp2.add(comboBox);
	}
	
	public Swing04() {
		setTitle("맘대로 놓기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//1. 필요한 오브젝트를 메모리에 로딩
		initObject();
		
		//2. 세팅
		initSetting();
		
		//3. 배치
		initBatch();

		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing04();
	}
}
