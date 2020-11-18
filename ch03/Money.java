package ch03;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력하세요!");
		final int money=sc.nextInt();
		int rMoney=money;
		int rCount=0;
		
		int[] arr= {50000,10000,1000,100,10,1};
		
		for(int i=0;i<6;i++) {
			rCount=rMoney/arr[i];
			rMoney=rMoney%arr[i];
			if(rCount!=0) {
				System.out.println(arr[i]+"원 "+rCount);
		}
	}
	}
}
