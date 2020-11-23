package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Com{
	int id;
	String content;
}
public class Json01 {
	public static void main(String[] args) {
		
		Com c=new Com(1,"����");
		//�ڹ� -> JSON(String)
		System.out.println("�ڹ� -> JSON");
		Gson gson=new Gson();
		String cJson=gson.toJson(c);
		System.out.println(cJson);
		
		System.out.println();
		System.out.println("=================");
		System.out.println();
		
		//JSON -> �ڹ�
		System.out.println("JSON -> �ڹ�");
		Com c1=gson.fromJson(cJson, Com.class);
		System.out.println(c1);
	}
}