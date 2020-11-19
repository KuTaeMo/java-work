package test;

import ch05.BlueCloth;
import ch05.Factory;
import ch05.RedCloth;

//protected는 같은 패키지 + 자식만 상속
public class FactoryApp {

	public static void main(String[] args) {
		Factory f1=new BlueCloth();
		//f1.색칠(); //동적바인딩
		//f1.건조(); 
		
		//순서를 틀릴 수도 있기 때문에
		//순서를 미리 설정한 메소드를 사용!
		f1.가동();
		
		Factory f2=new RedCloth();
		f2.가동();
	}
}