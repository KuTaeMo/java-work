package review;

//����� �����͸� �����ִ� ���� ������ �ƴϴ�.
// �����͸� �����ְ� ������ ���������ϸ� �ȴ�.
// ����� �ϴ� ������ �������� ����. Ÿ���� ��ġ��Ű���� ��!!

abstract class ����{
	void start() {
}
}
class �������� extends ����{
	void start() {
		System.out.println("�������� ���");
	}
}

class ����å�� extends ����{
	void start() {
		System.out.println("����å�� ���");
	}
}


public class Ex11 {
//	static void use(����å�� u) {
//		u.start();
//	}
//	//�����ε�(������)
//	static void use(�������� u) {
//		u.start();
//	}
	static void use(���� u) {
		u.start();
	}
	public static void main(String[] args) {
		use(new ����å��());
		use(new ��������());
	}
}
