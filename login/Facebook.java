package login;

public class Facebook implements OAuth{
	private String provider;
	private String email;
	private String password;
	private String username;
	
	public Facebook() {
		this("facebook","ssar@nate.com","1234","±úºÀ");
	}

	public Facebook(String provider, String email, String password, String username) {
		this.provider = provider;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String oauthId() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String oauthPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String oauthNick() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public String oauthProvider() {
		// TODO Auto-generated method stub
		return provider;
	}
}