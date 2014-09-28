import java.util.*;

class COINS{

	public static long [] memo;

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		StringBuilder string = new StringBuilder();

		memo = new long [1000001];
		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 3;


		while (in.hasNext()){
			int coin = in.nextInt();

			string.append(solve(coin) + "\n");
		}

		System.out.print(string);
	}

	public static long solve(int n){
		if ((n < 1000001 && memo[n] != 0) || n == 0){
			return memo[n];
		}

		long answer = Math.max(n, solve(n/2) + solve(n/3) + solve(n/4));

		if(n < 1000001){
			return memo[n] = answer;
		} else{
			return answer;
		}
	}
}
