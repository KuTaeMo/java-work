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
	
	System.out.println("금액을 입력하시오 : ");
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
		System.out.println("오만원권 "+n8+"매");
	}
	if(n7!=0) {
		System.out.println("만원권 "+n7+"매");
	}
	if(n6!=0) {
		System.out.println("천원권 "+n6+"매");
	}
	if(n5!=0) {
		System.out.println("오백원권 "+n5+"매");
	}
	if(n4!=0) {
		System.out.println("백원 "+n4+"개");
	}
	if(n3!=0) {
		System.out.println("오십원권 "+n3+"개");
	}
	if(n2!=0) {
		System.out.println("십원 "+n2+"개");
	}
	if(n1!=0) {
		System.out.println("일원 "+n1+"개");
	}
}
}
