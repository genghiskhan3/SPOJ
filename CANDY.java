import java.util.*;
class Candy {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		int bags = in.nextInt();
		
		while (bags > 0){
			
			int [] numbers = new int [bags];
			int sum = 0;
			
			for (int i = 0; i < bags; i++){
				numbers [i] = in.nextInt();
				
				sum += numbers [i];
				
			}
			
			if (sum % bags != 0)
			{
				System.out.println("-1");
			}
			else{
				int magicNumber = sum / bags;
				int totalMoves = 0;
				
				for (int x = 0; x < numbers.length; x++){
					int myNumber = numbers [x];
					
					if (myNumber > magicNumber){
						totalMoves += myNumber - magicNumber;
					}
				}
				System.out.println(totalMoves);
			}
			bags = in.nextInt();
		}
		
	}

}

