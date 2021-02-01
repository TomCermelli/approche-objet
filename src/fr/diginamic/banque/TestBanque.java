package fr.diginamic.banque;

import fr.diginamic.banque.entite.Compte;
import fr.diginamic.banque.entite.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(4554646, 456464);
		System.out.println(c1);

		System.out.println();

		CompteTaux c2 = new CompteTaux(25435435, 1377f, 12);
		System.out.println(c2);

		System.out.println();
		System.out.println("Les infos suivante concerne la boucle avec le tableau d'objet");
		// il faut prendre la classe la plus reculé pour prendre toute les extension si
		// besoin
		Compte[] compteTab = new Compte[2];
		// par exemple un CompteTaux est une extension de Compte du coup il est possible
		// de crée CompteTaux à partir de Compte
		compteTab[0] = new Compte(1234, 15674f);
		compteTab[1] = new CompteTaux(1574, 15648f, 12);

		// Boucle classique pour afficher le contenu du tableaux compteTab[i] =
		// compteTab[0] = new Compte(1234,15674);
		for (int i = 0; i < compteTab.length; i++) {
			System.out.println(compteTab[i]);
		}

	}

}
