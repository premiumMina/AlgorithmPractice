package naver;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoProblem {
	public static void main(String[] args) {
		String input = "29600000";
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(Integer.parseInt(input)));

		BigInteger big = new BigInteger("100000000000000000000");
		System.out.println(big.subtract(BigInteger.valueOf(4)));

		Integer i = new Integer(5);
		System.out.println(i - Integer.valueOf(3));

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
	}
}
