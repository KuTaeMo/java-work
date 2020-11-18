package ch03;

import java.io.IOException;
import java.io.InputStream;

public class Input02 {

	public static void main(String[] args) {
		// I/O 장치 중에 input되는 장치의 선에 접근해서
		// 1Byte 데이터를 읽어주는 클래스
		InputStream in=System.in; //컴퓨터로 입력되는 선 (키보드)
		
		try {
			int num=in.read();
			System.out.println("입력받은 값 : "+num);
			System.out.println((char)num);
		} catch (IOException e) {
			System.out.println("괜찮아");
		}
	}

}
