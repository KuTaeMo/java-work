package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example106 extends JFrame{
	private JLabel [] keyMessage;
	
	public Example106() {
		setTitle("keyListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage=new JLabel[3];
		keyMessage[0]=new JLabel("getKeyCode()");
		keyMessage[1]=new JLabel("getKeyChar()");
		keyMessage[2]=new JLabel("getKeyText()");
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.yellow);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode();
			char keyChar=e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("Key Pressed");
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("Key Released");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("Key Typed");
		}
	}
	public static void main(String[] args) {
		new Example106();
	}
}
