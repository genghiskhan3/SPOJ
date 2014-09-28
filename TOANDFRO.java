import java.util.*;

class TOANDFRO{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int cols = Integer.parseInt(in.nextLine());

		while (cols != 0){
			String cur = in.nextLine();

			int rowLength = cur.length() / cols;

			char array [][] = new char [rowLength][cols];

			int count = 0;

			for (int r = 0; r < rowLength; r++){
				for (int c = 0; c < cols; c++){
					if (r % 2 == 0){
						array[r][c] = cur.charAt(count);
					} else {
						array[r][cols - c - 1] = cur.charAt(count);
					}
					count++;
				}
			}


			// now print the shit out
			for (int c = 0; c < cols; c++){
				for (int r = 0; r < rowLength; r++){
					System.out.print(array[r][c]);
				}
			}

			System.out.print("\n");

			cols = Integer.parseInt(in.nextLine());
		}
	}
}
