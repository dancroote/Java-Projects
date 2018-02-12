import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adventure {
	
		public static int Health = 10;
		public static int[] playerPositionInstance;
	
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
	    
		public static void main(String[] args) throws IOException {
	    	
	    	int mapHeight = 10;
	    	int mapWidth = 10;
	    	int mapArea = mapHeight*mapWidth;
	    	Random rand = new Random();

	    	int  randomNo = (rand.nextInt(9) + 1);
	    	
	    	ArrayList[][] mapArray = new ArrayList[10][10];
	    	
	    	MapFeatures monster1 = new Monster ((rand.nextInt(6) + 1),(rand.nextInt(6) + 1) );
	    	MapFeatures monster2 = new Monster ((rand.nextInt(6) + 1),(rand.nextInt(6) + 1) );
	    	MapFeatures monster3 = new Monster ((rand.nextInt(6) + 1),(rand.nextInt(6) + 1) );
	    	MapFeatures treasure = new Treasure();
	    	
	    	int[] monster1Location = { (rand.nextInt(8) + 1) ,  (rand.nextInt(8) + 1) };
	    	
	    	System.out.println(monster1Location[0]);
	    	System.out.println(monster1Location[1]);
	    
	    	int[] monster2Location = { (rand.nextInt(8) + 1), (rand.nextInt(8) + 1) };
	    	
	    	int[] monster3Location = { (rand.nextInt(8) + 1), (rand.nextInt(8) + 1) };
	    	
	    	int[] TreasureLocation = { (rand.nextInt(8) + 1), (rand.nextInt(8) + 1) };

	    	int[] PlayerLocation = { (rand.nextInt(9) + 1), (rand.nextInt(9) + 1) };
	    	
	    	for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					mapArray[i][j] = new ArrayList<MapFeatures>();;  // Will invoke overrided `toString()` method
				}
			} 
	    	
	    	mapArray[monster1Location[0]][monster1Location[1]].add(monster1);
	    	
	    	mapArray[monster2Location[0]][monster2Location[1]].add(monster2);
	    	
	    	mapArray[monster3Location[0]][monster3Location[1]].add(monster3);
	    	
	    	Player player = new Player();
	    	
	    	mapArray[TreasureLocation[0]][TreasureLocation[1]].add(treasure);
	    	
	    	mapArray[PlayerLocation[0]][PlayerLocation[1]].add(player);
	    	
	    	PrintMap(mapArray);
			
			System.out.println();
			System.out.println(PlayerLocation[0]);
			System.out.println(PlayerLocation[0]);
	    
		
		
		Scanner scanner = new Scanner(System.in);  
		
		String checkForTake = "taking";
		String checkForCompass = "compassCheck";
		String checkForHealth = "healthCheck";
		String north = "North";
		String east = "East";
		String south = "South";
		String west = "West";
		
		System.out.println("Welcome playerto the Adventure of the Barren Moor.");
		System.out.println("Press Enter to begin...");
			PressedEnter();
		System.out.println("You awake to find yourself in a Barren Moor. Your socks are wet and it's really dark.");
		System.out.println("It smells funny here and your legs hurt");
		System.out.println("Press Enter to continue...");
			PressedEnter();
		System.out.println("You don't feel so good.");
		System.out.println("---Try <Health>---");
			InputScanner(checkForHealth, scanner);
		System.out.println("You stand up and feel your foot pressed against something in the mud.");
		System.out.println("It's a compass.");
		System.out.println("---Try <Take>---");
			InputScanner(checkForTake, scanner);
		System.out.println("You Pick up the compass.");
		System.out.println("The dial spins rapidly for a few seconds then eerily stops dead.");
		System.out.println("---Try <Compass>---");
			InputScanner(checkForCompass, scanner);
		System.out.println("You check the compass.");
		playerPositionInstance = PlayerLocation;
			Compass(playerPositionInstance[0],playerPositionInstance[1],TreasureLocation[1],TreasureLocation[0]);
		System.out.println("---Try <North, South, East, West>---");
		playerPositionInstance = Play(PlayerLocation[0], PlayerLocation[1], scanner, TreasureLocation[0], TreasureLocation[1]);
		System.out.println(PlayerLocation[0]);
		System.out.println(PlayerLocation[1]);
		mapArray[PlayerLocation[0]][PlayerLocation[1]].remove(player);
		System.out.println(playerPositionInstance[0]);
		System.out.println(playerPositionInstance[1]);
		MapFeatureCheck(mapArray, monster1Location, monster2Location, monster3Location, TreasureLocation, monster1, monster2, monster3, treasure);
		mapArray[playerPositionInstance[0]][playerPositionInstance[1]].add(player);
		PrintMap (mapArray);

		mapArray[PlayerLocation[0]][PlayerLocation[1]].remove(player);
		mapArray[playerPositionInstance[0]][playerPositionInstance[1]].remove(player);
		
		while (Health>0) {
			PlayerLocation = PlayLoop(mapArray,PlayerLocation,TreasureLocation,player,scanner,monster1Location,monster2Location,monster3Location, monster1, monster2, monster3, treasure);
		}

		scanner.close();
}

		public static void PlayAllOptions(String InputCompassPlay, String checkFor, int playerLoc1, int playerLoc2, int treasureLoc2, Scanner scanner,int treasureLoc1) {
			switch (InputCompassPlay) {
			case "input" : { 
				InputScanner(checkFor, scanner);
			}
			case "compass" : { 
				Compass(playerLoc1,playerLoc2,treasureLoc2,treasureLoc1);
			}
			case "play" : {
				Play(playerLoc1, playerLoc2, scanner, treasureLoc1, treasureLoc2);
			}
			}
		}

	public static void InputScanner(String checkFor, Scanner scanner) {

			String input = scanner.nextLine();
			System.out.println(input);
			switch (checkFor) {
			case "taking" : {
				switch (String.valueOf(input)) {
				
					case "take" : case "Take" : case "TAKE" : case "t" : case "T" : 
					return;
					
					default:
						System.out.println("Invalid Input. Try again:");
						InputScanner(checkFor, scanner);
						return;
					}
				}
			case "compassCheck" : {
				switch (String.valueOf(input)) {
				
					case "compass" : case "Compass" : case "COMPASS" : case "c" : case "C" : 
					return;
					
					default:
						System.out.println("Invalid Input. Try again:");
						InputScanner(checkFor, scanner);
						return;
					}
				}
			case "healthCheck" : {
				switch (String.valueOf(input)) {
				
					case "health" : case "Health" : case "HEALTH" : case "h" : case "H" : 
						System.out.println("Your health is: " + " " + Health);
					return;
					
					default:
						System.out.println("Invalid Input. Try again:");
						InputScanner(checkFor, scanner);
						return;
					}
				}
			}
	}
	
	public static void Compass(int playerLoc1,int playerLoc2, int treasureLoc2, int treasureLoc1) {
		
		double compassResult = ( Math.sqrt(((playerLoc2-treasureLoc2)^2+1)+((playerLoc1-treasureLoc1)^2+1)) );
		System.out.println(compassResult+ "meters away.");
	}
	
