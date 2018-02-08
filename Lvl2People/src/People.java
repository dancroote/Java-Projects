
public class People {
		public String name;
		public String job;
		public int age;
		
		public People(String name, String job, int age) {
			this.name = name;
			this.job = job;
			this.age = age;
	}
		public String toString() {
			return (name + " " + job + " " + String.valueOf(age));
		}
		
		public String getName(){
			            return name;
		}
}
