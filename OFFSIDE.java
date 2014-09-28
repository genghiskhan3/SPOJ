import java.util.*;
class OFFSIDE {

	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int d = in.nextInt();
		while(a != 0 && d != 0){
			int [] attacking = new int [a];
			int [] defending = new int [d];
			// read in the attacking distances from goal
			for (int i = 0; i < a; i++){
				attacking [i] = in.nextInt();
			}
			// read in the defending distances from goal
			for (int k = 0; k < d; k++){
				defending [k] = in.nextInt();
			}
			// find the closest attacking player to the goal
			int closestAtt = 0;
			int min = Integer.MAX_VALUE;
			for (int l = 0; l < attacking.length; l++){
				if (attacking[l] < min){
					min = attacking [l];
					closestAtt = min;
				}
			}
			// find the last defender
			int secondClose = 0;
			int closestDef = 0;
			int min2 = Integer.MAX_VALUE;
			for (int x = 0; x < defending.length; x++){
				if (defending [x] < min2){
					min2 = defending [x];
					secondClose = x;
				}
			}
			// find the second to last defender
			int min3 = Integer.MAX_VALUE;
			for (int g = 0; g < defending.length; g++){
				if (g != secondClose){
					if (defending [g] < min3){
						min3 = defending[g];
						closestDef = min3;
					}
				}
			}
			if (closestAtt >= closestDef){
				System.out.println("N");
			}
			else {
				System.out.println("Y");
			}
			 a = in.nextInt();
			 d = in.nextInt();
		}
		in.close();
	}
}

