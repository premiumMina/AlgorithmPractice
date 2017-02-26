package acmicpc;

import java.util.Scanner;

public class Q2580 {
	static int[][] mat, ans;
	static int answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		mat = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				mat[i][j] = sc.nextInt();
			}
		} // 입력 끝

		backtrack(0, 0);
	}

	public static void backtrack(int row, int col) {
		if (row == 9) { // 검사 끝
			print();
			return;
		}

		int[] validnum = new int[10];
		if (mat[row][col] == 0) { // 빈칸일 경우
			validnum = getValidNum(row, col); // 숫자 배열 확인
			for (int i = 1; i <= 9; i++) {
				if (validnum[i] == 0) {
					mat[row][col] = i;
					if (col == 8) { // 한행의 탐색이 끝난 후 다음 행
						backtrack(row + 1, 0);
					} else {
						backtrack(row, col + 1);
					}
					mat[row][col] = 0;
				}
			}
		} else {
			if (col == 8) {
				backtrack(row + 1, 0);
			} else {
				backtrack(row, col + 1);
			}
		}
	}

	public static int[] getValidNum(int row, int col) {
		int[] num = new int[10];

		for (int i = 0; i < 9; i++) {
			num[mat[i][col]] = 1; // 가로행에 있는 숫자 확인
			if (mat[row][i] != 0) {
				num[mat[row][i]] = 1; // 세로행에 있는 0이 아닌 숫자 확인
			}
		}

		int r = row / 3 * 3;
		int c = col / 3 * 3;

		// 3x3 사각형 확인
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (mat[i][j] != 0) { // 3x3 안의 숫자 확인
					num[mat[i][j]] = 1;
				}
			}
		}
		return num;
	}

	// 출력
	public static void print() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
