package ch04;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		int num=0;
		num=cal.add(10, 5);
		num=cal.multi(num,20);
		num=cal.divid(num, 5);
		num=cal.minus(num, 100);
		System.out.println("결과 값은 : "+num);
	}

}
