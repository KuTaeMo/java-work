package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int check=0;
		
		//데몬 (Daemon Process) - 웹 서버
		//끝없이 계속 작동하는 것
		//
		while(check>=0) {
			int num=sc.nextInt();
			System.out.println("받은 값 : "+num);
			
			check=num;
//			if(num<0) {
//				break;
//			}
		}System.out.println("종료!");
	}

}
