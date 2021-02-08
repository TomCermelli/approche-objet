package fr.diginamic.chaine;

public class TestStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "";
		StringBuilder builder = new StringBuilder();
		long debut = System.currentTimeMillis();
		
		for(int i=0; i<100_000; i++) {
			//builder.append(i);
			chaine += i;
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
