import java.util.*;
class ADDREV {
	
	public static String reverse(String a){
		
		String num = "";
		for (int i = a.length() - 1; i >= 0; i--){
			num += a.charAt(i);
		}
		
		boolean go = true;
		
		while (go == true){
			if (num.charAt(0) == '0'){
				num = num.substring(1);
			}
			else{
				break;
			}
		}
		return num;
		
	}
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		int trials = in.nextInt();
		
		for(int i = 0; i < trials; i++){
			String number1 = in.next();
			String number2 = in.next();
			
			String newNumber1 =  reverse(number1);
			String newNumber2 =  reverse(number2);
			
			int firstNumber = Integer.parseInt(newNumber1);
			int secondNumber = Integer.parseInt(newNumber2);
			
			int sum = firstNumber + secondNumber;
			
			String stringSum = Integer.toString(sum);
			
			String finalSum = reverse(stringSum);
			
			System.out.println(finalSum);	
		}
			
	}

}

