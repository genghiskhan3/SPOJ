import java.util.*;
import java.math.*;

class CANDY3{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int tests = Integer.parseInt(in.nextLine());

		for (int t = 1; t <= tests; t++){
			String ignore = in.nextLine();

			int kids = Integer.parseInt(in.nextLine());

			BigInteger total = new BigInteger ("0");

			for (int k = 0; k < kids; k++){
				BigInteger cur = new BigInteger (in.nextLine());

				total = total.add(cur);
			}
			String s = "" + kids;
			BigInteger kidsBig = new BigInteger (s);
			BigInteger zero = new BigInteger("0");

			if (total.mod(kidsBig).equals(zero)){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
		}		
	}
}
