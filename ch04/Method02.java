package ch04;

class Dog{
	int 배고픔=100;	//상태
	
	void eat() {	//행위
		배고픔=10;
		//상태는 행위에 의해 변경된다.
	}
}
public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		//d1.배고픔=10; 변수값을 이렇게 직접 바꾸면 안됨! 마법은 안됨
		
		d1.eat();
		System.out.println("강아지의 배고픔 : "+d1.배고픔);
	}

}
