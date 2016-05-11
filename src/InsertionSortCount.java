
/**************************************************************
    Problem: 1814
    User: premiummina9401
    Language: Java
    Result: Success
    Time:132 ms
    Memory:9132 kb
****************************************************************/

import java.util.Scanner;

public class InsertionSortCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N <= 50 && N >= 1) {
			int[] arr = new int[N];
			int count = 0;
			for (int index = 0; index < N; index++) {
				int a = sc.nextInt();
				if (a >= -1000 && a <= 1000)
					arr[index] = a;
			}

			for (int index = 1; index < N; index++) {
				for (int index2 = 0; index2 <= index; index2++) {
					if (arr[index] < arr[index2]) {
						int m = arr[index];
						arr[index] = arr[index2];
						arr[index2] = m;
						count++;
					}
				}
			}
			System.out.print(count);
		}
	}
}
