package test;

import ch05.BlueCloth;
import ch05.Factory;
import ch05.RedCloth;

//protected�� ���� ��Ű�� + �ڽĸ� ���
public class FactoryApp {

	public static void main(String[] args) {
		Factory f1=new BlueCloth();
		//f1.��ĥ(); //�������ε�
		//f1.����(); 
		
		//������ Ʋ�� ���� �ֱ� ������
		//������ �̸� ������ �޼ҵ带 ���!
		f1.����();
		
		Factory f2=new RedCloth();
		f2.����();
	}
}