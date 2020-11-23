package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	private int id;//��ȣ 1,2,3,4
	private String text; //���� �޽��� ����
	private String to;
	private int errorCode;
	private String sendTime;
}
