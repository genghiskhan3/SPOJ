import java.util.*;
class SAMER08F {
	
	public int recurse(int n){
		if (n == 1){
			return 1;
		}
		else {
			return n * n + recurse(n - 1);
		}
	}

	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		Feynman object = new Feynman();
		int number = in.nextInt();
		while (number != 0){
			System.out.println(object.recurse(number));
			number = in.nextInt();
		}
	}
}

