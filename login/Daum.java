package login;

public class Daum implements OAuth{
	private String provider;
	private String id;
	private String password;
	private String nick;
	
	public Daum() {
		this("Daum","ssar@daum.net","1234","¥Ÿ¿Ω");
	}

	public Daum(String provider, String id, String password, String nick) {
		super();
		this.provider = provider;
		this.id = id;
		this.password = password;
		this.nick = nick;
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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
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
		return nick;
	}
	
	
}
