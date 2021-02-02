package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> ville = new ArrayList<Ville>(
				Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400),
						new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200),
						new Ville("Marseille", 850700), new Ville("Tarbes", 40600)));

		// Afficher la ville la plus peuplé
		int max = 0;
		int index = 0;
		int compteur = 0;
		String villeNom = "";
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
				System.out.println(min);
			}
		}

		System.out.println();
		System.out.println("La ville la plus petite est " + villeNom + " avec " + min
				+ " habitants, nous allons donc la supprimer");
		System.out.println();

		// Rechercher la plus petite ville pour la supprimer ensuite, version itérator
		Iterator<Ville> iter = ville.iterator();
		int minRemove = ville.get(0).getNbHabitant();
		Ville villeSupprimer = null;
		while (iter.hasNext()) { // iter.hasNext() est équivalent à i<listeInt.size()
			Ville testIter = iter.next(); // iter.next est équivalent à listeInt.get(i)
			if (minRemove > testIter.getNbHabitant()) {
				minRemove = testIter.getNbHabitant();
				villeSupprimer = testIter;
			}
			index++;
		}

		ville.remove(villeSupprimer);

		System.out.println("Nom de la ville : " + villeNom + " habitants : " + minRemove);
		System.out.println();
		
		
		
		//Rechercher la plus petite ville, version boucle for
		int nbhabitant = ville.get(0).getNbHabitant();
		Ville villeRemove = null;
		String nameVille = "";
		for(int i=0; i<ville.size(); i++) {
			if(ville.get(i).getNbHabitant() < nbhabitant ) {
				nbhabitant = ville.get(i).getNbHabitant();
				nameVille = ville.get(i).getNom();
				villeRemove = ville.get(i);
			}
		}
		/*ville.remove(villeRemove);
		System.out.println("La ville la moin peuplé est " +nameVille+ " elle a donc été supprimé");*/

		// Afficher nos ville restantes
		for (int i = 0; i < ville.size(); i++) {
			System.out.println(ville.get(i));
		}
		System.out.println();

		iter = ville.iterator();

		while (iter.hasNext()) { // iter.hasNext() est équivalent à i<listeInt.size()
			Ville testIter = iter.next(); // iter.next est équivalent à listeInt.get(i)
			if (testIter.getNbHabitant() > 100_000) {
				System.out.println(testIter.getNom().toUpperCase());
			} else {
				System.out.println(testIter);
			}
			index++;
		}

	}
}
