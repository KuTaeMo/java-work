package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing02 extends JFrame{
	public Swing02() {
		setTitle("�÷ο� ���̾ƿ�");
		setSize(300,400);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("��ư1");
		JButton btn2=new JButton("��ư2");
		JButton btn3=new JButton("��ư3");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing02();
	}
}
