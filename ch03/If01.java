package ch03;

public class If01 {

	public static void main(String[] args) {
		
		//ǥ���� - ���ο� �ɸ��� �ٷ� ����ȴ�.
		if(true) {
			System.out.println("true");
		}
		if(false) {
			System.out.println("����ȵ�");
		}
		int num=0;
		if(num>1) {
			System.out.println("num�� 1���� Ů�ϴ�.");
		}else { //�װ� �ƴ϶��!!
			System.out.println("num�� 1���� �۽��ϴ�.");
		}
		
		int sum=20;
		if(sum==10) {
			System.out.println("sum�� 10�Դϴ�.");
		}else if(sum==20) {
			System.out.println("sum�� 20�Դϴ�.");
		}else
			System.out.println("sum�� 30�Դϴ�.");
	}

}
