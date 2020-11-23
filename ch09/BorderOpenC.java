package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderOpenC extends JFrame{
	public BorderOpenC() {
		Container c=getContentPane();
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		
		c.add(jp1,BorderLayout.NORTH);
		c.add(jp2,BorderLayout.CENTER);
		
		JButton btc1=new JButton("Open");
		JButton btc2=new JButton("Read");
		JButton btc3=new JButton("Close");
		
		jp1.setBackground(Color.darkGray);
		jp1.add(btc1);
		jp1.add(btc2);
		jp1.add(btc3);
		
		jp2.setLayout(null);
		
		JLabel la1=new JLabel("Hello");
		JLabel la2=new JLabel("Love");
		JLabel la3=new JLabel("Java");
		
		la1.setLocation(300, 50);
		la1.setSize(100,20);
		la2.setLocation(50, 150);
		la2.setSize(100,20);
		la3.setLocation(600, 130);
		la3.setSize(100,20);
		
		jp2.add(la1);
		jp2.add(la2);
		jp2.add(la3);
		
	

		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderOpenC();
	}

}
