package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderEx4 extends JFrame{
	public BorderEx4() {
		Container c=getContentPane();
		GridLayout grid=new GridLayout(0,10);
		
		c.setLayout(grid);
		JPanel jp1=new JPanel();
		jp1.setBackground(Color.red);
		jp1.setLayout(new BorderLayout());
		JPanel jp2=new JPanel();
		jp2.setBackground(Color.orange);
		jp2.setLayout(new BorderLayout());
		JPanel jp3=new JPanel();
		jp3.setBackground(Color.yellow);
		jp3.setLayout(new BorderLayout());
		JPanel jp4=new JPanel();
		jp4.setBackground(Color.green);
		jp4.setLayout(new BorderLayout());
		JPanel jp5=new JPanel();
		jp5.setBackground(Color.blue);
		jp5.setLayout(new BorderLayout());
		JPanel jp6=new JPanel();
		jp6.setBackground(Color.cyan);
		jp6.setLayout(new BorderLayout());
		JPanel jp7=new JPanel();
		jp7.setBackground(Color.magenta);
		jp7.setLayout(new BorderLayout());
		JPanel jp8=new JPanel();
		jp8.setBackground(Color.DARK_GRAY);
		jp8.setLayout(new BorderLayout());
		JPanel jp9=new JPanel();
		jp9.setBackground(Color.pink);
		jp9.setLayout(new BorderLayout());
		JPanel jp10=new JPanel();
		jp10.setBackground(Color.gray);
		jp10.setLayout(new BorderLayout());
		
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		c.add(jp5);
		c.add(jp6);
		c.add(jp7);
		c.add(jp8);
		c.add(jp9);
		c.add(jp10);
		
		JLabel la1=new JLabel("0");
		JLabel la2=new JLabel("1");
		JLabel la3=new JLabel("2");
		JLabel la4=new JLabel("3");
		JLabel la5=new JLabel("4");
		JLabel la6=new JLabel("5");
		JLabel la7=new JLabel("6");
		JLabel la8=new JLabel("7");
		JLabel la9=new JLabel("8");
		JLabel la10=new JLabel("9");
		la1.setHorizontalAlignment(JLabel.CENTER);
		la2.setHorizontalAlignment(JLabel.CENTER);
		la3.setHorizontalAlignment(JLabel.CENTER);
		la4.setHorizontalAlignment(JLabel.CENTER);
		la5.setHorizontalAlignment(JLabel.CENTER);
		la6.setHorizontalAlignment(JLabel.CENTER);
		la7.setHorizontalAlignment(JLabel.CENTER);
		la8.setHorizontalAlignment(JLabel.CENTER);
		la9.setHorizontalAlignment(JLabel.CENTER);
		la10.setHorizontalAlignment(JLabel.CENTER);

		jp1.add(la1,BorderLayout.CENTER);
		jp2.add(la2,BorderLayout.CENTER);
		jp3.add(la3,BorderLayout.CENTER);
		jp4.add(la4,BorderLayout.CENTER);
		jp5.add(la5,BorderLayout.CENTER);
		jp6.add(la6,BorderLayout.CENTER);
		jp7.add(la7,BorderLayout.CENTER);
		jp8.add(la8,BorderLayout.CENTER);
		jp9.add(la9,BorderLayout.CENTER);
		jp10.add(la10,BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderEx4();

	}

}
