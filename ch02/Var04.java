package ch02;

public class Var04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 여러개 1,2,3
		int n1=1;
		int n2=2;
		int n3=3;
		
		//숫자 여러개 1,2,3 //연속적이라 액세스가 빠르다 // 추가,제거 불가능
		int[] n= {1,2,3};
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		char[] c= {'가','나','다'};
		
		for(int i=0;i<3;i++) {
			System.out.println(c[i]);
		}
	}//end of main

}
