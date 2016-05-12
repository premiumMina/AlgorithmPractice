import java.util.Scanner;

public class SearchAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 3, 4, 2, 0, 1 };
		System.out.print("ã���� �ϴ� ���� �Է��ϼ��� : ");
		int data = sc.nextInt();
		int i = BinarySearchInterative(arr, data) + 1;
		System.out.println("�迭�� " + i + "��° ��ġ���� ���� ã�ҽ��ϴ�.");
	}

	private static int BinarySearchInterative(int[] arr, int data) {
		int low = 0, high = arr.length - 1;
		int count = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			System.out.println("   " + ++count + "��° �õ� mid = " + mid);
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
