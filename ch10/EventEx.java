package ch10;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx extends JFrame {
	private JButton btn1,btn2,btn3;
	private JLabel la1,la2,la3;
	private Container c;
	private GridLayout grid;
	
	public EventEx() {
		setTitle("����");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		grid=new GridLayout(3,2);
		c.setLayout(grid);
		btn1=new JButton("������ ��");
		btn2=new JButton("�ö�� ��");
		btn3=new JButton("��� ��");
		
		la1=new JLabel("�ϰ͵� ����");
		la2=new JLabel("�ϰ͵� ����");
		la3=new JLabel("�ϰ͵� ����");
		
		c.add(la1);
		c.add(btn1);
		c.add(la2);
		c.add(btn2);
		c.add(la3);
		c.add(btn3);
		
		class MyActionListener extends MouseAdapter{
			public void mouseReleased(MouseEvent e) {
				la1.setText("������");
			}	
		}
		class MyActionListener1 extends MouseAdapter{
			public void mouseEntered(MouseEvent e) {
				la2.setText("�ö��");
			}
		}
		class MyActionListener2 extends MouseAdapter{
			public void mouseExited(MouseEvent e) {
				la3.setText("���");
			}
		}
		btn1.addMouseListener(new MyActionListener());
		btn2.addMouseListener(new MyActionListener1());
		btn3.addMouseListener(new MyActionListener2());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx();
	}
}
