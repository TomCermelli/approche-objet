package fr.diginamic.recensement.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RechercheVille10Reg extends MenuService {
	
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		hashMapTrie trie = new hashMapTrie();
		System.out.println("\nVeuillez entrez le numéro d'un département afin de voir les 10 villes les plus peuplées de celui ci");
		String region = scanner.nextLine();

		HashMap<String, Integer> mapHabDep = new HashMap<String, Integer>();
		String nomVille = recensement.getVilles().get(1).getCodeCommune();
		boolean verif = false;
		int nbHabs = 0;

		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getNomRegion().equalsIgnoreCase(region)) {
				verif = true;

				nomVille = recensement.getVilles().get(i).getNomCommune();
				Integer nbHabCommune = mapHabDep.get(nomVille);
				// on utilise le nom de région en tant que clé pour notre
				// hashMap, on la crée é la volé et on lui donne une valeur
				// si elle n'existe pas

				// si le contenu de ma clé est null , c'est é dire qu'on a aucune information
				// pour la clé donnée
				if (nbHabCommune == null) {
					nbHabCommune = recensement.getVilles().get(i).getPopulationTotal();
					// on initialise une donnée é la clé en question ( exemple premiére boucle pour
					// la région Occitani on
					// lui donne un nombre d'hab)
				} else {
					nbHabCommune += recensement.getVilles().get(i).getPopulationTotal();
				}
				mapHabDep.put(nomVille, nbHabCommune);
			}
		}
		
		// Si on ne trouve aucun département
		if (verif == false) {
			System.err.println("Ce département n'existe pas veuillez choisir un département valide");
		}

		HashMap<Integer, String> map = trie.sortValues(mapHabDep);
		int compteur = 0;
		int affichage = 10;
		System.out.println("Les 10 villes les plus peuplées dans la région de " + region + " sont : \n");

		Set set = map.entrySet(); // on utilise le set pour correspondre au Map.Entry ensuite
		Iterator iterator = set.iterator();
		
		if (verif == true) {
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				// Map entry demande l'itérator pour prendre l'ensemble key/values du coup on a
				// accés au getKey + getValue
				if (compteur >= mapHabDep.size() - 10) {
					System.out.println(affichage+ ". " + entry.getKey() + " habitants : " + entry.getValue());
					affichage--;
				} 
				compteur++;

			}
			System.out.println();
		}

		
	}


}
