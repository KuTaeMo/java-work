package star1;

public class Marine extends StarUnit{
	//������� : �ʵ� : heap���� : �������� : �Ӽ� : ������Ƽ /field : property
	//�� private�� �����. ���� x
	private String name;
	private int hp;
	private int attack;
	
	//this�� heap�� ����Ų��.
Marine(String name, int hp, int attack) {
		this.name = name;	//this�� ���̸� heap ����
		this.hp = hp;
		this.attack = attack;
	}
	public Marine() {
		// TODO Auto-generated constructor stub
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
