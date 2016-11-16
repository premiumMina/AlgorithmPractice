package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			String ch = "";
			if (i % 3 == 0)
				ch = "Fizz";
			if (i % 5 == 0)
				ch += "Buzz";
			else if (i % 3 != 0)
				ch = i + "";
			list.add(ch);
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new FizzBuzz().fizzBuzz(sc.nextInt());
	}
}
