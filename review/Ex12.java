package review;

//tv 4대 삼성, LG, 대우, 일렉트론

//강제성 부여
//사용자에게 편리한 인터페이스 제공
interface Remocon{
	void change();
}
class SamsungRemocon implements Remocon{

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("삼성 채널변경");
	}
	
}

class LGRemocon implements Remocon{

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("엘지 채널변경");
	}
	
}
public class Ex12 {
	
	static void 채널변경(Remocon r) {
		r.change();
	}
	public static void main(String[] args) {
		채널변경(new SamsungRemocon());
		채널변경(new LGRemocon());
		
		//익명클래스
		Remocon r=new Remocon() {
			
			@Override
			public void change() {
				System.out.println("안녕");
				
			}
		};
		r.change();
	}
}
