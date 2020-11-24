package ch10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomeScreen extends JFrame{
	
	private HomeScreen homeScreen=this;
	private LoginScreen loginScreen;
	
	private JLabel laUsername;
	
	public HomeScreen() {
		this(null);
		
	}
	public HomeScreen(LoginScreen loginScreen) {
		this.loginScreen=loginScreen;
		
		
		laUsername=new JLabel(loginScreen.getTfUsername().getText());
		
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		
		Container c=getContentPane();
		c.add(laUsername,BorderLayout.CENTER);
		
		setVisible(true);
	}
}
