package ch02;

//heap
class Zealot{
	String name="����";
	int attack=10;
	int armor=5;
	
	static int hp=100;
}
public class Var08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z = new Zealot(); //heap�� ����
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2=new Zealot();
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack=50;
		
		System.out.println("��ȭ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp=50; //Zealot.hp
		
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		//���� ���׷��̵�
		z.attack=11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}//end of main

}
