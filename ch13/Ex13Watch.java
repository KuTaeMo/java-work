package ch13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TimeRun implements Runnable{
	private JLabel la1,la2,la3;
	
	public TimeRun(JLabel la1, JLabel la2, JLabel la3) {
		this.la1=la1;
		this.la2=la2;
		this.la3=la3;
	}
	
	@Override
	public void run() {
		while(true) {
			LocalDateTime now=LocalDateTime.now();
			la1.setText(Integer.toString(now.getHour()));
			la2.setText(Integer.toString(now.getMinute()));
			la3.setText(Integer.toString(now.getSecond()));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
		
	}
}
public class Ex13Watch extends JFrame{
	public Ex13Watch() {
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		
		JLabel la1=new JLabel();
		JLabel la2=new JLabel();
		JLabel la3=new JLabel();
		JLabel la4=new JLabel(" : ");
		JLabel la5=new JLabel(" : ");
		JLabel la6=new JLabel("  ");
		
		la1.setFont(new Font("Gothic",Font.ITALIC,50));
		la2.setFont(new Font("Gothic",Font.ITALIC,50));
		la3.setFont(new Font("Gothic",Font.ITALIC,50));
		la4.setFont(new Font("Gothic",Font.ITALIC,50));
		la5.setFont(new Font("Gothic",Font.ITALIC,50));
		la6.setFont(new Font("Gothic",Font.ITALIC,50));
		
		
		c.add(p,BorderLayout.CENTER);
		c.add(p1,BorderLayout.NORTH);
		p.add(la1);
		p.add(la4);
		p.add(la2);
		p.add(la5);
		p.add(la3);
		p1.add(la6);
		
		TimeRun runn=new TimeRun(la1,la2,la3);
		Thread th=new Thread(runn);
		
		setSize(500,300);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new Ex13Watch();
	}
}
