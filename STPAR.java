import java.util.*;

class STPAR{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int cars = Integer.parseInt(in.next());

		while (cars != 0){
			int [] carOrder = new int [cars];

			for (int i = 0; i < cars; i++){
				carOrder[i] = Integer.parseInt(in.next());
			}

			Stack <Integer> st = new Stack <Integer>();

			int index = 0;
			int curCar = 1;
			boolean allGood = true;
			while(index < cars){
				if (carOrder[index] == curCar){
					index++;
					curCar++;
				} else if (carOrder[index] > curCar && st.isEmpty()){
					st.push(carOrder[index]);
					index++;
				} else if (!st.isEmpty() && st.peek() == curCar){
					st.pop();
					curCar++;
					//index++;
				} else if (!st.isEmpty() && st.peek() > carOrder[index]){
					st.push(carOrder[index]);
					index++;
				} else{
					allGood = false;
					break;
				}
	
			}

			if (!allGood){
				System.out.println("no");
			} else{
				System.out.println("yes");
			}

			cars = Integer.parseInt(in.next());
		}
	}
}
