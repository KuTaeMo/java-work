package ch04;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="�ֽ���";
		p1.job="�ǻ�";
		p1.age=45;
		p1.gender='��';
		p1.blood="A";
		
		p1.preview();
		
		Person p2=new Person();
		p2.name="�̹̳�";
		p2.job="���� ����";
		p2.age=28;
		p2.gender='��';
		p2.blood="O";
		
		p2.preview();
		
		Person p3=new Person();
		p3.name="��̳�";
		p3.job="����";
		p3.age=47;
		p3.gender='��';
		p3.blood="AB";
		
		p3.preview();
	}

}
