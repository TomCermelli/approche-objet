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

public class RecherchePopulation10Dep extends MenuService {
	
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		hashMapTrie trie = new hashMapTrie();
		HashMap<String, Integer> mapHabReg = new HashMap<String, Integer>();
		String departement = recensement.getVilles().get(1).getCodeDepart();
		List<Integer> regPlusPeuple = new ArrayList<Integer>();

		// ajouter le nombre d'hab dans les r�gions
		for (int i = 1; i < recensement.getVilles().size(); i++) {
			departement = recensement.getVilles().get(i).getCodeDepart();
			Integer nbHabDepartement = mapHabReg.get(departement);
			// on utilise le nom de r�gion en tant que cl� pour notre
			// hashMap, on la cr�e � la vol� et on lui donne une valeur
			// si elle n'existe pas

			// si le contenu de ma cl� est null , c'est � dire qu'on a aucune information
			// pour la cl� donn�e
			if (nbHabDepartement == null) {
				nbHabDepartement = recensement.getVilles().get(i).getPopulationTotal();
				// on initialise une donn�e � la cl� en question ( exemple premi�re boucle pour
				// la r�gion Occitani on
				// lui donne un nombre d'hab)
			} else {
				nbHabDepartement += recensement.getVilles().get(i).getPopulationTotal();
			}
			mapHabReg.put(departement, nbHabDepartement);
		}

		HashMap<Integer, String> map = trie.sortValues(mapHabReg);
		int compteur = 0;
		System.out.println("\nLes 10 d�partements les plus peupl�s sont :");
		Set set = map.entrySet();
		Iterator<HashMap> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			// Map entry demande l'it�rator pour prendre l'ensemble key/values du coup on a
			// acc�s au getKey + getValue
			if (compteur >= mapHabReg.size() - 10) {
				System.out.println("Le " +entry.getKey()+ " habitants : " + entry.getValue());
			}
			compteur++;

		}
		System.out.println();
	}

}
