
public class DigitsToWords {

	public static void main(String[] args) {
		
		int number = 287;
		
		TurnDigitsIntoWords(number);

	}

	public static void TurnDigitsIntoWords(int num) {
		
		boolean teen = false;
		int[] numArray = {0,0};
		int dig1 = 0;
		int dig2 = 0;
		int dig3 = 0;
		numArray[0] = dig1;
		numArray[1] = dig2;
		int numSize = String.valueOf(num).length();;
		
		switch (numSize) {
		case 1 : case 2 : 
			dig1 = num/10;
			dig2 = num%10;
			break;
		case 3 : 
			dig1 = num/100;
			dig2 = (num%100)/10;
			dig3 = num%10;
		}
		
		System.out.println(dig1);
		System.out.println(dig2);
		System.out.println(dig3);
		
		switch (numSize) {
		case 1 : case 2: break;
		case 3 : System.out.println(SingleDigitReturnString(dig1) + " Hundred and ");
				 dig1 = dig2;
				 dig2 = dig3;
		break;
		default : break;
		}
		
		
		
			switch (dig1) {
			case 1 : teen = true;
			break;
			case 2 : System.out.print("Twenty ");
			break;
			case 3 : System.out.print("Thirty ");
			break;
			case 4 : System.out.print("Forty ");
			break;
			case 5 : System.out.print("Fifty ");
			break;
			case 6 : System.out.print("Sixty ");
			break;
			case 7 : System.out.print("Seventy ");
			break;
			case 8 : System.out.print("Eighty ");
			break;
			case 9 : System.out.print("Ninety ");
			break;
		}
			System.out.print("");
			
			switch (dig2) {
			case 1 : switch(dig1) {
			case 1 : break;
			default : System.out.print("One");
			}
			break;
			case 2 : switch(dig1) {
			case 1 : break;
			default : System.out.print("Two");
			}
			break;
			case 3 : switch(dig1) {
			case 1 : break;
			default : System.out.print("Three");
			}
			break;
			case 4 : System.out.print("Four");
			break;
			case 5 : switch(dig1) {
			case 1 : break;
			default : System.out.print("Five");
			}
			break;
			case 6 : System.out.print("Six");
			break;
			case 7 : System.out.print("Seven");
			break;
			case 8 : System.out.print("Eight");
			break;
			case 9 : System.out.print("Nine");
			break;
		}
		if (teen) {
			switch (dig2) {
			case 1 : System.out.print("Eleven");
			break;
			case 2 : System.out.print("Twelve");
			break;
			case 3 : System.out.print("Thirteen");
			break;
			case 4 : System.out.print("teen");
			break;
			case 5 : System.out.print("Fifteen");
			break;
			case 6 : System.out.print("teen");
			break;
			case 7 : System.out.print("teen");
			break;
			case 8 : System.out.print("teen");
			break;
			case 9 : System.out.print("teen");
			break;
			
			}
		}
	}
	public static String SingleDigitReturnString(int inputNum) {
		switch (inputNum) {
		case 1 : return "One";
		case 2 : return "Two";
		case 3 : return "Three";
		case 4 : return "Four";
		case 5 : return "Five";
		case 6 : return "Six";
		case 7 : return "Seven";
		case 8 : return "Eight";
		case 9 : return "Nine";
		default : return null;
	}
	}
}



