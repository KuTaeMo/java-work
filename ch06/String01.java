package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO = Data Transfer Object = ��ſ��� ���� ����.
class UserDto{
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data="id:1,name:ȫ�浿";
		String a[]=data.split(",");
		
		String fid[]=a[0].split(":");
		String fname[]=a[1].split(":");
		
		//�Ľ� parsing(���� �м�)
		UserDto dto=new UserDto();
		dto.setId(Integer.parseInt(fid[1]));
		dto.setName(fname[1]);
		System.out.println(dto);
	}

}
