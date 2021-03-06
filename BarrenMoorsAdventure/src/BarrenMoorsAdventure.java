import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import MapFeatures.Monster;

public class BarrenMoorsAdventure {
		 
	    public static void PressedEnter() {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); {
	        while(true){
	            String s = null;
	            try {
	                s = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if(s.length() == 0){
	                break;
	            	}
	        	}
	        }
	    }
	    
	    public static void SetMap() {
	    	
	    	int mapHeight = 10;
	    	int mapWidth = 10;
	    	int mapArea = mapHeight*mapWidth;
	    	
	    	int[][] mapArray = new int[mapHeight][mapWidth];
	    	
	    	MapFeatures monster1 = new Monster (1,1,1)


			ArrayList<Object> features = new ArrayList<Object>();
	    	
	    }
	    
	public static void main(String[] args) throws IOException {
		
		
		Scanner scanner = new Scanner(System.in);  
		
		String checkForTake = "taking";
		String checkForCompass = "compassCheck";
		
		System.out.println("Welcome to the Adventure of the Barren Moor.");
		System.out.println("Press Enter to begin...");
			PressedEnter();
		System.out.println("You awake to find yourself in a Barren Moor. Your socks are wet and it's really dark.");
		System.out.println("It smells funny here and your foot hurts");
		System.out.println("Press Enter to continue...");
			PressedEnter();
		System.out.println("You stand up and feel your foot pressed against something in the mud.");
		System.out.println("It's a compass.");
		System.out.println("---Try <Take>---");
		InputScanner(checkForTake, scanner);
		System.out.println("You Pick up the compass.");
		System.out.println("The dial spins rapidly for a few seconds then eerily stops dead.");
		System.out.println("---Try <Compass>---");
		InputScanner(checkForCompass, scanner);
		System.out.println("You check the compass.");
		
		
		
		scanner.close();
	}

	public static void InputScanner(String checkFor, Scanner scanner) {

			String input = scanner.nextLine();
			System.out.println(input);
			switch (checkFor) {
			case "taking" : {
				switch (String.valueOf(input)) {
				
					case "take" : case "Take" : case "TAKE" : 
					return;
					
					default:
						System.out.println("Invalid Input. Try again:");
						InputScanner(checkFor, scanner);
						return;
					}
				}
			case "compassCheck" : {
				switch (String.valueOf(input)) {
				
					case "compass" : case "Compass" : case "COMPASS" : 
					return;
					
					default:
						System.out.println("Invalid Input. Try again:");
						InputScanner(checkFor, scanner);
						return;
					}
				}
		 }
	}
}


