package review;

//�ڹٴ� �Լ��� ���� ���� ����.
//���ϱ� �Լ��� ����� ���� -> ���ϱ� �Լ� ������� Ŭ������ �ʿ���.

interface A{
	void add();
}

public class Ex121 {
	public static void main(String[] args) {
		
		//�������̽��� �͸�Ŭ����(�Լ������Ǿ����)�� ���� �� �ִ�.
		new A() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("���ϱ�");
			}
		}.add();
	}
}
