import java.util.Scanner;

public class PrimeNumber {
	static int plusNum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i = start; i < end; i++) {
			if (count(i) == 0 && i != 1) {
				System.out.print(i + " ");
			}
		}
	}

	static int count(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return 1;
			}
		}
		return 0;
	}

}
