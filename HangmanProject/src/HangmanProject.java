import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanProject {
	
	public static int correctGuesses = 0;
	public static boolean noCorrectGuesses = false; 
	public static int lives = 7;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner reader = new Scanner(System.in);
		
		String[] gallowsArray = {("  _________    "),("|         |    "),("|         0    "),("|        /|\\  "),("|        / \\  "),("|              "),("|              "),("|______________")};
		Scanner s = new Scanner(new File("C:\\Users\\Admin\\eclipse-workspace\\words.txt"));
			
				ArrayList<String> wordList = new ArrayList<String>();
					while (s.hasNext()) {
						wordList.add(s.next());
					}
				s.close();
				Random rand = new Random();
				int  newrandom = rand.nextInt(wordList.size()) + 1;
				wordList.get(newrandom);
				
				System.out.println("Welcome to Hangman!");
				System.out.print("You begin with ");
				System.out.print(lives);
				System.out.println(" lives.");
				PrintGallows(lives, gallowsArray);
				
				System.out.println(wordList.get(newrandom));
				String selectedWord = wordList.get(newrandom);				//actual word
				System.out.println(selectedWord.length());
				int underscoresNeeded = (selectedWord.length());
				
				String[] wordSpace = new String[underscoresNeeded];		// word space
				String[] actualWord = new String[underscoresNeeded];	// actual word
				
					for (int i = 0; i < underscoresNeeded; i++) {
							System.out.print("_ ");
							wordSpace[i] = "_ ";
							actualWord[i] = String.valueOf(selectedWord.charAt(i));
					}
					
					do {
					
					System.out.println("");
					String guess = GuessEntry(reader);
					CorrectGuesses(actualWord, guess, wordSpace, underscoresNeeded);
					PrintGallows(lives, gallowsArray);
					Reprint(underscoresNeeded, wordSpace);
					} while  (lives > 0 && (!Arrays.equals(wordSpace, actualWord)));
					
					System.out.println();
					System.out.println("Game over!");
					
					reader.close();
					
					

	}
	public static String GuessEntry(Scanner reader) {
		
		String playerGuess;
		System.out.println("");
		System.out.print("LIVES: ");
		System.out.println(lives);
		System.out.println("Guess a letter! ");
		System.out.println();
		playerGuess = reader.next();
		return playerGuess;
	}
	
	public static String[] CorrectGuesses( String[] stringWord, String guessEntered, String[] space, int blanks) {
		for (int i = 0; i < blanks; i++) {
			if (stringWord[i].equals(guessEntered)) {
				space[i] = guessEntered;
				correctGuesses = correctGuesses +1;
			} else {
				noCorrectGuesses = true;
			}
	}
		return space;
	}
	
	public static void Reprint(int blanks, String[] space) {
		
		if (correctGuesses > 0) {
		System.out.print("You guessed ");
		System.out.print(correctGuesses);
		System.out.print(" correctly!");
		} else {
			System.out.println("INCORRECT. You lost a life.");
			lives = lives -1;
		}
		correctGuesses = 0;
		System.out.println();
			for (int j = 0; j < blanks; j++) {
				System.out.print("");
				System.out.print(space[j]);
			}
	}
	
	public static void IncorrectGuesses() {
		
	}
	
	public static void PrintGallows(int lifeNumber, String[] arrayOfGallows) {

		   for (int l = 1; l < lifeNumber+1; l++) {
			   System.out.println();
		   }
	   for (int k = lifeNumber; k < 8;k++) {
		   System.out.println(arrayOfGallows[k]);
		}
	}
}


