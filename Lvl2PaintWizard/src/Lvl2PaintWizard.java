import java.util.ArrayList;
import java.util.Scanner;

public class Lvl2PaintWizard {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
	
		Paint p1 = new Paint("CheapoMax", 20, 10, 19.99);
		Paint p2 = new Paint("AverageJoes", 15, 11, 17.99);
		Paint p3 = new Paint("DuluxourousPaints", 10, 20, 25.00);
		
		ArrayList<Paint> paintArray = new ArrayList<>();

		paintArray.add(p1);
		paintArray.add(p2);
		paintArray.add(p3);
		
		System.out.println("Welcome to the PaintWizard.");
		System.out.println("The Paints available are:");
		
		for(int i=0;i<paintArray.size();i++) {
			System.out.println(paintArray.get(i).toString() + "	£" + paintArray.get(i).getPrice() + " per Litre");
		}
		
		System.out.println("How many square meters of surface are to be painted?");
		int roomSize = scanner.nextInt();
		
	}
}
