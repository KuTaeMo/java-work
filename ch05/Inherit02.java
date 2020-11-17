package ch05;

class 지구인{
	String name="지구인";
}

class 한국인 extends 지구인{
	String name="지구인";
}

class 부산인 extends 한국인{
	String name="부산인";
}

public class Inherit02 {

	public static void main(String[] args) {
		// heap (한국인, 지구인) -> 포인터 (지구인)
		지구인 b=new 한국인();
		
		//1. b는 한국인(자식), 지구인(부모)이 메모리에 다 있기때문에
		// 다운캐스팅 가능
		한국인 h=(한국인)b;	//다운캐스팅
		
		try {
			부산인 busan=(부산인)b;
		} catch (Exception e) {
			//개발자가 핸들링 할 수 있음. (로그 파일 - 오류 저장)
			System.out.println("오류 발생했는데 무시해도 돼");
		}
		
	}

}
