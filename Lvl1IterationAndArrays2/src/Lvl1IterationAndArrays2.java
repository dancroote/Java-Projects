
public class Lvl1IterationAndArrays2 {

	public static void main(String[] args) {
		int[] arrayOfInts = new int[10];
		for (int counter = 0; counter < 10; counter++) { 
			arrayOfInts[counter] = counter;
			System.out.println(arrayOfInts[counter]);
		}
		for (int counter2 = 0; counter2 < 10; counter2++) {
			arrayOfInts[counter2] = counter2*10;
			System.out.println(arrayOfInts[counter2]);
		}
	}

}
