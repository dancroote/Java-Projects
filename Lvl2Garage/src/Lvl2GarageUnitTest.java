import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lvl2GarageUnitTest {

	Lvl2Garage g = new Lvl2Garage();
	Vehicle vTest = new Car(10, 200, "Green", true);
	
	@Test
	public void BillCalc() {
		assertEquals(21,21, Lvl2Garage.BillCalc(vTest, "Car", 10, 200, "true")/1000);
	}

}
