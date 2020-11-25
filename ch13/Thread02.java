package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("새로운 스레드");
	}
}

public class Thread02 {

	public static void main(String[] args) {
		// 1. 스레드 객체 생성
		
		// 2. 타겟 설정
		
		// 3. 실행
		Thread t1=new Thread(new NewThread());
		t1.start();
		
		//NewThread 자체가 타겟이기 때문에 따로 타겟을 넣지 않는다!
		NewThread t2=new NewThread(); 
		t2.start();
	}
}
