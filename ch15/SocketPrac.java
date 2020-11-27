package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketPrac {
	public static void main(String[] args) throws IOException {
		BufferedReader in=null;
		BufferedWriter out=null;
		Socket socket=null;
		Scanner scanner=new Scanner(System.in);
		try {
			socket=new Socket("localhost",9999);
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("보내기 >>");
				String outputMessage=scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage+"\n");
				out.flush();
				String inputMessage=in.readLine();
				System.out.println("서버 : "+inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket!=null) socket.close();
			} catch (Exception e2) {
				System.out.println("오류");
			}
		}
		
	}
}
