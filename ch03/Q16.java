package ch03;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		
		
		while(true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.println("가위 바위 보!>>");
			String ans=sc.next();
			int n=(int)(Math.random()*3);
			System.out.println(ans);
			//System.out.println(n);
			System.out.println(str[n]);
			
			if(ans=="가위") {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+",  비겼습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");
				}else {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");		
				}
			}else if(ans=="바위") {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+",  사용자가 이겼습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+", 비겼습니다.");
				}else {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");		
				}
			}else if(ans=="보") {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+",  사용자가 졌습니다.");
				}else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
				}else {
					System.out.println("사용자 = "+ans+" 컴퓨터 = "+str[n]+", 비겼습니다.");		
				}
			}else if(ans=="그만") {
				break;
			}
		}
	}

}
