/**************************************************************
    Problem: 1402
    User: premiummina9401
    Language: Java
    Result: Success
    Time:177 ms
    Memory:9468 kb
****************************************************************/

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		if (N >= 1 && N <= 10000) {
			for (int index = 1; index <= N; index++) {
				if (N % index == 0) {
					cnt++;
					if (cnt == K) {
						System.out.print(index);
					}

				}
			}
			if (K > cnt) {
				System.out.print(0);
			}
		}
	}

}
