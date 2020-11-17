package star1;

class Darktempler extends StarUnit{
	private String name;
	private int hp;
	private int attack;
	
	public Darktempler(String n, int h, int a) {
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
