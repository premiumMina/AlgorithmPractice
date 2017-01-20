package naver;

public class LovePercentage {
	public int len(char word) {
		int val = 0;
		switch (word) {
		case '��':
			val = 2;
			break;
		case 'ȭ':
			val = 7;
			break;
		case '��':
			val = 4;
			break;
		case 'ǥ':
			val = 7;
			break;
		case '��':
			val = 3;
			break;
		case '��':
			val = 4;
			break;
		case '��' :
			val = 3;
			break;
		case '��' :
			val = 2;
			break;
		case '��' :
			val = 2;
			break;
		case '��' :
			val = 2;
			break;
			
		}
		return val;
	}

	public void calcMC(String A, String B) {
		/* ���� A�� ������ �� ���ڷ� ���ϱ� */
		if (A.length() < B.length()) {
			String tmp = A;
			A = B;
			B = tmp;
		}

		/* ��ǥȭ���Ÿ� �Ϸ� */
		String newName = "";
		for (int idx = 0; idx < A.length(); idx++) {
			newName = newName + A.substring(idx, idx + 1);
			if (idx < B.length()) {
				newName = newName + B.substring(idx, idx + 1);
			}
		}

		/* �� �̸��� ���� �����ͼ� �迭�� �ִ´�. */
		int newSize = newName.length();
		int[] result = new int[newSize];
		for (int idx = 0; idx < newSize; idx++) {
			result[idx] = len(newName.charAt(idx));
		}

		
		/*
		 * ���ڱ����� -2 �� ��ŭ ����� �ݺ��Ǵ� ���� �˾Ҵ�. 
		 * �� ���̰� 7�̶�� 5���� ����� ���ؼ� ������ ���� �� �ִ�.
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
		new LovePercentage().calcMC("��������", "ǥ����");
	}
}