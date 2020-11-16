package ch04;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="ÃÖ½ÂÈñ";
		p1.job="ÀÇ»ç";
		p1.age=45;
		p1.gender='¿©';
		p1.blood="A";
		
		p1.preview();
		
		Person p2=new Person();
		p2.name="ÀÌ¹Ì³à";
		p2.job="°ñÇÁ ¼±¼ö";
		p2.age=28;
		p2.gender='¿©';
		p2.blood="O";
		
		p2.preview();
		
		Person p3=new Person();
		p3.name="±è¹Ì³²";
		p3.job="±³¼ö";
		p3.age=47;
		p3.gender='³²';
		p3.blood="AB";
		
		p3.preview();
	}

}
