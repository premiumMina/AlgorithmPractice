package interview;

public class Remove {

	public String remove(String input, char target) {
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			if (target != input.charAt(i)) {
				result = result + input.charAt(i);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String input = "abaaadfsdf";
		char target = 'b';
		System.out.print(new Remove().remove(input, target));
	}
}
