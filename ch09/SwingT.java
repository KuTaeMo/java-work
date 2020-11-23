package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingT extends JFrame{
	public SwingT(){
	Container c=getContentPane();
	JPanel jp1=new JPanel();
	JPanel jp2=new JPanel();
	JPanel jp3=new JPanel();
	
	JButton btn1=new JButton("버튼1");
	JButton btn2=new JButton("버튼2");
	JButton btn3=new JButton("버튼3");
	JButton btn4=new JButton("버튼4");
	JButton btn5=new JButton("버튼5");
	
	c.add(jp2,BorderLayout.NORTH);
	c.add(jp3,BorderLayout.CENTER);
	c.add(jp1,BorderLayout.SOUTH);
	
	jp2.setLayout(new BorderLayout());
	jp3.setLayout(new BorderLayout());
	
	jp2.add(btn1);
	jp3.add(btn2);
	jp1.add(btn3);
	jp1.add(btn4);
	jp1.add(btn5);
	setVisible(true);
}
	public static void main(String[] args) {
		new SwingT();
	}
}
