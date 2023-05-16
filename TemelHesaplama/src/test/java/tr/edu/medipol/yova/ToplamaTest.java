package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testIslemYap() {
		int sonuc = Toplama.islemYap(80, 90);
		assertEquals(-10,sonuc);
	}

}
