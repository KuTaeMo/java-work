package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in=System.in;	//아스키코드로 받음
		InputStreamReader ir=new InputStreamReader(in);	//1바이트만 받음
		BufferedReader br=new BufferedReader(ir);	//버퍼에 담아서 여러 문자 담아줌
		
		try {
			String data=br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
