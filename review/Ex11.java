package review;

//상속은 데이터를 물려주는 것이 목적이 아니다.
// 데이터를 물려주고 싶으면 콤포지션하면 된다.
// 상속을 하는 이유는 다형성에 있음. 타입을 일치시키려는 것!!

abstract class 나무{
	void start() {
}
}
class 나무의자 extends 나무{
	void start() {
		System.out.println("나무의자 사용");
	}
}

class 나무책상 extends 나무{
	void start() {
		System.out.println("나무책상 사용");
	}
}


public class Ex11 {
//	static void use(나무책상 u) {
//		u.start();
//	}
//	//오버로딩(과적재)
//	static void use(나무의자 u) {
//		u.start();
//	}
	static void use(나무 u) {
		u.start();
	}
	public static void main(String[] args) {
		use(new 나무책상());
		use(new 나무의자());
	}
}
