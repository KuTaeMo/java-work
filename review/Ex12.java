package review;

//tv 4�� �Ｚ, LG, ���, �Ϸ�Ʈ��

//������ �ο�
//����ڿ��� ���� �������̽� ����
interface Remocon{
	void change();
}
class SamsungRemocon implements Remocon{

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ä�κ���");
	}
	
}

class LGRemocon implements Remocon{

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("���� ä�κ���");
	}
	
}
public class Ex12 {
	
	static void ä�κ���(Remocon r) {
		r.change();
	}
	public static void main(String[] args) {
		ä�κ���(new SamsungRemocon());
		ä�κ���(new LGRemocon());
		
		//�͸�Ŭ����
		Remocon r=new Remocon() {
			
			@Override
			public void change() {
				System.out.println("�ȳ�");
				
			}
		};
		r.change();
	}
}
