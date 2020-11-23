package ch09;

public enum MyLayout {
	WEST("West","¼­ÂÊ"), 
	EAST("East"),
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	private MyLayout(String value,String value2) {
		this.value=value;
	}
	private MyLayout(String value) {
		this.value=value;
	}
}
