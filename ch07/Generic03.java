package ch07;

import java.util.Vector;

public class Generic03 {

	public static void main(String[] args) {
		//����ȭ(���� ������ �ִ�) �Ǿ��ִ� �Ӱ� ���� (���� ���� �Ұ���) critical section
		Vector<Integer> list1=new Vector<>();
		//���� ArrayList�� �Ȱ���.
		list1.add(100);
		list1.add(200);
		list1.add(1,300);
		
		System.out.println(list1.get(1));
	}
}
