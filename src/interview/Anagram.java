package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public void solution(String A, String B) {
		int size = A.length();
		char[] arrA = new char[size];
		char[] arrB = new char[size];

		for (int idx = 0; idx < size; idx++) {
			arrA[idx] = A.charAt(idx);
			arrB[idx] = B.charAt(idx);
		}

		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		String result = "true";
		for (int idx = 0; idx < size; idx++) {
			if (arrA[idx] == arrB[idx])
				continue;
			else
				result = "false";
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		new Anagram().solution(A, B);
	}

}
