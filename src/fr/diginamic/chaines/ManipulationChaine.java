package fr.diginamic.chaines;

import entites.Salaire;

public class ManipulationChaine {
	public static void main(String[] args) {

		// Tp 1 - 6
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("La longueur de la chaine de caractère : " + chaine.length());
		System.out.println("Nombre de caractère jusqu'au premier `;` : " + chaine.indexOf(";"));
		System.out.println("Portion de code extraite entre `Durand` et `Marcel` " + chaine.substring(0, 13));
		System.out.println("Le nom de famille de Durand est : " + chaine.substring(7, chaine.indexOf(";2")));
		System.out.println("Le nom de famille de Durand en majuscule est : "
				+ chaine.substring(7, chaine.indexOf(";2")).toUpperCase());
		System.out.println("Le nom de famille de Durand en minuscule est : "
				+ chaine.substring(7, chaine.indexOf(";2")).toLowerCase());

		// Tableau de "chaine"
		String[] parts = chaine.split(";");
		System.out.println();
		for (int i = 0; i < parts.length; i++) {
			System.out.println("i = " + i + " " + parts[i]);
		}
		System.out.println();

		// Salaire
		Salaire salaire = new Salaire();
		salaire.setNom(parts[0]);
		salaire.setPrenom(parts[1]);
		salaire.setSalaire(Double.parseDouble(parts[2].replaceAll(" ", "")));

		System.out.println("Nom : " + salaire.getNom() + "\nPrenom : " + salaire.getPrenom() + "\nSalaire : "
				+ salaire.getSalaire());

	}
}
