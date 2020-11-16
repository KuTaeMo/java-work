package star1;

//오버로딩 : 함수의 이름이 같아도 매개변수의 개수, 타입이 다르면
// 다른 함수로 인식한다. (과적재)
public class Star1App {
	
	//질럿->드라군
	static void attack(Zealot u1, Dragoon u2) {
		System.out.println(u1.name+" -> " +u2.name+ " 공격");
		u2.hp=u2.hp-u1.attack; //90
		System.out.println(u2.name+" 체력 : "+u2.hp );
		System.out.println();
	}
	
	//드라군->질럿
	static void attack(Dragoon u1, Zealot u2) {
		System.out.println(u1.name+" -> " +u2.name+ " 공격");
		u2.hp=u2.hp-u1.attack; //90
		System.out.println(u2.name+" 체력 : "+u2.hp );
		System.out.println();
	}
	
	//드라군1 -> 드라군2
	static void attack(Dragoon u1, Dragoon u2) {
		System.out.println(u1.name+" -> " +u2.name+ " 공격");
		u2.hp=u2.hp-u1.attack; //90
		System.out.println(u2.name+" 체력 : "+u2.hp );
		System.out.println();
	}
	
	//다크템플러 -> 질럿
	static void attack(Darktempler u1, Zealot u2) {
		System.out.println(u1.name+" -> " +u2.name+ " 공격");
		u2.hp=u2.hp-u1.attack; //90
		System.out.println(u2.name+" 체력 : "+u2.hp );
		System.out.println();
	}
	
	//다크템플러 -> 드라군
	static void attack(Darktempler u1, Dragoon u2) {
		System.out.println(u1.name+" -> " +u2.name+ " 공격");
		u2.hp=u2.hp-u1.attack; //90
		System.out.println(u2.name+" 체력 : "+u2.hp );
		System.out.println();
	}
	
	public static void main(String[] args) {
		Zealot z1=new Zealot("질럿1",100,10);
		Dragoon d1=new Dragoon("드라군1",100,20);
		Dragoon d2=new Dragoon("드라군2",100,20);
		Darktempler t1=new Darktempler("다크템플러1",100,50);
		Darktempler t2=new Darktempler("다크템플러2",100,50);
		
		//1. 질럿1->드라군1 공격
		attack(z1,d1);
		
		//2. 드라군1->질럿1 공격
		attack(d1,z1);
		
		//3. 드라군1->드라군2 공격
		attack(d1,d2);
		
		//4. 다크템플러1 -> 질럿1 공격 (다크템플러1,100,50)
		attack(t1,z1);
		
		//5. 다크템플러2 -> 드라군1 공격
		attack(t2,d1);
	}

}
