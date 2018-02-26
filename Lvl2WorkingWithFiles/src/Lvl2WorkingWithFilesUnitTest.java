import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assume;
import org.junit.jupiter.api.Test;

class Lvl2WorkingWithFilesUnitTest {

	Lvl2WorkingWithFiles wwf = new Lvl2WorkingWithFiles();
	
	ArrayList<Object> p = new ArrayList<>();
	@Test
	void PrintNewArray() {
		assertEquals(2, wwf.Parse("2"));
	}

}
