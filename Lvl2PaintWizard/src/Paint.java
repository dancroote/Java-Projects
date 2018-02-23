
public class Paint {
	
	String name;
	int tinAmount;
	int coverage;
	double price;

	public Paint(String name, int tinAmount, int coverage, double price) {
		this.name = name;
		this.tinAmount = tinAmount;
		this.coverage = coverage;
		this.price = price;
	}
		public String toString() {
			return this.name;	
	}
		public double getPrice() {
			return this.price;	
	}
}
