/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

/**
 * @author tomce
 *
 */
public class TestTheatre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Theatre theatre = new Theatre("Sydney", 10, 3, 1000);
		System.out.println("Le théatre peut accueillir : " + theatre.getNbMax() + " personnes");
		System.out.println(
				"Il y a " + theatre.getClient() + " clients inscrit actuellement\nLa recette total actuel du théatre "
						+ theatre.getNom() + " est de : " + theatre.getArgentTotal() + "$");
		theatre.inscrire(3, 550);
		System.out.println();
		System.out.println(
				"Il y a " + theatre.getClient() + " clients inscrit actuellement\nLa recette total actuel du théatre "
						+ theatre.getNom() + " est de : " + theatre.getArgentTotal() + "$");

		theatre.inscrire(2, 550);
		System.out.println();
		System.out.println(
				"Il y a " + theatre.getClient() + " clients inscrit actuellement\nLa recette total actuel du théatre "
						+ theatre.getNom() + " est de : " + theatre.getArgentTotal() + "$");

		System.out.println();
		theatre.inscrire(1, 550);
		System.out.println(
				"Il y a " + theatre.getClient() + " clients inscrit actuellement\nLa recette total actuel du théatre "
						+ theatre.getNom() + " est de : " + theatre.getArgentTotal() + "$");

		// Décommentez le code en dessous pour avoir "Vous avez rentré trop de
		// participant seulement x personnes ont pus s'inscrire sur les x participants"
		/*
		 * System.out.println(); theatre.inscrire(2, 550); System.out.println("Il y a "
		 * +theatre.getClient()+
		 * " clients inscrit actuellement\nLa recette total actuel du théatre "
		 * +theatre.getNom()+ " est de : " +theatre.getArgentTotal()+ "$");
		 */

		// Decommentez le code en dessous pour avoir "Il n'y a plus de place dans le
		// théatre"
		/*
		 * System.out.println(); theatre.inscrire(1, 2314); System.out.println("Il y a "
		 * +theatre.getClient()+
		 * " clients inscrit actuellement\nLa recette total actuel du théatre "
		 * +theatre.getNom()+ " est de : " +theatre.getArgentTotal()+ "$");
		 * 
		 * System.out.println(); theatre.inscrire(2, 5048);
		 */

	}

}
