package ch03;

public class Gugudan01 {

	public static void main(String[] args) {
		//������ 2���� ����ϴ� ���α׷� ������ּ���!!
		//2*1=2
		//2*2=4
		
		int n1=1;

		//n1++;
		
		for (n1= 2; n1 < 10; n1++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(n1+"*"+i+"="+(n1*i));
			}
			System.out.println();
		}
	}
}
