package ch03;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]= {"����","����","��"};
		
		
		while(true) {
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.println("���� ���� ��!>>");
			String ans=sc.next();
			int n=(int)(Math.random()*3);
			System.out.println(ans);
			//System.out.println(n);
			System.out.println(str[n]);
			
			if(ans=="����") {
				if(str[n].equals("����")) {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+",  �����ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+", ����ڰ� �����ϴ�.");
				}else {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");		
				}
			}else if(ans=="����") {
				if(str[n].equals("����")) {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+",  ����ڰ� �̰���ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+", �����ϴ�.");
				}else {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+", ����ڰ� �����ϴ�.");		
				}
			}else if(ans=="��") {
				if(str[n].equals("����")) {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+",  ����ڰ� �����ϴ�.");
				}else if(str[n].equals("����")) {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
				}else {
					System.out.println("����� = "+ans+" ��ǻ�� = "+str[n]+", �����ϴ�.");		
				}
			}else if(ans=="�׸�") {
				break;
			}
		}
	}

}
