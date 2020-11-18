package ch03;

public class For04 {

	public static void main(String[] args) {
		// 1번
		System.out.println("별 만들기 1번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//2번
		System.out.println("별 만들기 2번");
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
		
		//3번
		System.out.println("별 만들기 3번");
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
