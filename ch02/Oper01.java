package ch02;

public class Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1+1);	//����
		System.out.println(1+"1");//����
		
		int num=10;
		String s="5";
		
		String sum=num+s;	//Ÿ���� String���� ��. int �ȵ�
		System.out.println(sum);
		
		System.out.println(10-5);
		
		System.out.println(10/3); //Ÿ���� int�� ��
		System.out.println(10.0/3);//Ÿ���� double�� ��
		System.out.println(10%3);//������ ���ϱ�
		System.out.println(10*3);//���ϱ�
	}

}
