package ch05;


//1. 재산을 물려 받는 의미 ( 콤포지션을 해야함 )

class Father{
	int money=10000;
	
}

class Son extends Father{
	int money=20000;
}

public class Inherit01 {
	
	public static void main(String[] args) {
		Son s=new Son(); //son new하고 father new함, 생성자는 son만
		
		//1번 변수를 찾을 때 변수가 있으면 그 변수를 사용
		//변수가 없으면 부모를 찾아 올라간다.
		System.out.println(s.money);
		//힙이 수직으로 생성되어있는데 밑에 없으면 위로 찾아감(타고 올라간다) 
		//son에 없으면 father에서 찾음
		
		//2번 new를 하면 Father과 Son이 heap에 뜬다.
		//생성자는 Son()만 호출이 된다.
		//가리키는 메모리 주소는 타입을 따라간다.
		Father f=new Son();
		System.out.println(f.money);
	}
}
