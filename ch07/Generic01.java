package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{
	private int statusCode; //200(����) ,300(�ٽ� ��û��) ,400(�߸��� ��û)
	private T data;
}

public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<Integer> dto=new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());

		if(dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}
}
