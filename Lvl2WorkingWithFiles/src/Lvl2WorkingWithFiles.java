import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lvl2WorkingWithFiles {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Person p1 = new Person("John", "Butcher", 27);
		Person p2 = new Person("Ben", "Baker", 33);
		Person p3 = new Person("Dave", "Candlestick Maker", 45);
		Person p4 = new Person("Roger", "Taxi Driver", 42);
		Person p5 = new Person("Phil", "Programmer", 51);
		
		ArrayList<Person> pArray = new ArrayList<>();

		pArray.add(p1);
		pArray.add(p2);
		pArray.add(p3);
		pArray.add(p4);
		pArray.add(p5);

		try {
		BufferedWriter bufferedWriter = 
			    new BufferedWriter(new FileWriter("C:\\Users\\Dan\\eclipse-workspace\\testfile.txt"));
		
		for(int i=0;i<pArray.size();i++) {
			bufferedWriter.write( String.valueOf(pArray.get(i).toString()) );
			bufferedWriter.write("---");
			bufferedWriter.write( String.valueOf(pArray.get(i).getOcc()) );
			bufferedWriter.write("---");
			bufferedWriter.write( String.valueOf(pArray.get(i).getAge()) );
			bufferedWriter.newLine();
			System.out.println("Complete!");
		}
		bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<Person> newArray = new ArrayList<>();
		
		String thisLine = null;
	      
	      try {
	         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dan\\eclipse-workspace\\testfile.txt"));
	         
	         while ((thisLine = br.readLine()) != null) {
	        	 String[] out = thisLine.split("---", -1);
	        	 
	        	 for(int i=0;i<out.length;i++) {
	        	 if(i%3==0) {
	        		 String name = out[i];
	        		 String occ = out[i+1];
	        		 String age = out[i+2];
	        		 Person pNew = new Person(name, occ, Integer.parseInt(age) );  
	        		 newArray.add(pNew);  
	        	 } 
	         }
	      }
	         br.close();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	      for(int k=0;k<newArray.size();k++) {
	    	  System.out.println(newArray.get(k).toString());
	      }
	}
}
