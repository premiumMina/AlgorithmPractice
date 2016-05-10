import java.util.Scanner;

/*
1158 : 삽입정렬 
 
제한시간: 1Sec    메모리제한: 32mb
해결횟수: 552회    시도횟수: 897회  
*/
public class InsertionSortCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N <= 50 && N >= 1) {
			int[] arr = new int[N];
			int count = 0;
			for (int index = 0; index < N; index++) {
				int a = sc.nextInt();
				if (a >= -1000 && a <= 1000)
					arr[index] = a;
			}

			for (int index = 1; index < N; index++) {
				for (int index2 = 0; index2 <= index; index2++) {
					if (arr[index] < arr[index2]) {
						int m = arr[index];
						arr[index] = arr[index2];
						arr[index2] = m;
						count++;
					}
				}
			}
			System.out.print(count);
		}
	}
}
