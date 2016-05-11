/**************************************************************
    Problem: 2604
    User: premiummina9401
    Language: Java
    Result: Success
    Time:125 ms
    Memory:9176 kb
****************************************************************/

import java.util.Scanner;

public class Bowl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.nextLine());
		int count = 10;
		for (int index = 0; index < s.length() - 1; index++) {
			if (s.charAt(index) == s.charAt(index + 1)) {
				count = count + 5;
			} else {
				count = count + 10;
			}
		}
		System.out.println(count);
	}
}