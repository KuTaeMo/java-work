package login;

public class Kakao implements OAuth{
	private String provider;
	private String id;
	private String password;
	private String name;
	
	public Kakao() {
		this("kakao","ssar@nate.com","1234","±úºÀ");
	}

	public Kakao(String provider, String id, String password, String name) {
		this.provider = provider;
		this.id = id;
		this.password = password;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return provider;
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
		return name;
	}
	
}
