public class Lvl1Conditionals2 {

public static void main(String[] args) {
 boolean sumOrMult = false;
 int integerOne = 10;
 int integerTwo = 5;
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