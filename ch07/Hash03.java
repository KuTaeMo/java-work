package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {

	public static void main(String[] args) {
		//�������� ���ڸ� �������ִ� Ŭ����
		Random r=new Random();
		
		ArrayList<Integer> lotto=new ArrayList<>();
		
		//�ǽ� : ���������� ���� ���� ������ �ߺ��� ������ ���� �ʱ�
		while(true) {
			int num=r.nextInt(45)+1;
			
			//���� ���� ���� ���� add�ϱ�
			boolean check=true;
			boolean parity=true;
			
			for (int i = 0; i < lotto.size(); i++) {
					check=(lotto.get(i)!=num);//���� ���� ������ false
				if(check==false) {	
					parity=false;
				}
			}
			if(parity&&check) {	//���� ���� ������ true�� ���ͼ� �߰�
				lotto.add(num);
			}else {
				continue;
			}
			
			if(lotto.size()==6)
				break;
		}
		
		Iterator<Integer> it=lotto.iterator();
		while(it.hasNext()) { //���� ������ true, ������ false
			System.out.print(it.next()+ " "); // ���� �ε����� ���� ���� + �ε��� ����
		}
		
		
	}
}