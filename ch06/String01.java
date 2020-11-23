package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO = Data Transfer Object = 통신에서 많이 사용됨.
class UserDto{
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data="id:1,name:홍길동";
		String a[]=data.split(",");
		
		String fid[]=a[0].split(":");
		String fname[]=a[1].split(":");
		
		//파싱 parsing(구문 분석)
		UserDto dto=new UserDto();
		dto.setId(Integer.parseInt(fid[1]));
		dto.setName(fname[1]);
		System.out.println(dto);
	}

}
