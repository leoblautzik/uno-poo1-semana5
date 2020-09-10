package notaNuevaVarsion;

public class Nota {
	
	private int nota;
	
	public Nota(int valor) {
		this.setNota(valor);
	}

	
	private void setNota(int nota) {
		this.nota = nota;
	}


	public int obtenerValor() {
		return this.getNota();
	}


	private int getNota() {
		return nota;
	}


	public boolean aprobado() {
		if(this.getNota() >= 4 && this.getNota() <= 10)
			return true;
		return false;
	}


	public boolean desAprobado() {
		if(this.getNota() < 4 && this.getNota() >=0)
			return true;
		return false;
	}


	public void recuperar(int nuevoValor){
		if(nuevoValor>this.nota)
			setNota(nuevoValor);
	}

}
