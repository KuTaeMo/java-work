package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import ch09.BorderEx4;
import lombok.extern.jbosslog.JBossLog;

public class LoginScreen  extends JFrame{
	
	//Context = ���ؽ�Ʈ = ����Ŀ
	//�ڽ��� ������ �ѱ� �� ����
	private LoginScreen loginScreen=this;
	private JTextField tfUsername;
	private JButton btnLogin;
	
	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public LoginScreen() {
		tfUsername=new JTextField("");
		btnLogin=new JButton("�α���");
		
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		Container c=getContentPane();
		c.add(tfUsername,BorderLayout.CENTER);
		c.add(btnLogin,BorderLayout.SOUTH);
		
		initListener();
		
		setVisible(true);
	}
	
	//������ ��� ��Ƶα�
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=tfUsername.getText();
				if(username.equals("ssar")) {
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false);
				}else {
					System.out.println("�α��� ���� : ���̵� �ٽ� �Է��ϼ���!");
				}
				
			}
		});
	}
}
