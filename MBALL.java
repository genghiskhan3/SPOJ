import java.util.*;

class MBALL{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int trials = in.nextInt();
		int [] memo = new int [100001];
		memo[0] = 1;
		

		int [] possiblePoints = {2, 3, 6, 7, 8};

		for (int i = 0; i < possiblePoints.length; i++){
			for (int k = possiblePoints[i]; k < 100001; k++){
				if (memo[k - possiblePoints[i]] != 0){
					memo[k] += memo[k - possiblePoints[i]];
				}
			}
		}


		for (int t= 0; t < trials; t++){
			int score = in.nextInt();

			System.out.println(memo[score]);
		}
	}


}
