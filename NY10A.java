import java.util.*;
class NY10A {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		int trials = in.nextInt();
		String [] sequences =  {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
		int [][] count = new int [trials][8];
		for (int i = 0; i < trials; i++){
			int trial = in.nextInt();
			String penney = in.next();
			//String a = penney;
			for (int y = 0; y < sequences.length; y++){
				String a = penney;
				while (a.contains(sequences[y])){
					int index = a.indexOf(sequences[y]);
					a = a.substring(index + 1);
					count [i][y]++;
				}
			}
			System.out.printf("%d %d %d %d %d %d %d %d %d %n", trial, count[i][0],count[i][1],count[i][2],count[i][3],count[i][4],count[i][5],count[i][6],count[i][7]);
			
		}
	}

}

