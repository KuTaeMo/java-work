package review;

interface Helloable{
	void �ȳ�();
}
public class Ex123 {
	
	static void start(Helloable h) {
		h.�ȳ�();
	}
	
	
	public static void main(String[] args) {
		start(new Helloable() {
			
			@Override
			public void �ȳ�() {
				// TODO Auto-generated method stub
				System.out.println("�ݰ����ϴ�.");
			}
		});
	}
}
