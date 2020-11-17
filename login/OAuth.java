package login;

interface OAuth {
	public abstract String oauthProvider();
	public abstract String oauthId();
	public abstract String oauthPassword();
	public abstract String oauthNick();
}
