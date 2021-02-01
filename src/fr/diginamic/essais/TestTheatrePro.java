package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		/*
		 * private String nom; private String type; private float tarifUnitaire; private
		 * short capacitySpectacle; private short inscrit;
		 */
		TheatrePro theatre = new TheatrePro();
		theatre.ajouterSpectacle(new Spectacle("ShakeSpear", "concert", 15.5f, (short) 20, (short) 18));
		theatre.ajouterSpectacle(new Spectacle("Les rigolos", "comédit", 10.5f, (short) 15, (short) 11));
		theatre.ajouterSpectacle(new Spectacle("Test d'impro", "improvisation", 5.5f, (short) 5, (short) 2));
		theatre.ajouterSpectacle(new Spectacle("Dance Floor", "dance", 8f, (short) 10, (short) 3));

		System.out.println("Tableau initial : ");
		theatre.getSpectacleTab();
		System.out.println("\n\n");

		System.out.println("Tentative d'ajout d'un nom inexistant :");
		System.out.println(theatre.inscrire(2, "ShakeSpdsqdsear"));
		theatre.getSpectacleTab();
		System.out.println("\n\n");

		System.out.println("Tentative quand il y a de la place :");
		System.out.println(theatre.inscrire(2, "ShakeSpear"));
		System.out.println();
		theatre.getSpectacleTab();
		System.out.println("\n\n");

	
		System.out.println("Tentative quand c'est plein");
		System.out.println(theatre.inscrire(4, "ShakeSpear"));
		System.out.println();

		theatre.getNbTotalClients();
		theatre.getRecetteTotal();

	}

}
