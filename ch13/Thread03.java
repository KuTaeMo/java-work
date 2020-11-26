package ch13;

public class Thread03 {

	static int sum=0;
	
	static class NewThread implements Runnable{

		@Override
		public void run() {
			System.out.println("새로운 스레드 시작");
			for (int i = 1; i < 11; i++) {
				sum+=10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("새로운 스레드 끝");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		Thread t1=new Thread(new NewThread());
		t1.start();
		try {
			t1.join();//t1이 끝날 때까지 대기하는 코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		
		System.out.println("메인 스레드 종료");
	}
}
