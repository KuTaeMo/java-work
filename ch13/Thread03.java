package ch13;

public class Thread03 {

	static int sum=0;
	
	static class NewThread implements Runnable{

		@Override
		public void run() {
			System.out.println("���ο� ������ ����");
			for (int i = 1; i < 11; i++) {
				sum+=10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("���ο� ������ ��");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		Thread t1=new Thread(new NewThread());
		t1.start();
		try {
			t1.join();//t1�� ���� ������ ����ϴ� �ڵ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		
		System.out.println("���� ������ ����");
	}
}
