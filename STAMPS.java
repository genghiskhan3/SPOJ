import java.util.*;

class STAMPS{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int t = Integer.parseInt(in.next());
		StringBuilder string = new StringBuilder();
		for (int tc = 1; tc <= t; tc++){
			int stampsNeeded = Integer.parseInt(in.next());
			int numFriends = Integer.parseInt(in.next());

			int [] friendsStamps = new int [numFriends];

			for (int i = 0; i < numFriends; i++){
				friendsStamps[i] = Integer.parseInt(in.next());
				//System.out.println("bing");
			}

			Arrays.sort(friendsStamps);

			int moves = 0;
			int stampsGained = 0;
			int index = numFriends - 1;
			while (stampsGained < stampsNeeded && index >= 0){
				stampsGained += friendsStamps[index];
				moves++;
				index--;
			}

			if (stampsGained < stampsNeeded){
				string.append("Scenario #" + tc + ":" + "\n" + "impossible\n");
			} else{
				string.append("Scenario #" + tc + ":" + "\n" + moves + "\n");
			}
			string.append("\n");
		}
		System.out.println(string);
	}
}
