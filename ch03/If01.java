package ch03;

public class If01 {

	public static void main(String[] args) {
		
		//표현식 - 라인에 걸리면 바로 실행된다.
		if(true) {
			System.out.println("true");
		}
		if(false) {
			System.out.println("실행안됨");
		}
		int num=0;
		if(num>1) {
			System.out.println("num은 1보다 큽니다.");
		}else { //그게 아니라면!!
			System.out.println("num은 1보다 작습니다.");
		}
		
		int sum=20;
		if(sum==10) {
			System.out.println("sum은 10입니다.");
		}else if(sum==20) {
			System.out.println("sum은 20입니다.");
		}else
			System.out.println("sum은 30입니다.");
	}

}
