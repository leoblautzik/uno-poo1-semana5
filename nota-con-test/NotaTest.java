package notaNuevaVarsion;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {
	
	
	@Test
	public void obtenerValorTest() {
		Nota myNota = new Nota(5);
		int esperado = 5;
		int actual = myNota.obtenerValor();
		assertEquals(esperado, actual);
	}
	
	@Test 
	public void aprobadoTest() {
		Nota myNota = new Nota(5);
		assertTrue(myNota.aprobado());
	}
	
	@Test 
	public void aprobadoJustoTest() {
		Nota myNota = new Nota(4);
		assertTrue(myNota.aprobado());
	}
	
	@Test 
	public void aprobadoFalseTest() {
		Nota myNota = new Nota(3);
		assertFalse(myNota.aprobado());
	}
	
	@Test 
	public void desAprobadoTest() {
		Nota myNota = new Nota(3);
		assertTrue(myNota.desAprobado());
	}

	@Test
	public void recuperReprobadoTest() {
		Nota myNota = new Nota(2);
		myNota.recuperar(6);
		int esperado = 6;
		int actual = myNota.obtenerValor();
		assertEquals(esperado,actual); 
	}
	@Test
	public void recuperAprobadoTest() {
		Nota myNota = new Nota(5);
		myNota.recuperar(2);
		int esperado = 5;
		int actual = myNota.obtenerValor();
		assertEquals(esperado,actual); 	
	}
	
	@Test
	public void recuperPromocionadoTest() {
		Nota myNota = new Nota(9);
		myNota.recuperar(10);
		int esperado = 10;
		int actual = myNota.obtenerValor();
		assertEquals(esperado,actual); 	
	}

}
