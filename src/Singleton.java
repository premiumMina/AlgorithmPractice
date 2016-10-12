/*
 * 싱글톤 클래스
 */
public class Singleton {
	// 처음부터 객체를 생성
	private volatile static Singleton uniqueInstance = new Singleton();

	// 접근지정자
	private Singleton() {
	}

	/*
	 * 객체가 있는지 확인한 후, 동기화 블럭에 들어간다 처음에만 동기화되도록 작
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;
	}

	// 기타 메서드가 존재해도 된다

	public static void main(String[] args) {
		// 싱글톤 객체를 생성하려고 한다
		Singleton.getInstance();
	}
}