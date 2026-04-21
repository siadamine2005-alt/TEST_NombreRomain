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
	
	@Test
	void testIter3() {
		assertThrows(IllegalArgumentException.class, () -> cf.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, () -> cf.toChiffresRomains(4000));
		assertThrows(IllegalArgumentException.class, () -> cf.toChiffresRomains(-1));
	}
	
	@Test
	void testIter4() {
		assertEquals("IV", cf.toChiffresRomains(4));
	}
	
	@Test
	void testIter5() {
		assertEquals("V", cf.toChiffresRomains(5));
		assertEquals("VI", cf.toChiffresRomains(6));
		assertEquals("VIII", cf.toChiffresRomains(8));
	}

}