public static int[] Play(int playerLoc1, int playerLoc2, Scanner scanner, int treasureLoc2, int treasureLoc1) {
		
		System.out.println();
		String input = scanner.nextLine();
		System.out.println(input);
		int[] output = {0,0};
			switch (String.valueOf(input)) {
			
			case "north" : case "North" : case "NORTH" : case "n" : case "N" : 
				playerLoc1 = playerLoc1 -1;
			break;
			
			case "east" : case "East" : case "EAST" : case "e" : case "E" : 
				playerLoc2 = playerLoc2 +1;
			break;
			
			case "south" : case "South" : case "SOUTH" : case "s" : case "S" : 
				playerLoc1 = playerLoc1 +1;
			break;
			
			case "west" : case "West" : case "WEST" : case "w" : case "W" : 
				playerLoc2 = playerLoc2 -1;
			break;
			
			case "compass" : case "Compass" : case "COMPASS" : case "c" : case "C" : 
			double compassResult = ( Math.sqrt(((playerLoc2-treasureLoc2)^2+1)+((playerLoc1-treasureLoc1)^2+1)) );
			System.out.println(compassResult+ " meters away.");
			
			case "health" : case "Health" : case "HEALTH" : case "h" : case "H" : 
				System.out.println("Your health is: " + " " + Health);
			break;
			default:
				System.out.println("Invalid Input. Try again:");
				Play(playerLoc1,playerLoc2, scanner, treasureLoc1, treasureLoc2);
				break;
			}
			
		output[0] = playerLoc1;
		output[1] = playerLoc2;
		return output;
	}

