package ch04;

class Dog{
	int �����=100;	//����
	
	void eat() {	//����
		�����=10;
		//���´� ������ ���� ����ȴ�.
	}
}
public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		//d1.�����=10; �������� �̷��� ���� �ٲٸ� �ȵ�! ������ �ȵ�
		
		d1.eat();
		System.out.println("�������� ����� : "+d1.�����);
	}

}
