package interview;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public void solution(ArrayList<Integer> numbers) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < numbers.size(); i++) {

			int a;
			if (i < 1) {
				a = 0;
			} else {
				a = temp.get(i - 1);
			}

			int b = numbers.get(i);

			if (a + b > b) {
				temp.add(a + b);
			} else {
				temp.add(b);
			}

			if (maxSum < temp.get(i)) {
				maxSum = temp.get(i);
			}
		}
        System.out.println(maxSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			numbers.add(sc.nextInt());
		}
		new Solution().solution(numbers);
	}

}
