
public class Lvl2TooHot {

	public static void main(String[] args) {
		int temperature = 91;
		boolean isSummer = true;

		if (trueOrFalse(temperature, isSummer)) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
	
	public static boolean trueOrFalse(int temperature, boolean isSummer) {
		
		int summerTemp = 91;
		if (isSummer) {
			summerTemp = summerTemp + 10;
		}
		
		if (temperature > 59 & temperature < summerTemp)
			return true;
		else return false;
	}
}
