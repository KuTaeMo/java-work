package ch05;

public class GameApp {

	static void start(Car c) {
		c.����();
		c.�극��ũ();
	}
	
	public static void main(String[] args) {
		Ferrari f=new Ferrari();
		start(f);
		
		Genesis g=new Genesis();
		start(g);
	}

}
