package fr.diginamic.chaines;


public class ManipulationChaine {
	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("La longueur de la chaine de caractère : " +chaine.length());
		System.out.println("Nombre de caractère jusqu'au premier `;` : " +chaine.indexOf(";"));
		System.out.println("Portion de code extraite entre `Durand` et `Marcel` " +chaine.substring(0, 13));
		System.out.println("Le nom de famille de Durand est : " +chaine.substring(7, chaine.indexOf(";2")) );
		System.out.println("Le nom de famille de Durand en majuscule est : " +chaine.substring(7, chaine.indexOf(";2")).toUpperCase() );
		System.out.println("Le nom de famille de Durand en minuscule est : " +chaine.substring(7, chaine.indexOf(";2")).toLowerCase() );
		
		
		String[] parts = chaine.split(";");
		System.out.println();
		for(int i=0; i<parts.length; i++) {
			System.out.println("i = " +i+ " "+parts[i]);
		}
	}
}
