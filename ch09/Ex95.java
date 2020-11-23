package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex95 extends JFrame{
	public Ex95() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid=new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c=getContentPane();
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		jp1.setLayout(grid);
		jp2.setLayout(new BorderLayout());
		
		JButton btn1=new JButton("button1");
		
		c.add(jp1,BorderLayout.NORTH);
		c.add(jp2,BorderLayout.SOUTH);
		jp1.add(new JLabel(" 이름"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 학번"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 학과"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 과목"));
		jp1.add(new JTextField(""));
		jp2.add(btn1);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex95();
	}
}

