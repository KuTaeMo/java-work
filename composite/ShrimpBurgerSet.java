package composite;

public class ShrimpBurgerSet {
	private ShrimpBurger sburger;
	private Potato potato;
	private Coke coke;
	
	public ShrimpBurgerSet() {
		this(new ShrimpBurger(),new Potato(),new Coke());
	}

	public ShrimpBurgerSet(ShrimpBurger sburger, Potato potato, Coke coke) {
		super();
		this.sburger = sburger;
		this.potato = potato;
		this.coke = coke;
	}
	
	
}
