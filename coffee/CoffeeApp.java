package coffee;

public class CoffeeApp {

	public static void main(String[] args) {
		Barista b1=new Barista();
		Customer c1=new Customer();
		
		//°í°´ => ¹Ù¸®½ºÅ¸ Çù·Â
		c1.order(b1);
	}

}
