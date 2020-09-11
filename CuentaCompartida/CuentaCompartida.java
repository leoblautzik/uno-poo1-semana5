package CuentaCompartida;

public class CuentaCompartida {
	private double [] consumosPorComensal;
	
	public CuentaCompartida(int cantidadDeComensales) {
		this.consumosPorComensal = new double[cantidadDeComensales];
	}
	
	public void agregarConsumo(int comensal, double monto) {
		this.consumosPorComensal[comensal-1] += monto;
	}

	public double consumosDelComensal(int i) {
		return this.consumosPorComensal[i-1];
	}

	public double calcularTotalDeLaCuenta() {
		double total = 0;
		for(int i=0; i<this.consumosPorComensal.length; i++)
			total+=this.consumosPorComensal[i];
		return total;
	}
	
	public double importePorComensal() {
		return this.calcularTotalDeLaCuenta()/this.consumosPorComensal.length;
	}
	
	public int comensalesDentroDelRango(double inferior, double superior) {
		int contador = 0;
		for(int i=0; i<this.consumosPorComensal.length; i++)
			if(this.consumosPorComensal[i]>=inferior && this.consumosPorComensal[i]<=superior)
				contador++;
		return contador;
	}

	public int comensalesPerjudicados() {
		int contador = 0;
		for(int i=0; i<this.consumosPorComensal.length; i++)
			if(this.consumosPorComensal[i] < this.importePorComensal())
				contador++;
		return contador;
	}


}
