public class Lvl1Iteration {

public static void main(String[] args) {
 boolean sumOrMult = false;
 int integerOne = 10;
 int integerTwo = 5;
 int outputLoopInitialIteration = 0;
 numberSum(integerOne,integerTwo,sumOrMult);
 int numberSumResult = (numberSum(integerOne,integerTwo, sumOrMult));
 outputLoop(numberSumResult, outputLoopInitialIteration);
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

public static void outputLoop(int loopValue, int iterationStart) {
	
	for (int i = iterationStart; i < 10; i++)
	{
		System.out.println(loopValue);
	}
}

}