package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Conn01 {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			HttpsURLConnection conn=(HttpsURLConnection) url.openConnection();
		
			BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			String input=null;
			String download="";
			while((input=br.readLine())!=null) {
				download+=input;
			}
			
			FileWriter fw=new FileWriter("c:\\Temp\\index.html");
			fw.write(download);
			
			//String Ŭ������ �̿��Ͽ� ��Ÿ����
//			String[] x=download.split("num");
//			String[] y=x[1].split(">");
//			String[] a=y[1].split("<");
//			System.out.println(a[0]);
			//int num=Integer.parseInt(a[0]);
			
			//jsoup ���̺귯�� ����Ͽ� ��Ÿ����
			Document doc=Jsoup.parse(download);
			Elements temp=doc.select(".num");
			
			
			//System.out.println("오늘의 미세먼지 수치는 "+num+" 입니다.");
			System.out.println("오늘의 미세먼지 수치는 "+temp.text()+" 입니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
