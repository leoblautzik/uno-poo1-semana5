package sumo;

public class Luchador {
	
	private int peso;
	private int altura;
	
	public Luchador(int peso, int altura) {
		this.peso=peso;
		this.altura=altura;
	}

	boolean domina(Luchador otroLuchador) {

		if(this.peso > otroLuchador.peso 
				&& this.altura > otroLuchador.altura)
			return true;
		else 
			if(this.peso == otroLuchador.peso 
			&& this.altura > otroLuchador.altura)
				return true; 
			else 
				if(this.peso > otroLuchador.peso 
						&& this.altura == otroLuchador.altura)
					return true;
		return false;

	}
}
