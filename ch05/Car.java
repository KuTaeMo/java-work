package ch05;

//소나타, 스포차카, 트럭
public abstract class Car implements Control{
	Handle handle;
	
	@Override
	public void 엑셀() {
		System.out.println("전진");
		
	}
	@Override
	public void 브레이크() {
		System.out.println("멈춤");
		
	}
}