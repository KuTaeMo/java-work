package ch03;

import java.util.Scanner;

public class Q3 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n8;
	int n7;
	int n6;
	int n5;
	int n4;
	int n3;
	int n2;
	int n1;
	
	System.out.println("�ݾ��� �Է��Ͻÿ� : ");
	int num=sc.nextInt();
	n8=num/50000;
	num-=n8*50000;
	
	n7=num/10000;
	num-=n7*10000;
	
	n6=num/1000;
	num-=n6*1000;
	
	n5=num/500;
	num-=n5*500;
	
	n4=num/100;
	num-=n4*100;
	
	n3=num/50;
	num-=n3*50;
	
	n2=num/10;
	num-=n2*10;
	
	n1=num/1;
	
	if(n8!=0) {
		System.out.println("�������� "+n8+"��");
	}
	if(n7!=0) {
		System.out.println("������ "+n7+"��");
	}
	if(n6!=0) {
		System.out.println("õ���� "+n6+"��");
	}
	if(n5!=0) {
		System.out.println("������� "+n5+"��");
	}
	if(n4!=0) {
		System.out.println("��� "+n4+"��");
	}
	if(n3!=0) {
		System.out.println("���ʿ��� "+n3+"��");
	}
	if(n2!=0) {
		System.out.println("�ʿ� "+n2+"��");
	}
	if(n1!=0) {
		System.out.println("�Ͽ� "+n1+"��");
	}
}
}
