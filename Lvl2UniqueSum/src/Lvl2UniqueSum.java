
public class Lvl2UniqueSum {

	public static void main(String[] args) {
		int int1 = 1;
		int int2 = 2;
		int int3 = 6;
		
		System.out.println(uniqueSum(int1, int2, int3));

	}
	
	public static int uniqueSum(int num1, int num2, int num3) {

		int diff12 = num1 - num2;
		int diff23 = num2 - num3;
		int diff13 = num1 - num3;
		
	if (diff12 == 0) {
		num1 = 0;
		num2 = 0;
	}
	if (diff23 == 0) {
		num2 = 0;
		num3 = 0;
	}
	if (diff13 == 0) {
		num1 = 0;
		num3 = 0;
	}
	
return num1 + num2 + num3;
	}
}