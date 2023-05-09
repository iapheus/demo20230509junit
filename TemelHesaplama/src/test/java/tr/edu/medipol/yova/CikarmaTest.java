package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testIslemYap() {
		int sonuc = Cikarma.islemYap(80, 90);
		assertEquals(-10,sonuc);
	}

}
