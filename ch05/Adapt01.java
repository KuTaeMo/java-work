package ch05;

interface Knife{
	void �丮();
	void ����(); 
	//default void ����(){}; ��ü �����ϴ� ��� �ڽĿ��� �Ƚᵵ ��!
	//default�� �������� ����� �Ǽ��� �� �����Ƿ� ��õ���� ����!
}
//adapter - �������̽��� ������� �޼ҵ� �ɷ����� ���� ��!
//����� �뵵 - ���������� �丮�� �Ѱ��ְ� ���ظ� �ɷ���
abstract class �丮��Adapter implements Knife{
	public void ����() {};
}
class ������ extends �丮��Adapter{

	@Override
	public void �丮() {
		// TODO Auto-generated method stub
	}
}
public class Adapt01 {
	public static void main(String[] args) {
	}
}