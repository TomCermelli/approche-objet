package utils;

public class ConversionNombre {
	public String chaine;
	public int conversion;

	// La m�thode main ou on effectue nos lancement de m�thode
	public static void main(String[] args) {

		String strTest = "450";
		int result = ConversionNombre.convertirString(strTest);

		System.out.println(result);

		int a = 5;
		int b = -2;

		int calcul = Integer.max(a, b);

		System.out.println(calcul);

	}

	public static int convertirString(String chaineString) {
		int change = Integer.parseInt(chaineString);
		return change;
	}

}
