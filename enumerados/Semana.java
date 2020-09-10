package enumerados;

public enum Semana { 
		
	LUNES ("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Miércoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sábado"),
	DOMINGO("Domingo");
		
	private String etiqueta;
	
	private Semana (String etiqueta) {
		this.etiqueta=etiqueta;
	}
	
	public String toString() {
		return this.etiqueta;
	}


}
