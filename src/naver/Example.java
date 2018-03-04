package naver;

import java.lang.reflect.Method;

public class Example extends AbstractClass implements ExampleInterface {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("CalcCheck.java");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

	@Override
	public void abstractFunc() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isPossible() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isNotPossible() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isAbstarctFunc() {
		// TODO Auto-generated method stub

	}

}
