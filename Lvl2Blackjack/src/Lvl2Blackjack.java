
public class Lvl2Blackjack {

	public static void main(String[] args) {
		int card1 = 19;
		int card2 = 20;
		
		System.out.println(closestTo21(card1, card2));
	}
	private static int closestTo21(int firstNum, int secondNum) {
		
		if (firstNum < 22 & secondNum < 22) {
			if (firstNum > secondNum) {
				return firstNum;
			} else {
				return secondNum;} 
			}else {
				if (firstNum < 22) {
					return firstNum;
				} else { if (secondNum < 22) {
					return secondNum;
				} else {
					return 0;
				}
				}
		}
	}
}
