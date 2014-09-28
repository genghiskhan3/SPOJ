import java.util.*;
import java.math.*;

class LASTDIG2{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int t = Integer.parseInt(in.next());

		while (t-- > 0){
			BigInteger a = new BigInteger(in.next());
			BigInteger b = new BigInteger(in.next());

			BigInteger ten = new BigInteger("10");
			BigInteger c = a.modPow(b, ten );

			System.out.println(c);
		}
	}
}
