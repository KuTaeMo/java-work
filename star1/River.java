package star1;

class River extends StarUnit{
	//1. ����
	String name;
	int hp;
	int attack;
	
	//2. �ʱ�ȭ�� ���� ������ (���� x)
	public River(String n, int h, int a) {
		name=n;
		hp=h;
		attack=a;
	}
	
	//3. ����Ʈ �����ڸ� ���� ������ش�. 
	//( ���� : �����Ϸ��� �ȸ�����ִϱ� )
	public River() {
		
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
	
	//4. ������ ���� �����ϰų� Ȯ���ϴ� ������ �ʿ�!!
	
}
