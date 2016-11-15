package interview;

import java.util.Scanner;

public class FindingSort {
	/*
	 * 정렬된 배열에서 index번째에 있는 값이 index랑 같은 것 찾기
	 */
	public void solution(int[] sorting) {
		int count = sorting.length - 1;
		while (count >= 1) {
			if (count == sorting[count])
				System.out.print(count + " ");
			count--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sorting = new int[11];
		sorting[0] = -1;
		for (int i = 1; i < 11; i++) {
			sorting[i] = sc.nextInt();
		}
		new FindingSort().solution(sorting);
	}

}
