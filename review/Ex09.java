package review;

public class Ex09 {
	
	//스택 :함수마다 가지고 있음
	// 오픈 : 함수의 호출 시
	void add() { // 함수 내부 중괄호 내부 = {} = stack이 오픈된다고 함.
		int n1=10; // add() 함수 stack 4Byte가 할당됨.
	} // 함수 종료 => 점프 후 복귀 = stack이 사라짐. = 변수가 지역적 =지역변수
	
	public static void main(String[] args) {
		Ex09 e=new Ex09();
		e.add(); //n1이 메모리에 떠있음.
	}
}
