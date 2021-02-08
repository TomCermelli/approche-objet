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

public class RecherchePopulation10Reg extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		hashMapTrie trie = new hashMapTrie();
		HashMap<String, Integer> mapHabReg = new HashMap<String, Integer>();
		String nomRegion = recensement.getVilles().get(1).getNomRegion();
		List<Integer> regPlusPeuple = new ArrayList<Integer>();

		// ajouter le nombre d'hab dans les régions
		for (int i = 1; i < recensement.getVilles().size(); i++) {
			nomRegion = recensement.getVilles().get(i).getNomRegion();
			Integer nbHabRegion = mapHabReg.get(nomRegion);
			// on utilise le nom de région en tant que clé pour notre
			// hashMap, on la crée é la volé et on lui donne une valeur
			// si elle n'existe pas

			// si le contenu de ma clé est null , c'est é dire qu'on a aucune information
			// pour la clé donnée
			if (nbHabRegion == null) {
				nbHabRegion = recensement.getVilles().get(i).getPopulationTotal();
				// on initialise une donnée é la clé en question ( exemple premiére boucle pour
				// la région Occitani on
				// lui donne un nombre d'hab)
			} else {
				nbHabRegion += recensement.getVilles().get(i).getPopulationTotal();
			}
			mapHabReg.put(nomRegion, nbHabRegion);
		}

		HashMap<Integer, String> map = trie.sortValues(mapHabReg); // on a récupérer le hashmap trié
		int compteur = 0;
		System.out.println("\nLes 10 régions les plus peuplés sont :\n");
		Set set = map.entrySet(); // on utilise le set pour correspondre au Map.Entry ensuite
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			// Map entry demande l'itérator pour prendre l'ensemble key/values du coup on a
			// accés au getKey + getValue
			if (compteur >= mapHabReg.size() - 10) {
				System.out.println(entry.getKey()+ " habitants : " + entry.getValue());
			}
			compteur++;

		}
		System.out.println();
	}

}
