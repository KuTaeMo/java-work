package ch03;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 3개 입력 >> ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int tmp=0;
		
		if (n1>n2) {
			if(n1>n3) {
				if(n2>n3) {
					tmp=n2;
				}else {
					tmp=n3;
				}
			}else if(n1<n3) {
				tmp=n1;
			}
		}else if(n1<n2) {
			if(n2>n3) {
				if(n1>n3) {
					tmp=n1;
				}else if(n1<n3) {
					tmp=n3;
				}
			}else if(n2<n3) {
				tmp=n2;
			}
		}
		System.out.println("중간 값은 "+tmp);
	}

}
