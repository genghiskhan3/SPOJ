import java.util.*;

class ACPC10A{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		while (true){
			
			if (a == 0 && b == 0 && c == 0){
				break;
			}

			if (2 * b == c + a){
				System.out.printf("AP %d%n", c + (c - b));
			} else {
				System.out.printf("GP %d%n", c * (b/a));
			}
			


			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
		}
	}
}
