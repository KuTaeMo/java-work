package ch04;

class TV{
	int size;
	String mf;
	
	public TV() {
		this(32,"LG");
	}
	public TV(String mf) {
		this(32,mf);
	}
	public TV(int size, String mf) {
		this.size=size;
		this.mf=mf;
		System.out.println(size+"��ġ "+mf);
	}
}
public class TVApp {
	
	
	public static void main(String[] args) {
		new TV();
		new TV("�Ｚ");
		new TV(65,"�Ｚ");
	}

}
