package ch04;

class Car{
	String desc="�ҳ�Ÿ�� �θ��Դϴ�.";
	
	public Car() {
		System.out.println("�ڵ���");
	}
}

class Sonata extends Car{
	public Sonata() {
		super();
		System.out.println(super.desc);
		System.out.println("�ҳ�Ÿ");
	}
}

public class Super01 {
	
	public static void main(String[] args) {
		new Sonata();
	}

}
