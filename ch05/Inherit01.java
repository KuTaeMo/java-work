package ch05;


//1. ����� ���� �޴� �ǹ� ( ���������� �ؾ��� )

class Father{
	int money=10000;
	
}

class Son extends Father{
	int money=20000;
}

public class Inherit01 {
	
	public static void main(String[] args) {
		Son s=new Son(); //son new�ϰ� father new��, �����ڴ� son��
		
		//1�� ������ ã�� �� ������ ������ �� ������ ���
		//������ ������ �θ� ã�� �ö󰣴�.
		System.out.println(s.money);
		//���� �������� �����Ǿ��ִµ� �ؿ� ������ ���� ã�ư�(Ÿ�� �ö󰣴�) 
		//son�� ������ father���� ã��
		
		//2�� new�� �ϸ� Father�� Son�� heap�� ���.
		//�����ڴ� Son()�� ȣ���� �ȴ�.
		//����Ű�� �޸� �ּҴ� Ÿ���� ���󰣴�.
		Father f=new Son();
		System.out.println(f.money);
	}
}
