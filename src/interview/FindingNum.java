package interview;

public class FindingNum {
	public void solution(int[] arr) {

		int count = 0;
		while (count < 101) {
			if (count != arr[count])
				System.out.println(count);

			count++; 
		}

	}

	public static void main(String[] args) {

		int[] arr = new int[101];
		for (int idx = 0; idx < 101; idx++) {
			arr[idx] = idx;
		}

		arr[3] = 0;
		arr[5] = 0;

		new FindingNum().solution(arr);
	}

}
