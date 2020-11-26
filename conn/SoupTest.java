package conn;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SoupTest {
	public static void main(String[] args) {
		Document doc=Jsoup.parse("안녕");
		System.out.println(doc);
	}
}
