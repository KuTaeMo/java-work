package ch02;

//자바는 .class파일을 실행하면 static 부분을 메모리에 로드한다.(static 공간)
//static 공간에 있는 main() 함수를 찾아서 호출하고
// 이 때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
//main이 stack 종료되면 프로그램 종료!!
public class Var01 {

	public static void main(String[] args) {
		// Code부분
		//이제부터 모든 코드는 여기에 적는다.
		System.out.println("첫번째");
		System.out.println("두번째");
	}//end of main

}
