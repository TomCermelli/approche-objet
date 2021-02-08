package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Affichage de la ville la plus peuplé avec son nombre d'habitant ensuite on
 * supprime la ville la moin peuplé et pour finir on affichge le nom des villes
 * avec moin de 100_000 habitants en majuscule
 * 
 * @author tomce
 *
 */
public class TestVille {

	public static void main(String[] args) {
		List<Ville> ville = new ArrayList<Ville>(
				Arrays.asList(new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
						new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9700),
						new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600)));

		// Afficher la ville la plus peuplé
		int max = ville.get(0).getNbHabitant();

		String villeNom = ville.get(0).getNom();

		int min = ville.get(0).getNbHabitant();

		for (int i = 0; i < ville.size(); i++) {
			if (max < ville.get(i).getNbHabitant()) {
				max = ville.get(i).getNbHabitant();
				villeNom = ville.get(i).getNom();
			}
		}
		System.out.println("La ville la plus peuplé est " + villeNom + " avec un nombre d'habitant de " + max);

		// Afficher la plus petite ville
		for (int i = 0; i < ville.size(); i++) {

			if (min > ville.get(i).getNbHabitant()) {
				min = ville.get(i).getNbHabitant();
				villeNom = ville.get(i).getNom();

			}
		}

		
		System.out.println("La ville la plus petite est " + villeNom + " avec " + min
				+ " habitants, nous allons donc la supprimer");
		System.out.println();

		// Rechercher la plus petite ville pour la supprimer ensuite, version itérator
		int index = 0;

		Iterator<Ville> iter = ville.iterator();
		int minRemove = ville.get(0).getNbHabitant();
		Ville villeSupprimer = null;
		while (iter.hasNext()) { // iter.hasNext() est équivalent é i<listeInt.size()
			Ville testIter = iter.next(); // iter.next est équivalent é listeInt.get(i)
			if (minRemove > testIter.getNbHabitant()) {
				minRemove = testIter.getNbHabitant();
				villeSupprimer = testIter;
			}
			index++;
		}
		ville.remove(villeSupprimer);
		/*
		// Rechercher la plus petite ville, version boucle for
		int nbhabitant = ville.get(0).getNbHabitant();
		Ville villeRemove = null;
		String nameVille = "";
		for (int i = 0; i < ville.size(); i++) {
			if (ville.get(i).getNbHabitant() < nbhabitant) {
				nbhabitant = ville.get(i).getNbHabitant();
				nameVille = ville.get(i).getNom();
				villeRemove = ville.get(i);
			}
		}
		/*
		 * ville.remove(villeRemove); System.out.println("La ville la moin peuplé est "
		 * +nameVille+ " elle a donc été supprimé");
		 */
		System.out.println("Ville restante\n");
		// Afficher nos ville restantes
		for (int i = 0; i < ville.size(); i++) {
			System.out.print(ville.get(i));
		}
		System.out.println();
		System.out.println("Afficher les nom en UpperCase\n");
		

		iter = ville.iterator();

		while (iter.hasNext()) { // iter.hasNext() est équivalent é i<listeInt.size()
			Ville testIter = iter.next(); // iter.next est équivalent é listeInt.get(i)
			if (testIter.getNbHabitant() > 100_000) {
				testIter.setNom(testIter.getNom().toUpperCase());
			}
			index++;
		}

		for (int i = 0; i < ville.size(); i++) {
			System.out.print(ville.get(i));
		}

	}
}
