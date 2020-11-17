package star1;

//1. Zealot, Dragoon, Tank, Scv, DarkTempler => StarUnit 일치

public class Star3App {
	public static void attack(StarUnit u1,StarUnit u2) {
		System.out.println(u1.getName()+" -> " +u2.getName()+ " 공격");
		//사망 공격x
		if(u2.getHp()>0) {
			u2.setHp(u2.getHp()-u1.getAttack());
			//사망
			if(u2.getHp()>0) 
				System.out.println(u2.getName()+" 체력 : "+u2.getHp() );
			else if(u2.getHp()<=0) {
				System.out.println(u2.getName()+" 체력 : "+u2.getHp() );
				System.out.println(u2.getName()+" 사망");
			}
		}
		else if(u2.getHp()<=0)
			System.out.println("이미 사망하여 공격할 수 없습니다!");
		System.out.println("===============");
	}
	public static void main(String[] args) {
		Zealot z1=new Zealot("질럿1",100,10);
		Dragoon d1=new Dragoon("드라군1",100,10);
		Marine m1=new Marine("마린1",100,5);
		Darktempler dt1=new Darktempler("다크템플러1",100,50);
		River r1=new River("리버1",100,60);
		Tank t1=new Tank("탱크1",100,80);
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
