package ch05;

class ������{
	String name="������";
}

class �ѱ��� extends ������{
	String name="������";
}

class �λ��� extends �ѱ���{
	String name="�λ���";
}

public class Inherit02 {

	public static void main(String[] args) {
		// heap (�ѱ���, ������) -> ������ (������)
		������ b=new �ѱ���();
		
		//1. b�� �ѱ���(�ڽ�), ������(�θ�)�� �޸𸮿� �� �ֱ⶧����
		// �ٿ�ĳ���� ����
		�ѱ��� h=(�ѱ���)b;	//�ٿ�ĳ����
		
		try {
			�λ��� busan=(�λ���)b;
		} catch (Exception e) {
			//�����ڰ� �ڵ鸵 �� �� ����. (�α� ���� - ���� ����)
			System.out.println("���� �߻��ߴµ� �����ص� ��");
		}
		
	}

}
