public class Lvl1Arrays {

public static void main(String[] args) {
 int[] arrayOfInts = {0,1,2,3,4,5,6,7,8,9};
 boolean sumOrMult = true;
 int integerOne = arrayOfInts[4];
 int integerTwo = arrayOfInts[7];
 numberSum(integerOne,integerTwo,sumOrMult);
 System.out.println(numberSum(integerOne,integerTwo, sumOrMult));
 }

public static int numberSum(int num1, int num2, boolean trueorfalse) {

 if (num1 == 0 | num2 == 0) {
	 return num1+num2;
	 }
	
	if (trueorfalse) {
  return num1*num2; 
  } else {
   return num1+num2;}
  
 }

}