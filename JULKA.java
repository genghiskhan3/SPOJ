import java.math.BigInteger;
import java.util.*;
class JULKA {

	public static void main (String [] args){
		
		
		
		Scanner in = new Scanner (System.in);
		for (int i = 0; i < 10; i ++){
			BigInteger total = new BigInteger(in.next());
			BigInteger kMore = new BigInteger(in.next());
	
			BigInteger equal = new BigInteger ("0");
			BigInteger add = total.subtract(kMore);
			BigInteger two = new BigInteger ("2");
			BigInteger divide = add.divide(two);
			equal = divide;
			BigInteger klaudia = equal.add(kMore);
			//int n = equal;
			System.out.println(klaudia);
			System.out.println(equal);
		}
	}
}

