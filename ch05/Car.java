package ch05;

//�ҳ�Ÿ, ������ī, Ʈ��
public abstract class Car implements Control{
	Handle handle;
	
	@Override
	public void ����() {
		System.out.println("����");
		
	}
	@Override
	public void �극��ũ() {
		System.out.println("����");
		
	}
}