import java.util.*;

class ABSYS{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int t = Integer.parseInt(in.nextLine());
		StringBuilder string = new StringBuilder();
		while (t-- > 0){
			String ignore = in.nextLine();

			String equation = in.nextLine();
			int p = equation.indexOf("+");
			int eq = equation.indexOf("=");
			int m = equation.indexOf("m");

			if (m < p){
				// subtract c by b
				int b = Integer.parseInt(equation.substring(p + 2, eq - 1));
				int c = Integer.parseInt(equation.substring(eq + 2));
				int a = c - b;
				string.append(a + " + " + b + " = " + c+"\n");
			} else if (m > eq){
				int a = Integer.parseInt(equation.substring(0, p - 1));
				int b = Integer.parseInt(equation.substring(p + 2, eq - 1));
				int c = b + a;
				string.append(a + " + " + b + " = " + c + "\n");
			} else{
				int a = Integer.parseInt(equation.substring(0, p - 1));
				int c = Integer.parseInt(equation.substring(eq + 2));
				int b = c - a;
				string.append(a + " + " + b + " = " + c + "\n");
			}
		}
		System.out.println(string);
	}
}
