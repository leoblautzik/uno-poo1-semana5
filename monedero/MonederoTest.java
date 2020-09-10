import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MonederoTest {
	
	private Monedero monederito;
	
	@Before
	public void setUp() throws Exception {
		monederito = new Monedero(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void consultarDineroTest() {
		this.monederito.ponerDinero(1000);	
		double esperado = 1000;
		double actual = monederito.consultarDineroDisponible();
		assertEquals(esperado, actual, 0.001);
		// 2.000000001 - 2.000001 < 0.001  True		
	}
	
	@Test
	public void ponerDineroTest() {
		monederito.ponerDinero(100);
		double esperado = 100;
		double actual = monederito.consultarDineroDisponible();
		assertEquals(esperado, actual, 0.001);
			
	}
	
	@Test 
	public void sacarDineroSuficiente() {
		this.monederito.ponerDinero(1000);
		this.monederito.sacarDinero(900);
		double esperado = 100;
		double actual = this.monederito.consultarDineroDisponible();
		assertEquals(esperado, actual, 0.001);
		
	}
	
	@Test 
	public void sacarDineroJusto() {
		this.monederito.ponerDinero(1000);
		this.monederito.sacarDinero(1000);
		double esperado = 0;
		double actual = this.monederito.consultarDineroDisponible();
		assertEquals(esperado, actual, 0.001);
		
	}
	
	@Test 
	public void sacarDineroJustoBool() {
		this.monederito.ponerDinero(1000);
		assertTrue(this.monederito.sacarDinero(1000));
		
	}
	
	@Test 
	public void sacarDineroTestVacio(){
		assertFalse(this.monederito.sacarDinero(10));
				
	}
	
	@Test
	public void sacarDineroTestInsuficiente() {
		this.monederito.ponerDinero(900);		
		assertFalse(this.monederito.sacarDinero(901));
		
	}

}


