public class Lvl1Conditionals {

public static void main(String[] args) {
 boolean sumOrMult = true;
 int integerOne = 5;
 int integerTwo = 2;
 numberSum(integerOne,integerTwo,sumOrMult);
 System.out.println(numberSum(integerOne,integerTwo, sumOrMult));
 }

public static int numberSum(int num1, int num2, boolean trueorfalse) {

 if (trueorfalse) {
  return num1*num2; 
  } else {
   return num1+num2;}
  
 }

}