package composite;

import lombok.Data;

//ÄÞÆ÷Áö¼Ç
@Data
public class BurgerSet {
	private Burger burger;
	private Potato potato;
	private Coke coke;
	
	public BurgerSet() {
		this(
				new Burger(),
				new Potato(),
				new Coke()
				);
	}

	public BurgerSet(Burger burger, Potato potato, Coke coke) {
		super();
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
}
