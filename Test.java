import java.util.*;
class TEST{
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		int num = in.nextInt();
		
		while(true){
			if (num  == 42) break;
			System.out.println(num);
			num = in.nextInt();
		}	
	}
}
