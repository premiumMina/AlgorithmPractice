import java.util.Scanner;

public class StringPrint {
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
