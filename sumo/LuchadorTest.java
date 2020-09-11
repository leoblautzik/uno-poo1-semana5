package sumo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuchadorTest {

	@Test
	public void dominaPorAmbasTest() {
		Luchador l1 = new Luchador(150, 1800);
		Luchador l2 = new Luchador(120, 1600);
		assertTrue(l1.domina(l2));
		assertFalse(l2.domina(l1));
		
	}
	
	@Test
	public void dominaPorPesoTest() {
		Luchador l1 = new Luchador(150, 1800);
		Luchador l2 = new Luchador(120, 1800);
		assertTrue(l1.domina(l2));
		assertFalse(l2.domina(l1));
		
	}
	@Test
	public void dominaPorAlturaTest() {
		Luchador l1 = new Luchador(150, 1801);
		Luchador l2 = new Luchador(150, 1800);
		assertTrue(l1.domina(l2));
		assertFalse(l2.domina(l1));
		
	}
	public void incomparablesTest() {
		Luchador l1 = new Luchador(180, 1900);
		Luchador l2 = new Luchador(150, 2300);
		assertFalse(l1.domina(l2));
		assertFalse(l2.domina(l1));
		
	}
}
