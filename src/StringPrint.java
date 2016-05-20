import java.util.Scanner;

public class StringPrint {
	/* 문자열을 입력받고 출력 후 reverse 함수를 호출, 문자열을 다시 출력 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		char[] str = new char[input.length()];

		for (int index = 0; index < input.length(); index++) {
			str[index] = input.charAt(index);
		}
		reverse(str);
	}

	public static void reverse(char[] str) {
		for (int index = str.length - 1; index >= 0; index--) {
			System.out.print(str[index]);
		}
	}
}
