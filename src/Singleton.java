/*
 * 싱글톤 클래스
 */
public class Singleton {
	// 처음부터 객체를 생성
	private static Singleton uniqueInstance;

	// 접근지정자
	private Singleton() {
	}
	
	/*
	 * 동기화를 위해 synchronized 키워 사용
	 */
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// 기타 메서드가 존재해도 된다

	public static void main(String[] args) {
		// 싱글톤 객체를 생성하려고 한다
		Singleton.getInstance();
	}
}