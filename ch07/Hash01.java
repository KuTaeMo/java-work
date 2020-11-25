package ch07;

import java.util.HashMap;

public class Hash01 {

	public static void main(String[] args) {
		//해쉬맵은 key, value로 값을 입력할 수 있음
		//찾을 때는 key값으로 찾을 수 있음
		HashMap<String, String> hash=new HashMap<>();
		
		hash.put("name", "홍길동");
		hash.put("username", "ssar");
		hash.put("phone", "01022227777");
		
		System.out.println(hash.get("phone"));
		System.out.println(hash.containsKey("name"));
		System.out.println(hash.containsValue("홍길동"));
	}
}