package review;

import lombok.Data;

// Ŀ���� �ڷ���
@Data //toString()�� �������̵� ��, Getter�� Setter�� �������.
class Product{
	private int no; //��ǰ��ȣ
	private int price; // ��ǰ����
	private String name; // ��ǰ�̸�
}

public class Ex04 {
	public static void main(String[] args) {
		// Ŭ���� �ڷ��� (�������� ������ Ÿ���� ���� ���� ��)
		Product p1=new Product();
		System.out.println(p1);
	}
}
