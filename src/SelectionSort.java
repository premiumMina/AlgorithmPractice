/**************************************************************
    Problem: 1146
    User: premiummina9401
    Language: Java
    Result: Success
    Time:270 ms
    Memory:11356 kb
****************************************************************/

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int index = 0; index < n; index++) {
			list[index] = sc.nextInt();
		}

		int i, j, least;
		int temp = 0;
		for (i = 0; i < n - 1; i++) {
			least = i;
			for (j = i + 1; j < n; j++) {
				if (list[j] < list[least]) {
					least = j;
				}
			}
			temp = list[i];
			list[i] = list[least];
			list[least] = temp;

			for (int index = 0; index < n; index++) {
				System.out.print(list[index] + " ");
			}
			System.out.println();
		}

	}
}