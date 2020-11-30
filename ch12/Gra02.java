package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra02 extends JFrame{
	
	private MyPanel panel;
	int x=10;
	int y=10;
	
	public Gra02() {
		setTitle("repaint 예");
		setSize(400,500);
		
		panel=new MyPanel();
		setContentPane(panel); //기존의 패널을 다른 패널로 바꿈 -> paintcomponent 사용하기 위해서
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					x=e.getX();
					y=e.getY();
					System.out.println("x : "+x);
					System.out.println("y : "+y);
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);	//이전 그림을 다 지워준다.
			g.setColor(Color.blue);
			g.drawRect(x, y, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		new Gra02();
	}
}
