/*
 * 싱글톤 클래스
 */
public class Singleton {

	// 싱글톤 클래스의 유일한 객체를 저장하기 위한 정적 변수
	private static Singleton uniqueInstance;

	// 접근지정자
	private Singleton() {
	}

	// 싱글톤 클래스의 객체가 이미 있다면 그 객체를 이용하고 아니면 생성
	public static Singleton getInstance() {
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
