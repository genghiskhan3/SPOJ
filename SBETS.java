import java.util.ArrayList;
import java.util.Scanner;
class SBETS {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		int trials = in.nextInt();
		
		for(int i = 0; i < trials; i++){
			
			ArrayList <String> winners = new ArrayList <String>();
			String winnerList = "";
			int index = 0;
			
			for(int x = 0; x < 16; x++ ){
				
				String team1 = in.next();
				String team2 = in.next();
				int goals1 = in.nextInt();
				int goals2 = in.nextInt();
				
				if (goals1 > goals2){
					winnerList += team1 + " ";
					if (!winners.contains(team1)){
						winners.add(index, team1);
					}
				}
				else{
					winnerList += team2 + " ";
					if (!winners.contains(team2)){
						winners.add(index, team2);
					}
				}
				
				
			}
			int [] totals = new int [winners.size()];
			
			for (int y = 0; y < winners.size(); y++){
				String a = winnerList;
				while (true){
					if (a.contains(winners.get(y))){
						int position = a.indexOf(winners.get(y));
						a = a.substring(position + 3);
						totals [y]++;  
					}
					else{
						break;
					}
				}
			}
			
			for (int z = 0; z < totals.length; z++){
				if (totals [z] == 4){
					String myWinner = winners.get(z);
					System.out.println(myWinner);
					break;
				}
			}
			
		}
		
	}

}

