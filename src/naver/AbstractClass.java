package naver;

abstract class AbstractClass {
	int x, y;

	public void basicFunc(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void abstractFunc();
}
