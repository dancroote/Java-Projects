
public class Paint {
	
	String name;
	double tinAmount;
	double coverage;
	double price;

	public Paint(String name, double tinAmount, double coverage, double price) {
		this.name = name;
		this.tinAmount = tinAmount;
		this.coverage = coverage;
		this.price = price;
	}
		public String toString() {
			return this.name;	
	}
		public double getAmount() {
			return this.tinAmount;	
	}
		public double getCoverage() {
			return this.coverage;	
	}
		public double getPrice() {
			return this.price;	
	}
}
