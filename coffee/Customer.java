package coffee;

//��
//å�� : �ֹ�(), �Ա�()
public class Customer {

	public void order(Barista b1) {
		//�ٸ���Ÿ���� �޽����� ����
		Coffee c=b1.makeCoffee();
		System.out.println(c.getName()+"�� ���Խ��ϴ�.");
	}
	
}
