package ch04;

//자바 특징 : 모든 코드는 class 내부에 둬야 한다.
public class Method01 {

		int num=10;	//heap에 저장 (new 할 때만 메모리에 올라오기 때문)
		static int num3=30;	//static에 저장
		
		static void add() {
			System.out.println("add함수 호출됨");
		}
		
		void sound() {
			System.out.println("sound함수 호출됨");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2=20; //스택에 저장됨 ( 함수가 스택에 올라가야 메모리에 뜨기 때문)
		Method01.add();
		Method01 m=new Method01();
		m.sound();
	}

}
