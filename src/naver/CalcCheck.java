package naver;

/* 괄호 연산이 닫히는지 확인하기  */
public class CalcCheck {
	public static int getTokenizer(char input) {
		int val = 0;
		switch (input) {
		case '(':
			val = 1;
			break;
		case ')':
			val = 2;
			break;
		case '{':
			val = 3;
			break;
		case '}':
			val = 4;
			break;
		case '[':
			val = 5;
			break;
		case ']':
			val = 6;
			break;

		}
		return val;
	}

	public static void main(String[] args) {
		String first = "{}[][[]]";
		int input;
		Stack s = new Stack(first.length());
		boolean result = true;
		for (int i = 0; i < first.length(); i++) {
			input = getTokenizer(first.charAt(i));
			switch (input) {
			case 1:
				s.push(input);
				break;
			case 2:
				if (1 != s.pop())
					result = false;
				break;
			case 3:
				s.push(input);
				break;
			case 4:
				if (3 != s.pop())
					result = false;
				break;
			case 5:
				s.push(input);
				break;
			case 6:
				if (5 != s.pop())
					result = false;
				break;
			}
			if (!result)
				break;
		}
		if (s.isEmpty()) {
			System.out.println(result);
		} else {
			result = false;
			System.out.println(result);
		}
	}
}

class Stack {
	private int top;
	private int[] stack;
	private int size;

	public Stack(int size) {
		top = -1;
		this.size = size;
		stack = new int[size];
	}

	/* 넣기 */
	public void push(int x) {
		top++;
		if (top == size) {
			this.size = size + 1;
			int[] newStack = new int[size];
			for (int idx = 0; idx < size - 1; idx++) {
				newStack[idx] = stack[idx];
			}
			stack = newStack;
		}
		stack[top] = x;
	}

	public int pop() {
		return stack[top--];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
}