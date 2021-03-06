import java.util.ArrayList;
import java.util.Scanner;

public class Lvl2People {
	
	public static int rosterSize;

	public static void main(String[] args) {
		
		ArrayList<Object> roster = new ArrayList<Object>();
		rosterSize = roster.size();
	
		People person1 = new People("Eric", "Butcher", 42);
		People person2 = new People("Boris", "Bus Driver", 36);
		People person3 = new People("Horace", "Teacher", 33);
		
		roster.add(person1);
		roster.add(person2);
		roster.add(person3);
		
		int rosterLength = roster.size();
		for (int i = 0; i < rosterLength; i++) {
			System.out.println(roster.get(i));
		}
		
		System.out.println("Please type the name of the person you would like to search for:");
		String inputRead = InputScanner(roster);
		
		for (int i=1; i < 3; i++) {
			if((String.valueOf(roster.get(i)).contains(inputRead)) == true) {
	        	System.out.println("Search results show:");
	        	System.out.println(roster.get(i));
	        } 
		}
	}
	
	public static String InputScanner(ArrayList<Object> roster) {
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		reader.close();
		return input;
		
        }
}