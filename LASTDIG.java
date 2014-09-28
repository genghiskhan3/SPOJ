import java.util.*;
import java.math.*;

class LASTDIG{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int tests = Integer.parseInt(in.next());

		for (int t = 1; t <= tests; t++){
			BigInteger a = new BigInteger(in.next());
			BigInteger b = new BigInteger(in.next());

			BigInteger ten = new BigInteger ("10");

			BigInteger answer = a.modPow(b, ten);

			System.out.println(answer);

			//String s = "" + answer;
			//System.out.println(s.charAt(s.length() - 1));
		}
	}

}
