package ch04;

class Person1{
	String name="";
	String getName() {
		return name;
	}
}

class Police extends Person1{
	String name="°æÂû";
	
	String getName() {
		return name;
	}
}
class Doctor extends Person1{
	String name="ÀÇ»ç";
	String getName() {
		return name;
	}
}

public class Array02 {
	public static void main(String[] args) {
		Person1[] p=new Person1[2];
		p[0]=new Police();
		p[1]=new Doctor();
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName());
		}
	}
}
