package ch04;

//ctrl + shift + f  : ����
//�޼��� �ȿ� �޼��带 ������ �� ����.
//������ �޼��带 ���� �� ����.
public class Method04 {

	int money=10000; //heap
	
	int add(int num) {//add()�� heap / int num�� stack
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
