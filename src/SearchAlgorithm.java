import java.util.Scanner;

public class SearchAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 3, 4, 2, 0, 1 };
		System.out.print("찾고자 하는 값을 입력하세요 : ");
		int data = sc.nextInt();
		int i = BinarySearchInterative(arr, data) + 1;
		System.out.println("배열의 " + i + "번째 위치에서 값을 찾았습니다.");
	}

	private static int BinarySearchInterative(int[] arr, int data) {
		int low = 0, high = arr.length - 1;
		int count = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			System.out.println("   " + ++count + "번째 시도 mid = " + mid);
			if (data == arr[mid])
				return mid;
			else if (data > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

}
