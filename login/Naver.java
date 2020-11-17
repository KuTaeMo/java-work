package login;

public class Naver implements OAuth{
	private String provider;
	private String id;
	private String password;
	private String nickName;
	
	public Naver() {
		this("naver","ssar@nate.com","1234","±úºÀ");
	}

	public Naver(String provider, String id, String password, String nickName) {
		this.provider = provider;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}

	public String getProvider() {
		return provider;
	}


	public void setProvider(String provider) {
		this.provider = provider;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return nickName;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return provider;
	}
	
	
}
