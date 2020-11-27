package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketPrac {
	public static void main(String[] args) throws IOException {
		BufferedReader in=null;
		BufferedWriter out=null;
		ServerSocket listener=null;
		Socket socket=null;
		Scanner scanner=new Scanner(System.in);
		try {
			listener=new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�....");
			socket=listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage=in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ :"+inputMessage);
				System.out.println("������ >>");
				String outputMessage=scanner.nextLine();
				out.write(outputMessage+"\n");
				out.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻�");
			}
		}
	}
}
