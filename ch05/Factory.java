package ch05;

public abstract class Factory {
	protected abstract void 색칠();
	protected void 건조() {
		System.out.println("건조완료!");
	}
	public void 가동() {
		색칠();
		건조();
	}
}
