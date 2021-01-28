package utils;

public class ConversionNombre {
	public String chaine;
	public int conversion;
	
	// La méthode main ou on effectue nos lancement de méthode
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
