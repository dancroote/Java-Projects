import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Lvl2Garage {

   public static void main(String args[]) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
      Vehicle v1 = new Car(10, 200, "Green", true, 11);   // Vehicle reference and object
      Vehicle v2 = new Car(13, 180, "Blue", false, 12);   // Vehicle reference but Car object
      Vehicle v3 = new Motorcycle(4, 70, "Black", "125cc", 13);   // Vehicle reference and object
      Vehicle v4 = new Lorry(8, 400, "Grey", 12, 14);
      
      //System.out.println(v4.returnSpecial());
      //v1.move();   // runs the method in Vehicle class
      //v2.move();   // runs the method in Car class
      
      
      ArrayList<Vehicle> vehicleArray = new ArrayList<>();
      
      vehicleArray.add(v1);
      vehicleArray.add(v2);
      vehicleArray.add(v3);
      vehicleArray.add(v4);
      
      System.out.println(vehicleArray.size());
      
      String v= v1.name;
      for (int i=2; i >1;) {
      System.out.println("What would you like to do?");
      System.out.println("---Try List/Add/Remove/Empty--- ");
      String actionChoice = scanner.nextLine();
      switch (actionChoice) {
      case "List" : case "list" : case "LIST" : case "l" : case "L" : PrintList(vehicleArray);
      break;
      case "Add" : case "add" : case "ADD" : case "a" : case "A" : AddVehicle(vehicleArray, scanner);
      break;
      case "Remove" : case "remove" : case "REMOVE" : case "r" : case "R" : RemoveVehicle(vehicleArray, scanner);
      break;
      case "Empty" : case "empty" : case "EMPTY" : case "e" : case "E" : EmptyGarage(vehicleArray, scanner);
      break;
      }
      }
      scanner.close();
   }
   
   public static int BillCalc(Object vehicle, String name, int age, int weight, String special) {
	   int typeDependantVar = 0; 
	   switch(name) {
	   case "Car" : switch(special) {
	   case "true" : typeDependantVar = 125; break;
	   case "false" : typeDependantVar = 10; break;
	   }
	   case "Motorcycle" : switch(special) {
	   case "125cc" : typeDependantVar = 130;  break;
	   }
	   case "Lorry" : switch(special) {
	   case "12" : typeDependantVar = 100;  break;
	   }
	   }
	   
	   int bill = (age + weight) * typeDependantVar;
	   return bill;
   }
   
   public static void AddVehicle(ArrayList<Vehicle> vehicleArray, Scanner scanner) {
	   
	   System.out.println("What kind of vehicle would you like to add? <<Car,Motorcycle,Lorry>>");
	   String newVType = scanner.nextLine();
	   System.out.println("How many years old is this " + newVType + "?");
	   String newVAge = scanner.nextLine();
	   System.out.println("How much does this " + newVAge + " year old " + newVType + " weigh? <<Kg>>");
	   String newVWeight = scanner.nextLine();
	   System.out.println("What colour is this " + newVAge + " year old " + newVType + "?");
	   String newVColour = scanner.nextLine();
	   boolean autoTruth = false;
	   int newVWheels = 0;
	   String newVEngine = null; 
	   switch (newVType) {
	   case "car" : case "Car" : case "CAR" : System.out.println("Is this " + newVType + " automatic?");
	   				String newVAuto = scanner.nextLine();
	   				switch (String.valueOf(newVAuto)) {
	   				case "true" : case "True" : case "TRUE" : case "yes" : case "Yes" : case "YES" : case "Y" : case "y" : autoTruth = true; break;
	   				case "false" : case "False" : case "FALSE" : case "no" : case "No" : case "NO" : case "N" : case "n" : autoTruth = false; break;
	   				} break;
	   case "Motorcycle" : case "motorcycle" : case "MOTORCYCLE" : case "Bike" : case "bike"  : case "BIKE" : System.out.println("How large is this " + newVType + " 's engine? <<cc>>");
			newVEngine = scanner.nextLine();
			newVEngine = String.valueOf(newVEngine); break; 	
	   case "lorry" : case "Lorry" : case "LORRY" : System.out.println("How many wheels does this " + newVType + " have?");
	   		newVWheels = scanner.nextInt();	
	   }
	   System.out.println("Please give this " + newVType + " a new ID reference number");
	   int newVID = scanner.nextInt();
	   	   
	   switch (newVType) {
	   case "car" : case "Car" : case "CAR" : Vehicle newC = new Car(Integer.parseInt(newVAge), Integer.parseInt(newVWeight), newVColour, autoTruth, newVID); vehicleArray.add(newC); break;
	   case "Motorcycle" : case "motorcycle" : case "MOTORCYCLE" : case "Bike" : case "bike"  : case "BIKE" : Vehicle newM = new Motorcycle(Integer.parseInt(newVAge), Integer.parseInt(newVWeight), newVColour, newVEngine, newVID); vehicleArray.add(newM); break;
	   case "lorry" : case "Lorry" : case "LORRY" : Vehicle newL = new Lorry(Integer.parseInt(newVAge), Integer.parseInt(newVWeight), newVColour, newVWheels, newVID); vehicleArray.add(newL); break;
	   } 
	   
   }
   public static void PrintList (ArrayList vehicleArray) {
	   for (int i=0;i<vehicleArray.size();i++) {
	    	  // System.out.println(vehicleArray.get(i));
	    	  //System.out.println( String.valueOf((vehicleArray.get(i)).returnSpecial()));
	    	  System.out.println("Vehicle Type: " + ((Vehicle) vehicleArray.get(i)).returnColour() + " " + vehicleArray.get(i).getClass().getName() + " | ID:" + ((Vehicle) vehicleArray.get(i)).returnID() );
	    	  System.out.println("Price: ");
	    	  System.out.println( "£" + BillCalc(vehicleArray.get(i),vehicleArray.get(i).getClass().getName(),((Vehicle) vehicleArray.get(i)).returnAge(),((Vehicle) vehicleArray.get(i)).returnWeight(), String.valueOf(((Vehicle) vehicleArray.get(i)).returnSpecial())) );
	      }
   }
   public static void RemoveVehicle(ArrayList vehicleArray, Scanner scanner) {
	   System.out.println("By what method would you like to remove vehicle(s)?");
	   System.out.println("---Try ID/Type--");
	   String removeMethod = scanner.nextLine();
	   switch (removeMethod) {
	   case "ID" : case "id" : case "Id" : case "iD" :
		   System.out.println("Please enter the ID of the vehicle you wish to delete.");
		   String deleteVID = scanner.nextLine();
		   System.out.println("Is this the vehicle you'd like to delete?");
		   Object retrievedVehicleByID = SearchForID(vehicleArray, deleteVID);
		   System.out.println(SearchForID(vehicleArray, deleteVID));
		   String yesOrNoDelID = scanner.nextLine();
		   switch (yesOrNoDelID) {
		   case "Yes" : case "yes" : case "YES" : case "Y" : case "y" :
			   vehicleArray.remove(retrievedVehicleByID);
			   System.out.println("The " + retrievedVehicleByID + " has been removed from the Garage." ); break;
		   case "No" : case "NO" : case "no" : case "N" : case "n" :
			   break;
		   }
	    case "Type" : case "type" : case "TYPE" :
	    	System.out.println("Please enter the type of the vehicles you wish to delete");
	    	System.out.println("---Try Car/MotorCycle/Lorry---");
	    	String deleteVType = scanner.nextLine();
	    	switch (deleteVType) {
	    		case "car" : case "Car" : case "CAR" : case "c" : case "C" :
	    			deleteVType = "Car"; break;
	    		case "Motorcycle" : case "motorcycle" : case "MOTORCYCLE" : case "m" : case "M" : case "Bike" : case "BIKE" : case "bike" : case "b" : case "B" :
	    			deleteVType = "Motorcycle"; break;
	    		case "lorry" : case "Lorry" : case "LORRY" : case "l" : case "L" :
	    			deleteVType = "Lorry"; break;
	    	}
	    	System.out.println("Are these the vehicles you'd like to delete?");
			Object retrievedVehicleByType = SearchForType(vehicleArray, deleteVType);
			System.out.println(SearchForType(vehicleArray, deleteVType));
			String yesOrNoDelType = scanner.nextLine();
			   switch (yesOrNoDelType) {
			   case "Yes" : case "yes" : case "YES" : case "Y" : case "y" :
				   for (int i=0; i<vehicleArray.size();i++) {
					   if (vehicleArray.get(i).toString() == deleteVType) {
						   vehicleArray.remove(vehicleArray.get(i));
					   }
				   }
				   vehicleArray.remove(retrievedVehicleByType);
				   System.out.println("Every " + retrievedVehicleByType + " has been removed from the Garage." ); break;
			   case "No" : case "NO" : case "no" : case "N" : case "n" :
				   break;
			   }
	   }
	   
   }
   
   public static Object SearchForID(ArrayList vehicleArray, String deletionID) {
	   Object searchedVehicle = "";
	   for (int i=0; i<vehicleArray.size();i++) {
		   if (((Vehicle) vehicleArray.get(i)).returnID() == Integer.parseInt(deletionID)) {
			   searchedVehicle = vehicleArray.get(i);
		   }
	   }
	   return searchedVehicle;
   }
   
   public static Object SearchForType(ArrayList vehicleArray, String deletionType) {
	   Object searchedVehicle = "";
	   for (int i=0; i<vehicleArray.size();i++) {
		   if (((Vehicle) vehicleArray.get(i)).toString() == deletionType) {
			   searchedVehicle = vehicleArray.get(i);
		   }
	   }
	   return searchedVehicle;
   }
   
   public static void EmptyGarage(ArrayList vehicleArray, Scanner scanner) {
	   System.out.println("Are you sure you'd like to remove ALL entries from the Garage?");
	   String yesOrNo = scanner.nextLine();
	   switch(yesOrNo) {
	   case "Yes" : case "YES" : case "yes" : case "Y" : case "y" :
		   vehicleArray.clear();
		   System.out.println("You have successfully emptied every entry from the Garage.");
	   default : break;
	   }
	   
   }
}