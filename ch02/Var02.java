package ch02;

public class Var02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;		//4Byte - 32 Bit -42�� 9õ (-20�� ~ 20��)
		long num2=100;		//8Byte
		
		char s='��'; //2Byte
		
		double d=7.5;	//8Byte �߰� �Ҽ��� ����
		
		boolean b=true; //1bit
		
		num=(int)d;  //����� ����ȯ (�ٿ�ĳ���� - �ڷ�����)  //7
		
		num=(int)num2; //����� ����ȯ (�ٿ�ĳ����)
		
		num2=num; //������ ����ȯ (��ĳ����)
	}

}
