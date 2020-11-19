package composite;

import lombok.Data;

@Data
public class Burger {
	private int price;
	private String desc;
	
	public Burger() {
		this(1000,"기본버거");
	}
	
	public Burger(int price, String desc) {
		
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"가 만들어졌습니다.");
	}
}
