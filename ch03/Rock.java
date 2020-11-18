package ch03;

import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.println("철수 >>");
		String s1=sc.next();
		System.out.println("영희 >>");
		String s2=sc.next();
		
		if(s1.equals("가위") && s2.equals("가위")) {
			System.out.println("비겼습니다.");
		}
		if(s1.equals("가위") && s2.equals("바위")) {
			System.out.println("영희가 이겼습니다.");
		}
		if(s1.equals("가위") && s2.equals("보")) {
			System.out.println("철수가 이겼습니다.");
		}
		
		if(s1.equals("바위") && s2.equals("가위")) {
			System.out.println("철수가 이겼습니다.");
		}
		if(s1.equals("바위") && s2.equals("바위")) {
			System.out.println("비겼습니다.");
		}
		if(s1.equals("바위") && s2.equals("보")) {
			System.out.println("영희가 이겼습니다.");
		}
		
		if(s1.equals("보") && s2.equals("가위")) {
			System.out.println("영희가 이겼습니다.");
		}
		if(s1.equals("보") && s2.equals("바위")) {
			System.out.println("철수가 이겼습니다.");
		}
		if(s1.equals("보") && s2.equals("보")) {
			System.out.println("비겼습니다.");
		}
	}
}