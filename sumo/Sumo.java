package sumo;

public class Sumo {
	
	private Luchador luchadores[];
	private int dominados[];
	private int posicion=0;
	
	public Sumo(int cantidadDeLuchadores) {
		this.luchadores=new Luchador[cantidadDeLuchadores];
		this.dominados=new int[cantidadDeLuchadores];
	
	}
	
	public boolean agregarLuchador(int peso, int altura) {
		if(this.posicion<this.luchadores.length) {
		 this.luchadores[posicion] = new Luchador(peso,altura);
		 posicion ++;
		 return true;
		} else 
			return false;
	
	}
	
	public void resolver() {
		//hacer
	}
	
	public void mostrarResultados() {
		//hacer
	}
	
	public static void main(String[] args) {
		
		Sumo kobraKai = new Sumo(4);
		
		kobraKai.agregarLuchador(150,1800);
		//
		//		
		kobraKai.resolver();
		
		kobraKai.mostrarResultados();
		
		
		
	}

}
