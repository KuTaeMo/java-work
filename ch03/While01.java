package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int check=0;
		
		//���� (Daemon Process) - �� ����
		//������ ��� �۵��ϴ� ��
		//
		while(check>=0) {
			int num=sc.nextInt();
			System.out.println("���� �� : "+num);
			
			check=num;
//			if(num<0) {
//				break;
//			}
		}System.out.println("����!");
	}

}
