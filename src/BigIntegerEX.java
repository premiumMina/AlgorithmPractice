import java.math.BigInteger;

public class BigIntegerEX {
	public static void main(String[] args) {
		BigInteger print = new BigInteger("2");
		BigInteger mul = new BigInteger("1");

		for (int i = 0; i < 64; i++) {
			mul = mul.multiply(print);
		}
		System.out.println(mul);
	}
}
