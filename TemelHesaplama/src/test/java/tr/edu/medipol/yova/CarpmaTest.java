package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testIslemYap() {
		int sonuc = Carpma.islemYap(80, 90);
		assertEquals(-10,sonuc);
	}

}
