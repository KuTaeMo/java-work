package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{
	private int statusCode; //200(성공) ,300(다시 요청해) ,400(잘못된 요청)
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
