package ch03;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num=sc.nextInt();
		int num10=0;
		int num1=0;
		
		if(num>=10) {
			num10=num/10;
			num1=num%10;
			if(num10==3||num10==6||num10==9) {
				if(num1==3||num1==6||num1==9) {
					System.out.println("�ڼ�¦¦");
				}else if(num1!=3||num1!=6||num1!=9){
					System.out.println("�ڼ�¦");
				}
			}else if(num10!=3||num10!=6||num10!=9) {
				if(num1==3||num1==6||num1==9) {
					System.out.println("�ڼ�¦");
				}
			}
		}else if(num<10) {
			num1=num;
			if(num1==3||num1==6||num1==9) {
				System.out.println("�ڼ�¦¦");
			}
		}else if(num<0) {
			System.out.println("���ڴ� 1~99 ���̸� �Է��ϼ���!");
		}
	}
}
