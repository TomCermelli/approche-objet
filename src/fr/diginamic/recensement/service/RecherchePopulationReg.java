package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RecherchePopulationReg extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("\nVeuillez entrez le nom d'une région");
		String region = scanner.nextLine();
		boolean verif = false;

		int nbHabs = 0;

		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getNomRegion().equalsIgnoreCase(region)) {
				nbHabs += recensement.getVilles().get(i).getPopulationTotal();
				verif = true;
			}
		}

		if (verif == false) {
			System.err.println("Cette région n'existe pas , veuillez choisir une région valide\n");
		}

		System.out.println("La population dans la région " + region + " est de " + nbHabs + " habitants\n");
	}
}
