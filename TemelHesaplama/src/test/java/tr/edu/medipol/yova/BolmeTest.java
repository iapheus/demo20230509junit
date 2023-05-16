package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testIslemYap() {
		int sonuc = Bolme.islemYap(80, 90);
		assertEquals(-10,sonuc);
	}

}
