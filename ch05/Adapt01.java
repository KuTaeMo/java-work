package ch05;

interface Knife{
	void 요리();
	void 상해(); 
	//default void 상해(){}; 몸체 구현하는 대신 자식에서 안써도 됨!
	//default는 강제성이 사라져 실수할 수 있으므로 추천하지 않음!
}
//adapter - 인터페이스의 쓸모없는 메소드 걸러내기 위한 것!
//어댑터 용도 - 백종원에게 요리만 넘겨주고 상해를 걸러냄
abstract class 요리사Adapter implements Knife{
	public void 상해() {};
}
class 백종원 extends 요리사Adapter{

	@Override
	public void 요리() {
		// TODO Auto-generated method stub
	}
}
public class Adapt01 {
	public static void main(String[] args) {
	}
}