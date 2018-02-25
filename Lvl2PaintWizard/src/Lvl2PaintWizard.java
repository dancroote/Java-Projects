import java.text.DecimalFormat;
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
		double roomSize = scanner.nextDouble();
		System.out.println("The prices to paint a room of " + roomSize + "m^2 are:");
		
		for(int j=0;j<paintArray.size();j++) {
			DecimalFormat numberFormat = new DecimalFormat("#0.00");
			double cost = BillCalc(paintArray.get(j), roomSize);
			double wastage = Wastage(paintArray.get(j), roomSize);
			String formattedCost = numberFormat.format(cost);
			String formattedWastage = numberFormat.format(wastage);
			System.out.println("£" + formattedCost + " 	" + paintArray.get(j).toString());
			System.out.println("With " + formattedWastage + " Litres left over.");
			System.out.println();
		}
		
		System.out.print("The cheapest being: ");
		System.out.print(Cheapest(roomSize, paintArray));
		System.out.println(" for any room.");
		
	}
	public static double BillCalc(Object paint, double roomSize) {
		double paintPrice = ((Paint) paint).getPrice();
		double paintAmount = ((Paint) paint).getAmount();
		double paintCoverage = ((Paint) paint).getCoverage();;
		double totalPrice = ((paintPrice * roomSize) / (paintAmount * paintCoverage));
		return totalPrice;
	}
	public static String Cheapest(double roomSize, ArrayList paintArray) {
		String cheapestPaint = "";
		double cost = BillCalc(paintArray.get(0), roomSize);
		cheapestPaint = paintArray.get(0).toString();
		for(int k=0;k<paintArray.size();k++) {
			if ( BillCalc(paintArray.get(k), roomSize) < cost ) {
				cost = BillCalc(paintArray.get(k), roomSize);
				cheapestPaint = paintArray.get(k).toString();
			}
		}
		return cheapestPaint;
	}
	public static double Wastage(Object paint, double roomSize) {
		double paintCoverage = ((Paint) paint).getCoverage();;
		double paintAmount = ((Paint) paint).getAmount();
		double totalLitresRequired = roomSize/paintCoverage;
		double wastage = totalLitresRequired/paintAmount;
		return wastage;
	}
}
