import java.util.Arrays;
import java.util.Scanner;
class Fashion {

	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		int trials = in.nextInt();
		for (int k = 0; k < trials; k++){
			int lines = in.nextInt();
			int [] men = new int [lines];
			int [] women = new int [lines];
			for (int l = 0; l < lines; l++){
				men [l] = in.nextInt();
			}
			for (int t = 0; t < lines; t++){
				women [t] = in.nextInt();
			}
			Arrays.sort(women);
			Arrays.sort(men);
			int sum = 0;
			for (int i = 0; i < lines; i++){
				sum += men [i] * women [i];
			}
			
			System.out.println(sum);
		}
	}
}

