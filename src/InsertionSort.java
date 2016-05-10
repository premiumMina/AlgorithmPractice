
/**************************************************************
    Problem: 1158
    User: premiummina9401
    Language: Java
    Result: Success
    Time:277 ms
    Memory:11052 kb
****************************************************************/

import java.util.Scanner;

/*
1158 : 삽입정렬 
 
제한시간: 1Sec    메모리제한: 32mb
해결횟수: 552회    시도횟수: 897회  
*/
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int index = 0; index < N; index++) {
			arr[index] = sc.nextInt();
		}
		for (int index = 1; index < N; index++) {
			for (int index2 = 0; index2 <= index; index2++) {
				if (arr[index] < arr[index2]) {
					int m = arr[index];
					arr[index] = arr[index2];
					arr[index2] = m;
				}
			}
			for (int count = 0; count < N; count++) {
				System.out.print(arr[count] + " ");
			}
			System.out.println();
		}
	}
}
