package review;

public class Ex08 {
	//void ������ ����. add�� �����̸�, ()�� �Լ���� ��
	// in n1, int n2 �Ű����� (arguments)
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	int minus(int n1, int n2) {
		return n1-n2; // �Լ��� ȣ���� ������ ���� n1-n2�� �����. 
	}
	public static void main(String[] args) {
				Ex08 e=new Ex08();
				//3, 6�� �μ���� �θ�.
				e.add(3, 6); // �Լ��� ȣ�� (13�� ���ο��� 7�� ���� ���� �� �ٽ� 13�� �������� ���ƿ�)
				int result=e.minus(10, 5);
				System.out.println("result :"+result);
	}
}
