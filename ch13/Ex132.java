package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) {
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
			} catch (Exception e) {
				return;
			}
		}
	}
	
}

public class Ex132 extends JFrame{
	public Ex132() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		TimerThread th=new TimerThread(timerLabel);
		Thread th1=new Thread(th);
		
		setSize(200,150);
		setVisible(true);
		
		th1.start();
	}
	public static void main(String[] args) {
		new Ex132();
	}
}
