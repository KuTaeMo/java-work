package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable1 implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable1(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Ex135 extends JFrame{
	
	public Ex135() {
		setTitle("ThreadInterruptEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		TimerRunnable1 runnable=new TimerRunnable1(timerLabel);
		Thread th=new Thread(runnable);

		JButton btn1=new JButton("kill Timer");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				th.interrupt();
				JButton btn1=(JButton)e.getSource();
				System.out.println(e.getSource());
				btn1.setEnabled(false);
			}
		});
		c.add(btn1);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new Ex135();
	}
}
