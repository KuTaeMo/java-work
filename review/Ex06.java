package review;

public class Ex06 {
	public static void main(String[] args) {
		int n1=100;
		
		//���� : ���� �����Ͱ� ū ������ ���� ���̱� ������ ����
		double n2=n1; // �� ĳ���� (������ ����ȯ)
		
		double n3=10.5;
		// ���� : ū �����Ͱ� ���� ������ ���� ���̱� ������ �ٿ� ĳ���� �ʿ�
		// Ư¡ : �� �����Ͱ� ���ǵ� �� ����.
		int n4=(int)n3; // �ٿ� ĳ���� (����� ����ȯ)
		System.out.println(n4); //10    .5�� ���ư� (������ ����)
	}
}
