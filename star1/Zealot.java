package star1;

class Zealot extends StarUnit{
	String name;
	int hp;
	int attack;
	
	//규칙 : 클래스를 생성하면 무조건 초기화를 위한 생성자를 만든다.
	public Zealot(String n, int h, int a) {
		name=n;
		hp=h;
		attack=a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}
