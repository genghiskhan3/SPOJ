import java.util.*;
class FAKESTP {

	public static void main (String [] args){
		
		Scanner in = new Scanner(System.in);
		
		int index = 0;
		String text1 = "";
		String text2 [] = new String [1000];
		double sum = 0;
		while (in.hasNextLine()){
			
			if (index == 0){
				text1 = in.nextLine();
			}
			
			int par1 = text1.indexOf("(");
			String substring1 = text1.substring(par1 + 1, text1.length() - 2);
			int space1 = substring1.indexOf(" ");
			String sub1A = substring1.substring(0, space1 - 1);
			String sub2A = substring1.substring(space1 + 1);
			double numberXA = Double.parseDouble(sub1A);
			double numberYA = Double.parseDouble(sub2A);
			
			text2 [index] = in.nextLine();
			
			
			
			int par2 = text2[index].indexOf("(");
			String substring2 = text2[index].substring(par2 + 1, text2[index].length() - 2);
			int space2 = substring2.indexOf(" ");
			String sub1B = substring2.substring(0, space2 - 1);
			String sub2B = substring2.substring(space2 + 1);
			double numberXB = Double.parseDouble(sub1B);
			double numberYB = Double.parseDouble(sub2B);
			
			double sumX = numberXB - numberXA;
			double xSquared = Math.pow(sumX, 2);
			double sumY = numberYB - numberYA;
			double ySquared = Math.pow(sumY, 2);
			double distance = Math.sqrt((xSquared + ySquared));
			
			sum += distance;
			
			System.out.printf("The salesman has traveled a total of %.3f kilometers.%n", sum);
			
			text1 = text2 [index];
			index++;
		}
		
	}
	
}

