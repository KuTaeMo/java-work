package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in=System.in;	//�ƽ�Ű�ڵ�� ����
		InputStreamReader ir=new InputStreamReader(in);	//1����Ʈ�� ����
		BufferedReader br=new BufferedReader(ir);	//���ۿ� ��Ƽ� ���� ���� �����
		
		try {
			String data=br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
