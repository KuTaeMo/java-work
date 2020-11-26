package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OpenChallenge extends JFrame{

	private int num;
	private JLabel imageLabel;
	private JButton btn1,btn2;
	private ImageIcon [] image= {
			new ImageIcon("images/1.jpg"),
			new ImageIcon("images/2.jpg"),
			new ImageIcon("images/3.jpg")
	};
	
	public OpenChallenge() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		num=0;
		imageLabel=new JLabel(image[0]);
		btn1=new JButton("왼쪽");
		btn2=new JButton("오른쪽");
		
		//하단 메뉴바
		class MenuPanel extends JPanel{}
		
		MenuPanel mbar=new MenuPanel();
		mbar.setBackground(Color.gray);
		mbar.add(btn1);
		mbar.add(btn2);
		c.add(imageLabel,BorderLayout.CENTER);
		c.add(mbar,BorderLayout.SOUTH);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=num-1;
				if(num==-1)
					num=2;
				imageLabel.setIcon(image[num]);
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=num+1;
				if(num==3)
					num=0;
				imageLabel.setIcon(image[num]);
				
				
			}
		});
		
		setSize(300,500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new OpenChallenge();
	}
}
