/**************************************************************
    Problem: 1534
    User: premiummina9401
    Language: Java
    Result: Success
    Time:131 ms
    Memory:10900 kb
****************************************************************/

import java.util.LinkedList;
import java.util.Scanner;

public class NumTransfer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		LinkedList<Object> list = new LinkedList<Object>();
		switch (B) {
		case 2:
			do {
				list.add(N % 2);
				N = N / 2;
			} while (N != 0);

			while (!list.isEmpty()) {
				int index = (int) list.removeLast();
				System.out.print(index);
			}
			break;
		case 8:
			do {
				list.add(N % 8);
				N = N / 8;
			} while (N != 0);

			while (!list.isEmpty()) {
				int index = (int) list.removeLast();
				System.out.print(index);
			}
			break;
		case 16:
			do {
				if (N % 16 == 10) {
					list.add('A');
				} else if (N % 16 == 11) {
					list.add("B");
				} else if (N % 16 == 12) {
					list.add("C");
				} else if (N % 16 == 13) {
					list.add("D");
				} else if (N % 16 == 14) {
					list.add("E");
				} else if (N % 16 == 15) {
					list.add("F");
				} else {
					list.add(N % 16);

				}
				N = N / 16;
			} while (N != 0);

			while (!list.isEmpty()) {
				Object index = list.removeLast();
				System.out.print(index);
			}
			break;
		}
	}
}