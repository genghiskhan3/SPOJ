import java.math.BigInteger;
import java.util.*;
class FACTRL2 {

	public static void main (String [] args){
	
		Scanner in = new Scanner (System.in);
		int trials = in.nextInt();
		for (int i = 0; i < trials; i++){
			int num = in.nextInt();
			BigInteger original = BigInteger.valueOf(num);
			if (num == 0 || num == 1){
				System.out.println(1);
			}
			else{
				for (int k = num - 1; k > 0; k--){
					BigInteger kth = BigInteger.valueOf(k);
					//BigInteger cur = original;
					original = original.multiply(kth);
				}
				System.out.println(original);
			}
		}
		in.close();
	}
}

