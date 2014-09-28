import java.util.*;

class EIGHTS{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int tests = Integer.parseInt(in.nextLine());

		for (int t = 0; t < tests; t++){
			long k = Long.valueOf(in.nextLine()).longValue();

			System.out.println((k - 1) * 250 + 192);
		}
	}
}
