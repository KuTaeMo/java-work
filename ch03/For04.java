package ch03;

public class For04 {

	public static void main(String[] args) {
		// 1��
		System.out.println("�� ����� 1��");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2��
		System.out.println("�� ����� 2��");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//3��
		System.out.println("�� ����� 3��");
		for (int i = 0; i < 2; i++) {
			for (int j = 2; j >i+1; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("  *");
		
		
	}

}
