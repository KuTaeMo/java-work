package ch03;

import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.println("ö�� >>");
		String s1=sc.next();
		System.out.println("���� >>");
		String s2=sc.next();
		
		if(s1.equals("����") && s2.equals("����")) {
			System.out.println("�����ϴ�.");
		}
		if(s1.equals("����") && s2.equals("����")) {
			System.out.println("���� �̰���ϴ�.");
		}
		if(s1.equals("����") && s2.equals("��")) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		
		if(s1.equals("����") && s2.equals("����")) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		if(s1.equals("����") && s2.equals("����")) {
			System.out.println("�����ϴ�.");
		}
		if(s1.equals("����") && s2.equals("��")) {
			System.out.println("���� �̰���ϴ�.");
		}
		
		if(s1.equals("��") && s2.equals("����")) {
			System.out.println("���� �̰���ϴ�.");
		}
		if(s1.equals("��") && s2.equals("����")) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		if(s1.equals("��") && s2.equals("��")) {
			System.out.println("�����ϴ�.");
		}
	}
}