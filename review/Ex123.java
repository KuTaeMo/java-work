package review;

interface Helloable{
	void ¾È³ç();
}
public class Ex123 {
	
	static void start(Helloable h) {
		h.¾È³ç();
	}
	
	
	public static void main(String[] args) {
		start(new Helloable() {
			
			@Override
			public void ¾È³ç() {
				// TODO Auto-generated method stub
				System.out.println("¹Ý°©½À´Ï´Ù.");
			}
		});
	}
}
