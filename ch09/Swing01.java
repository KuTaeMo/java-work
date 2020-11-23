package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Swing�� ���������� while�� ���� ����. ���� ���μ���
public class Swing01 extends JFrame{
	public Swing01() {
		setTitle("����");
		setSize(300, 500);
		
		//JPanel = JFrame�� �⺻������ ������ �ִ� �г�
		Container c=getContentPane(); 
		JButton btn1=new JButton("��ư1");
		JButton btn2=new JButton("��ư2");
		JButton btn3=new JButton("��ư3");
		JButton btn4=new JButton("��ư4");
		JButton btn5=new JButton("��ư5");
		JButton btn6=new JButton("��ư6");
		
		JPanel jp1=new JPanel();
		jp1.add(btn6);
		
		c.add(btn1,BorderLayout.WEST);
		c.add(btn2,Batch.EAST);
		c.add(btn3,Batch.NORTH);
		c.add(jp1,Batch.CENTER);
		c.add(btn5,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		System.out.println(MyLayout.WEST);
		System.out.println(MyLayout.WEST.name());
		System.out.println(MyLayout.WEST.ordinal());
		System.out.println(MyLayout.WEST.getValue());
		
		new Swing01();
	}
}
