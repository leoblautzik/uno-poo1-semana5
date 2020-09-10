package enumerados;

public class TestTalles {

	public static void main(String[] args) {
		
		Talle myTalle = Talle.MEDIANO;
		Talle tuTalle = Talle.MINI;
		System.out.println(myTalle.ordinal());
		System.out.println(tuTalle.ordinal());
		System.out.println(tuTalle.toString());
		
		Talle otroTalle = Enum.valueOf(Talle.class,"GRANDE");
		System.out.println(otroTalle);
		
	}

}
