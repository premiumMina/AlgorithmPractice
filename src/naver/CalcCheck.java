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
		String first = "{}}";
		int input = 0;

		/* 스택 생성 */
		Stack s = new Stack(first.length());
		/* 괄호가 닫히는지 확인하기 위한 boolean 변수 */
		boolean result = true;
		/* 열린 괄호는 스택에 push()하고 닫힌 괄호는 스택에서 pop()하여 맞는 괄호인지 확인 */
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

		/* 괄호는 맞지만 스택에 여는 괄호가 남았을 경우 false인 부분 체크 */
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
		if(top <0){
			return -1;
		}
		return stack[top--];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
}