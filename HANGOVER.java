import java.util.*;
class HANGOVER {

	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		double hang = in.nextFloat();
		while (hang != 0.00){
			double sum = 0.0;
			int index = 0;
			while (sum <= hang){
				sum +=  (1/ (double) (index + 2));
				index++;
			}
			System.out.printf("%d card(s)%n", index);
			hang = in.nextFloat();
		}
	}
}