public static void MapFeatureCheck(ArrayList[][] map, int[] monster1Location, int[] monster2Location, int[] monster3Location, int[] treasureLocation, Object monster1, Object monster2, Object monster3, Object treasure) {
	if (map[playerPositionInstance[0]][playerPositionInstance[1]] == map[monster1Location[0]][monster1Location[1]]) {
		map[playerPositionInstance[0]][playerPositionInstance[1]].remove(monster1);
		System.out.println("You are attacked by a Monster!");
		System.out.println("You fight it off but lose 3 health");
		Health = Health - 3;
	}
	if (map[playerPositionInstance[0]][playerPositionInstance[1]] == map[monster2Location[0]][monster2Location[1]]) {
		map[playerPositionInstance[0]][playerPositionInstance[1]].remove(monster2);
		System.out.println("You are attacked by a Monster!");
		System.out.println("You fight it off but lose 3 health");
		Health = Health - 3;
	}
	if (map[playerPositionInstance[0]][playerPositionInstance[1]] == map[monster3Location[0]][monster3Location[1]]) {
		map[playerPositionInstance[0]][playerPositionInstance[1]].remove(monster3);
		System.out.println("You are attacked by a Monster!");
		System.out.println("You fight it off but lose 3 health");
		Health = Health - 3;
	}
	if (map[playerPositionInstance[0]][playerPositionInstance[1]] == map[treasureLocation[0]][treasureLocation[1]]) {
		map[playerPositionInstance[0]][playerPositionInstance[1]].remove(treasure);
		System.out.println("You found the treasure!");
		System.out.println("You win!!!!!!!!!!!!!!!!!!");
		System.exit(0);
	}
}
public static void PrintMap (ArrayList[][] map) {
	for(int i=0;i<10;i++) {
		System.out.println();
		for(int j=0;j<10;j++) {
		    System.out.print(map[i][j] + " ");  // Will invoke overrided `toString()` method
		}
	} 
}

public static int[] PlayLoop(ArrayList[][] mapArray, int[] PlayerLocation, int[] TreasureLocation, Object player, Scanner scanner, int[] monster1Location, int[] monster2Location, int[] monster3Location, Object monster1, Object monster2, Object monster3, Object treasure) {
			
	System.out.println("---Try <North, South, East, West, Health, Compass>---");	
		playerPositionInstance = Play(PlayerLocation[0], PlayerLocation[1], scanner, TreasureLocation[0], TreasureLocation[1]);
		mapArray[PlayerLocation[0]][PlayerLocation[1]].remove(player);
		MapFeatureCheck(mapArray, monster1Location, monster2Location, monster3Location, TreasureLocation, monster1, monster2, monster3, treasure);
		mapArray[playerPositionInstance[0]][playerPositionInstance[1]].add(player);
		PrintMap(mapArray);
		return playerPositionInstance;
		
	}
}


