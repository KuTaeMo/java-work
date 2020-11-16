package star1;

public class Marine {
	//멤버변수 : 필드 : heap변수 : 전역변수 : 속성 : 프로퍼티 /field : property
	//는 private로 만든다. 마법 x
	private String name;
	private int hp;
	private int attack;
	
	//this는 heap을 가리킨다.
Marine(String name, int hp, int attack) {
		this.name = name;	//this를 붙이면 heap 변수
		this.hp = hp;
		this.attack = attack;
	}
	public Marine() {
		// TODO Auto-generated constructor stub
	}
}
