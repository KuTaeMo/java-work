package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graph1 extends JFrame{
	
	private JLabel la1,la2,la3,la4,la5;
	private JButton btn1;
	private ArrayList<Integer> list=new ArrayList<>();
	private MyPanel panel;
	private int num=0;
	private JPanel pl=new JPanel();
	
	public Graph1() {
		setTitle("그래프 1");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(pl);
		
		pl.setLayout(new BorderLayout());
		panel=new MyPanel();
		btn1=new JButton("클릭");
		pl.add(panel,BorderLayout.CENTER);
		panel.setVisible(false);
		pl.add(btn1,BorderLayout.SOUTH);
		
		list.add(100);
		list.add(90);
		list.add(65);
		list.add(80);
		list.add(30);
		
		
		la1=new JLabel(""+list.get(0)+"");
		la2=new JLabel(""+list.get(1)+"");
		la3=new JLabel(""+list.get(2)+"");
		la4=new JLabel(""+list.get(3)+"");
		la5=new JLabel(""+list.get(4)+"");

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
			}
		});

		setSize(600, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.black);
			g.drawLine(0, 200, 600, 200);

			g.drawLine(95, 200, 95,200-list.get(0) );
				
			g.drawLine(195, 200, 195,200-list.get(1) );
				
			g.drawLine(295, 200, 295,200-list.get(2) );

			g.drawLine(395, 200, 395,200-list.get(3) );

			g.drawLine(495, 200, 495,200-list.get(4) );
			}
		}
	
	public static void main(String[] args) {
		new Graph1();
	}

}
