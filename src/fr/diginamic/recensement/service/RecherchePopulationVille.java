package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Veuillez entrez le nom d'une ville :");
		
		String ville = scanner.nextLine();
		int nbHabs = 0;
		
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getNomCommune().equalsIgnoreCase(ville)) {
				nbHabs = recensement.getVilles().get(i).getPopulationTotal();
				System.out.println("La population de " + ville + " est de " + nbHabs + " habitants");

			}
		}
	}
}
