package composite;

import lombok.Data;

@Data
public class Coke {
	private int price;
	private String desc;
	
	public Coke() {
		this(1000,"��ī�ݶ�");
	}
	
	public Coke(int price, String desc) {
		
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"�� ����������ϴ�.");
	}
}
