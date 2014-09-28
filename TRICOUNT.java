import java.util.*;

class TRICOUNT{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int t = Integer.parseInt(in.next());
		StringBuilder string = new StringBuilder();

		while (t-- > 0){
			long n = in.nextLong();
			long answer = (n*(n+2)*(2*n+1)/8);
			string.append(answer+"\n");
		}
		System.out.println(string);
	}
}
