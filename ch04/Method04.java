package ch04;

//ctrl + shift + f  : 정렬
//메서드 안에 메서드를 정의할 수 없다.
//변수에 메서드를 담을 수 없다.
public class Method04 {

	int money=10000; //heap
	
	int add(int num) {//add()는 heap / int num은 stack
		int money2=money+num;
		return money2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m=new Method04();
		m.add(50000);
		int money2=m.add(50000);
		System.out.println(money2);
		System.out.println(m.money);
	}
}
