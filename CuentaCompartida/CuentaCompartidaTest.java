package CuentaCompartida;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CuentaCompartidaTest {
	CuentaCompartida myCuenta;
	
	@Before
	public void setUp() throws Exception {
		myCuenta = new CuentaCompartida(4);
		myCuenta.agregarConsumo(1, 100);
		myCuenta.agregarConsumo(2, 200);
		myCuenta.agregarConsumo(3, 300);
		myCuenta.agregarConsumo(4, 400);
		myCuenta.agregarConsumo(3, 550);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void agregarConsumoTest() {
		double esperado = 620.50;
		myCuenta.agregarConsumo(1, 520.50);
		double actual = myCuenta.consumosDelComensal(1);
		assertEquals(esperado, actual, 0.001);
	}
	
	@Test
	public void calcularTotalDeLaCuentaTest() {
		double esperado = 1550;
		double actual = myCuenta.calcularTotalDeLaCuenta();
		assertEquals(esperado, actual, 0.001);
	}
	
	@Test
	public void cuantoPagaCadaComensalTest() {
		double esperado = 1550.0/4;
		double actual = myCuenta.importePorComensal();
		assertEquals(esperado, actual, 0.001);
	}
	
	@Test
	public void comensalesDentroDelRangoTest() {
		int esperado = 2;
		int actual = myCuenta.comensalesDentroDelRango(300,1000);
		assertEquals(esperado, actual);
		
	}
	@Test
	public void comensaPerjudicadosTest() {
		int esperado = 2;
		int actual = myCuenta.comensalesPerjudicados();
		assertEquals(esperado, actual);
		
	}
	

}
