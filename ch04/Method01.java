package ch04;

//�ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.
public class Method01 {

		int num=10;	//heap�� ���� (new �� ���� �޸𸮿� �ö���� ����)
		static int num3=30;	//static�� ����
		
		static void add() {
			System.out.println("add�Լ� ȣ���");
		}
		
		void sound() {
			System.out.println("sound�Լ� ȣ���");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2=20; //���ÿ� ����� ( �Լ��� ���ÿ� �ö󰡾� �޸𸮿� �߱� ����)
		Method01.add();
		Method01 m=new Method01();
		m.sound();
	}

}
