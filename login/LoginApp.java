package login;

//����ڰ� �α����� �� -> ���̽���, ���̹�
public class LoginApp {

	static void userinfo(OAuth o) {
		System.out.println(o.oauthProvider()+"�� �α����� ����ڴ�...");
		System.out.println(o.oauthId());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
	}
	
	public static void main(String[] args) {
		Facebook f=new Facebook(); //�α����ϸ� �ڵ����� �������
		userinfo(f);
		Naver n=new Naver();
		userinfo(n);
		Kakao k=new Kakao();
		userinfo(k);
	}

}
