package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("\nVeuillez entrez le nom d'une ville :");
		
		String ville = scanner.nextLine();
		boolean verif = false;
		int nbHabs = 0;
		
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getNomCommune().equalsIgnoreCase(ville)) {
				nbHabs = recensement.getVilles().get(i).getPopulationTotal();
				System.out.println("La population de " + ville + " est de " + nbHabs + " habitants");
				verif = true;

			}
		}
		System.out.println();
		if(verif == false) {
			System.err.println("Cette ville n'existe pas , veuillez choisir une ville valide\n");
		}
	}
}
