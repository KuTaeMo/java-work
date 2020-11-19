package composite;

public class LotteriaApp {

	public static void main(String[] args) {
		Burger b1=new Burger();
		Potato p1=new Potato();
		Coke c1=new Coke();
		System.out.println();
		
		BurgerSet bs1=new BurgerSet();
		System.out.println();
		
		Burger bbg1=new BigBurger();
		System.out.println();
		
		ShrimpBurger sb1=new ShrimpBurger();
		System.out.println();
		ShrimpBurgerSet sbs1=new ShrimpBurgerSet();
	}
}