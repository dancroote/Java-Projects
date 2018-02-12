
public class Monster extends MapFeatures{
	
	int health;
	int aggressiveness;
	String name = "M";
	
	Monster(int health, int aggressiveness) {
		this.health = health;
		this.aggressiveness = aggressiveness;
	}
	public String toString() {
		  return name;
		}
}
