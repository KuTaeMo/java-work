package star1;

//1. Zealot, Dragoon, Tank, Scv, DarkTempler => StarUnit ��ġ

public class Star3App {
	public static void attack(StarUnit u1,StarUnit u2) {
		System.out.println(u1.getName()+" -> " +u2.getName()+ " ����");
		//��� ����x
		if(u2.getHp()>0) {
			u2.setHp(u2.getHp()-u1.getAttack());
			//���
			if(u2.getHp()>0) 
				System.out.println(u2.getName()+" ü�� : "+u2.getHp() );
			else if(u2.getHp()<=0) {
				System.out.println(u2.getName()+" ü�� : "+u2.getHp() );
				System.out.println(u2.getName()+" ���");
			}
		}
		else if(u2.getHp()<=0)
			System.out.println("�̹� ����Ͽ� ������ �� �����ϴ�!");
		System.out.println("===============");
	}
	public static void main(String[] args) {
		Zealot z1=new Zealot("����1",100,10);
		Dragoon d1=new Dragoon("���1",100,10);
		Marine m1=new Marine("����1",100,5);
		Darktempler dt1=new Darktempler("��ũ���÷�1",100,50);
		River r1=new River("����1",100,60);
		Tank t1=new Tank("��ũ1",100,80);
		Scv scv1=new Scv("SCV1",100,3);
		
		attack(d1,z1);
		attack(d1,m1);
		attack(t1, r1);
		attack(r1, t1);
		attack(r1, dt1);
		attack(scv1, m1);
		attack(t1, r1);
		attack(dt1,t1);
		attack(dt1,t1);
	}
}
