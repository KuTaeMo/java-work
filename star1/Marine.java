package star1;

public class Marine {
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
}
