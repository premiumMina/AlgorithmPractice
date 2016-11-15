package interview;

import java.util.Arrays;
import java.util.Scanner;

public class FindingOverlap {
	/*
	 * 중복된 숫자가 있는지 검사하는 방법 
	 * 1. 정렬 후, 연속된 수 뽑기 2. 중첩 for	문으로 모든 경우 비교하기
	 */
	public void solution(int[] arr) {
		Arrays.sort(arr);
		int temp;
		temp = arr[0];
		for (int idx = 1; idx < arr.length; idx++) {
			if (temp == arr[idx])
				System.out.println(temp);
			else
				temp = arr[idx];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int idx = 0; idx < size; idx++) {
			arr[idx] = sc.nextInt();
		}
		new FindingOverlap().solution(arr);
	}

}
