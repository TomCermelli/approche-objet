package fr.diginamic.recensement.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RechercheVille10Dep extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		hashMapTrie trie = new hashMapTrie();
		System.out.println("\nVeuillez entrez le num�ro d'un d�partement afin de voir les 10 villes les plus peupl�es de celui ci");
		String depart = scanner.nextLine();

		HashMap<String, Integer> mapHabDep = new HashMap<String, Integer>();
		String nomVille = recensement.getVilles().get(1).getCodeCommune();
		boolean verif = false;
		int nbHabs = 0;

		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeDepart().equalsIgnoreCase(depart)) {
				verif = true;

				nomVille = recensement.getVilles().get(i).getNomCommune();
				Integer nbHabCommune = mapHabDep.get(nomVille);
				// on utilise le nom de r�gion en tant que cl� pour notre
				// hashMap, on la cr�e � la vol� et on lui donne une valeur
				// si elle n'existe pas

				// si le contenu de ma cl� est null , c'est � dire qu'on a aucune information
				// pour la cl� donn�e
				if (nbHabCommune == null) {
					nbHabCommune = recensement.getVilles().get(i).getPopulationTotal();
					// on initialise une donn�e � la cl� en question ( exemple premi�re boucle pour
					// la r�gion Occitani on
					// lui donne un nombre d'hab)
				} else {
					nbHabCommune += recensement.getVilles().get(i).getPopulationTotal();
				}
				mapHabDep.put(nomVille, nbHabCommune);
			}
		}
		
		// Si on ne trouve aucun d�partement
		if (verif == false) {
			System.err.println("Ce d�partement n'existe pas veuillez choisir un d�partement valide");
		}

		HashMap<Integer, String> map = trie.sortValues(mapHabDep);
		int compteur = 0;
		System.out.println("Les 10 villes les plus peupl�es dans le " + depart + " sont : \n");

		Set set = map.entrySet(); // on utilise le set pour correspondre au Map.Entry ensuite
		Iterator iterator = set.iterator();
		
		if (verif == true) {
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				// Map entry demande l'it�rator pour prendre l'ensemble key/values du coup on a
				// acc�s au getKey + getValue
				if (compteur >= mapHabDep.size() - 10) {
					System.out.println(entry.getKey() + " habitants : " + entry.getValue());
				}
				compteur++;

			}
		}

		
	}

}
