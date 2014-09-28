import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


class NSTEPS {
	
	public static void main (String [] args) {
		
		Scanner in  = new Scanner (System.in);
		
		
		
		int trials = in.nextInt();
		
		for (int k = 0; k < trials; k++){
			int positionX = in.nextInt();
			int positionY = in.nextInt();
			
			
			if (positionY > positionX){
			System.out.println("No Number");
			}
			else if (positionX == positionY || positionX - 2 == positionY){
				if (positionX % 2 == 0){
					int sum = positionX + positionY;
					System.out.println(sum);
				}
				else{
					int sum = (positionX + positionY) - 1;
					System.out.println(sum);
				}
			}
			else{
				System.out.println("No Number");
			}
		}
		in.close();
		
	}

}

