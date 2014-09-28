import java.util.*;
class Fence1 {

	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		int length = in.nextInt();
		while (length != 0){
			double diameter = (2 * (double) length) / Math.PI;
			double radius = diameter / 2;
			double answer = (Math.PI * Math.pow(radius, 2)) / 2.0;
			System.out.printf("%.2f%n",answer);
			length = in.nextInt();
		}
	}
}

