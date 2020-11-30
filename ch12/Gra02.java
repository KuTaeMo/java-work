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
		setTitle("repaint ��");
		setSize(400,500);
		
		panel=new MyPanel();
		setContentPane(panel); //������ �г��� �ٸ� �гη� �ٲ� -> paintcomponent ����ϱ� ���ؼ�
		
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
			super.paintComponent(g);	//���� �׸��� �� �����ش�.
			g.setColor(Color.blue);
			g.drawRect(x, y, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		new Gra02();
	}
}
