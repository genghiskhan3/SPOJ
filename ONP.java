import java.util.*;

class ONP{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int trials = Integer.parseInt(in.nextLine());

		for (int t = 0; t < trials; t++){
			String cur = in.nextLine();

			Stack <Character> st = new Stack <Character> ();

			for (int i = 0; i < cur.length(); i++){
				char c = cur.charAt(i);

				if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
					st.push(c);
				} else if (c == '(') {
					continue;
				} else if (c == ')'){ 
					System.out.print(st.pop());
				} else{
					System.out.print(c);
				}
			}

			System.out.print("\n");
		}
	}
}
