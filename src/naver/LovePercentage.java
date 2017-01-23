package naver;

public class LovePercentage {
	public int len(char word) {
		int val = 0;
		switch (word) {
		case '이':
			val = 2;
			break;
		case '화':
			val = 7;
			break;
		case '신':
			val = 4;
			break;
		case '표':
			val = 7;
			break;
		case '나':
			val = 3;
			break;
		case '리':
			val = 4;
			break;
		case '찰' :
			val = 3;
			break;
		case '브' :
			val = 2;
			break;
		case '라' :
			val = 2;
			break;
		case '운' :
			val = 2;
			break;
			
		}
		return val;
	}

	public void calcMC(String A, String B) {
		/* 문자 A를 무조건 긴 문자로 정하기 */
		if (A.length() < B.length()) {
			String tmp = A;
			A = B;
			B = tmp;
		}

		/* 이표화나신리 완료 */
		String newName = "";
		for (int idx = 0; idx < A.length(); idx++) {
			newName = newName + A.substring(idx, idx + 1);
			if (idx < B.length()) {
				newName = newName + B.substring(idx, idx + 1);
			}
		}

		/* 각 이름의 값을 가져와서 배열에 넣는다. */
		int newSize = newName.length();
		int[] result = new int[newSize];
		for (int idx = 0; idx < newSize; idx++) {
			result[idx] = len(newName.charAt(idx));
		}

		
		/*
		 * 글자길이의 -2 한 만큼 계산이 반복되는 것을 알았다. 
		 * 총 길이가 7이라면 5번의 계산을 통해서 궁합을 구할 수 있다.
		 */
		int count = 0;
		while (newSize - count != 2) {
			for (int i = 0; i < newSize - 1; i++) {
				result[i] = (result[i] + result[i + 1]) % 10;
			}
			count++;
		}

		int percentage = result[0] * 10 + result[1];
		System.out.println(percentage+"%");

	}

	public static void main(String[] args) {
		new LovePercentage().calcMC("찰리브라운", "표나리");
	}
}