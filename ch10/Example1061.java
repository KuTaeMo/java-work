package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example1061 extends JFrame{
	private JLabel la1;
	private Container c;
	
	public Example1061() {
		setTitle("예제");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		la1=new JLabel("키를 입력하세요!");
		c.add(la1, BorderLayout.CENTER);
		c.addKeyListener(new MyKeyListener());

		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode();
			char keyChar=e.getKeyChar();
			la1.setText(KeyEvent.getKeyText(keyCode)+"키가 입력되었음");
			if(keyCode==112)
				c.setBackground(Color.green);
			else if(keyChar=='%')
				c.setBackground(Color.yellow);
		}
		
	}
	public static void main(String[] args) {
		new Example1061();
	}

}
