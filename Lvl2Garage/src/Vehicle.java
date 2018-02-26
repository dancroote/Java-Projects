class Vehicle {
	String name = "Vehicle";
	int age;
	int weight;
	String colour;

	   Vehicle(int age, int weight, String colour) {
	      this.age = age; 
	      this.weight = weight;
	      this.colour = colour;
	   }
	   public void move() {
		      System.out.println("Vehicles!");
		   }
	   public String toString() {
		   return this.name;
	   }
	   public int returnAge() {
		   return this.age;
	   }
	   public int returnWeight() {
		   return this.weight;
	   }
	   public String returnSpecial() {
		   return "NoSpecial";
	   }
}

class Car extends Vehicle {
	String name = "Car";
	boolean isAutomatic;
	
	Car(int age, int weight, String colour, boolean isAutomatic) {
	      super(age, weight, colour);
	      this.isAutomatic = isAutomatic;
	      
	   }
   public void move() {
      System.out.println("Cars!");
   }
   public String toString() {
	   return this.name;
   }
   public String returnSpecial() {
	   return String.valueOf(this.isAutomatic);
   }
}

class Motorcycle extends Vehicle {
	String name = "Motorcycle";
	String engineSize;
	
	Motorcycle(int age, int weight, String colour, String engineSize) {
	      super(age, weight, colour);
	      this.engineSize = engineSize;
	   }
   public void move() {
      System.out.println("Motorcycles!");
   }
   public String toString() {
	    return this.name;
   }
   public String returnSpecial() {
	   return String.valueOf(this.engineSize);
   }
}

class Lorry extends Vehicle {
	String name = "Lorry";
	int wheels;
	
	Lorry(int age, int weight, String colour, int wheels) {
	      super(age, weight, colour);
	      this.wheels = wheels;
	   }
   public void move() {
      System.out.println("Lorries!");
   }
   public String toString() {
	   return this.name;
   }
   public String returnSpecial() {
	   return String.valueOf(this.wheels);
   }
}
