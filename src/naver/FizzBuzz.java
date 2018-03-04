package naver;

public class FizzBuzz {

	public static void main(String[] args) {
		// 1~100, 3의 배수이면 Fizz, 5의 배수면 Buzz, 15배수이면 FizzBuzz
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			System.out.println(i);
		}
	}

}
