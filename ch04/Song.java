package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	
	public static void main(String[] args) {
		Song s=new Song("Dancing Queen","ABBA",1978,"스웨덴");
		s.show();
	}

}
