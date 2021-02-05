package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RecherchePopulationDep extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("\nVeuillez entrez le numéro d'un département");
		String depart = scanner.nextLine();
		boolean verif = false;

		int nbHabs = 0;

		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeDepart().equalsIgnoreCase(depart)) {
				nbHabs += recensement.getVilles().get(i).getPopulationTotal();
				verif = true;
			}
		}
	
		if (verif == false) {
			System.err.println("Ce département n'existe pas veuillez choisir un département valide");
		}
		
		System.out.println("La population dans le " + depart + " est de " + nbHabs + " habitants\n");
	}

}
