package ch02;

public class Var02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;		//4Byte - 32 Bit -42억 9천 (-20억 ~ 20억)
		long num2=100;		//8Byte
		
		char s='가'; //2Byte
		
		double d=7.5;	//8Byte 추가 소수점 이하
		
		boolean b=true; //1bit
		
		num=(int)d;  //명시적 형변환 (다운캐스팅 - 자료유실)  //7
		
		num=(int)num2; //명시적 형변환 (다운캐스팅)
		
		num2=num; //묵시적 형변환 (업캐스팅)
	}

}
