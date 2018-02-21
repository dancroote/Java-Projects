import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Lvl2Garage {

   public static void main(String args[]) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
      Vehicle v1 = new Car(10, 200, "Green", true);   // Vehicle reference and object
      Vehicle v2 = new Car(13, 180, "Blue", false);   // Vehicle reference but Car object
      Vehicle v3 = new Motorcycle(4, 70, "Black", "125cc");   // Vehicle reference and object
      Vehicle v4 = new Lorry(8, 670, "Grey", 12);
      
      v1.move();   // runs the method in Vehicle class
      v2.move();   // runs the method in Car class
      
      
      ArrayList<Vehicle> vehicleArray = new ArrayList<>();
      
      vehicleArray.add(v1);
      vehicleArray.add(v2);
      vehicleArray.add(v3);
      vehicleArray.add(v4);
      
      String v= v1.name;
      
      
      
      for (int i=0;i<vehicleArray.size();i++) {
    	  // System.out.println(vehicleArray.get(i));
    	  //System.out.println( String.valueOf((vehicleArray.get(i)).returnSpecial()));
    	  System.out.println("Vehicle Type: " + vehicleArray.get(i).colour + " " + vehicleArray.get(i).getClass().getName());
    	  System.out.println("Price: ");
    	  System.out.println( "£" + BillCalc(vehicleArray.get(i),vehicleArray.get(i).getClass().getName(),vehicleArray.get(i).age,vehicleArray.get(i).weight, String.valueOf((vehicleArray.get(i)).returnSpecial())) );
      }
      scanner.close();
   }
   
   public static int BillCalc(Object vehicle, String name, int age, int weight, String special) {
	   int typeDependantVar = 0; 
	   switch(name) {
	   case "Car" : switch(special) {
	   case "true" : typeDependantVar = 125;
	   case "false" : typeDependantVar = 100;
	   }
	   case "Motorcycle" : switch(special) {
	   case "125cc" : typeDependantVar = 130;
	   }
	   case "Lorry" : switch(special) {
	   case "12" : typeDependantVar = 10;
	   }
	   }
	   
	   int bill = (age + weight) * typeDependantVar;
	   return bill;
   }
   
   public static void AddVehicle(ArrayList vehicleArray, Scanner scanner) {
	   
	   System.out.println("What kind of vehicle would you like to add? <<Car,Motorcycle,Lorry>>");
	   String newVType = scanner.nextLine();
	   System.out.println("How many years old is this " + newVType + "?");
	   String newVAge = scanner.nextLine();
	   System.out.println("How much does this " + newVAge + " year old " + newVType + " weigh? <<Kg>>");
	   String newVWeight = scanner.nextLine();
	   System.out.println("What colour is this " + newVAge + " year old " + newVType + "?");
	   String newVColour = scanner.nextLine();
	   switch (newVType) {
	   case "Car" : System.out.println("Is this " + newVType + " automatic?");
	   				String newVAuto = scanner.nextLine();
	   				boolean autoTruth;
	   				switch (String.valueOf(newVAuto)) {
	   				case "true" : autoTruth = true;
	   				case "false": autoTruth = false;
	   				}
	   case "Motorcycle" : System.out.println("How large is this" + newVType + "'s engine? <<cc>>");
			String newVEngine = scanner.nextLine();
			newVEngine = String.valueOf(newVEngine); 
			
	   case "Lorry" : System.out.println("How many wheels does this" + newVType + " have?");
		int newVWheels = scanner.nextInt();	
	   }
	   System.out.println("Please give this" + newVType + "a new ID reference number");
	   int newVID = scanner.nextInt();
	   
	   
   Vehicle v1 = new Car(10, 200, "Green", true);   // Vehicle reference and object
   }
}