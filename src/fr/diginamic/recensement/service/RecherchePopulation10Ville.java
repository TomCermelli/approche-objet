package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RecherchePopulation10Ville extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		hashMapTrie trie = new hashMapTrie();
		HashMap<String, Integer> mapHabVille = new HashMap<String, Integer>();
		String nomVille = recensement.getVilles().get(1).getNomCommune();

		// ajouter le nombre d'hab dans les r�gions
		for (int i = 1; i < recensement.getVilles().size(); i++) {
			nomVille = recensement.getVilles().get(i).getNomCommune();
			Integer nbHab = mapHabVille.get(nomVille);
			// on utilise le nom de r�gion en tant que cl� pour notre
			// hashMap, on la cr�e � la vol� et on lui donne une valeur
			// si elle n'existe pas

			// si le contenu de ma cl� est null , c'est � dire qu'on a aucune information
			// pour la cl� donn�e
			if (nbHab == null) {
				nbHab = recensement.getVilles().get(i).getPopulationTotal();
				// on initialise une donn�e � la cl� en question ( exemple premi�re boucle pour
				// la r�gion Occitani on
				// lui donne un nombre d'hab)
			} else {
				nbHab += recensement.getVilles().get(i).getPopulationTotal();
			}
			mapHabVille.put(nomVille, nbHab);
		}

		HashMap<Integer, String> map = trie.sortValues(mapHabVille); // on a r�cup�rer le hashmap tri�
		int compteur = 0;
		int affichage = 10;
		System.out.println("\nLes 10 villes les plus peupl�s sont :\n");
		Set set = map.entrySet(); // on utilise le set pour correspondre au Map.Entry ensuite
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			// Map entry demande l'it�rator pour prendre l'ensemble key/values du coup on a
			// acc�s au getKey + getValue
			if (compteur >= mapHabVille.size() - 10) {
				System.out.println(affichage+ ". " +entry.getKey() + " habitants : " + entry.getValue());
				affichage--;
			}
			compteur++;

		}
		System.out.println();
	}

}
