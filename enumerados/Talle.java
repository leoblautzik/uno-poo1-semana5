package enumerados;

public enum Talle { 
	MINI("Small"), 
	MEDIANO("Medium"), 
	GRANDE("Large"), 
	EXTRA_GRANDE("XL");

	private final String etiqueta;

	private Talle(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	public String toString() {
		return this.etiqueta;
	}

}


