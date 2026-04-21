package romain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainsTest {
	
	private ChiffresRomains cf;

	@BeforeEach
	void setUp() throws Exception {
		cf = new ChiffresRomains();
	}

	@Test
	void testIter1() {
		assertEquals("I", cf.toChiffresRomains(1));
	}
	
	@Test
	void testIter2() {
		assertEquals("II", cf.toChiffresRomains(2));
		assertEquals("III", cf.toChiffresRomains(3));
	}

}
