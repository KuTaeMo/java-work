package ch04;

class Car{
	String desc="소나타의 부모입니다.";
	
	public Car() {
		System.out.println("자동차");
	}
}

class Sonata extends Car{
	public Sonata() {
		super();
		System.out.println(super.desc);
		System.out.println("소나타");
	}
}

public class Super01 {
	
	public static void main(String[] args) {
		new Sonata();
	}

}
