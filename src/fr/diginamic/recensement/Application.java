package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.service.RecherchePopulation10Dep;
import fr.diginamic.recensement.service.RecherchePopulation10Reg;
import fr.diginamic.recensement.service.RecherchePopulation10Ville;
import fr.diginamic.recensement.service.RecherchePopulationDep;
import fr.diginamic.recensement.service.RecherchePopulationReg;
import fr.diginamic.recensement.service.RecherchePopulationVille;
import fr.diginamic.recensement.service.RechercheVille10Dep;
import fr.diginamic.recensement.service.RechercheVille10Reg;

public class Application {

	public static void main(String[] args) throws IOException {
		Path pathOrigine = Paths.get("C:/ProjetJava/recensement.csv");

		List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);
		lines.remove(0);
		Recensement recensement = new Recensement();
		// Stockage de valeur dans recensement afin d'avoir toute les villes du csv
		for (int i = 0; i < lines.size(); i++) {
			String[] infoVille = lines.get(i).split(";");
			String codeRegion = infoVille[0];
			String nomRegion = infoVille[1];
			String codeDepart = infoVille[2];
			String codeCommune = infoVille[5];
			String nomCommune = infoVille[6];
			int popTotal = Integer.parseInt(infoVille[9].replace(" ", ""));

			Ville ville = new Ville(codeRegion, nomRegion, codeDepart, codeCommune, nomCommune, popTotal);

			recensement.getVilles().add(ville);
		}


		// On demande un nombre é l'utilisateur
		Scanner scanner = new Scanner(System.in, "UTF-8");
		int nbChoix = 0;

		// Tant qu'on ne met pas 9 on est dans l'appli
		while (nbChoix != 9) {
			
			System.out.println("----------MENU----------------\n");
			MenuService.affichage();
			nbChoix = Integer.parseInt(scanner.nextLine());
		
			switch (nbChoix) {
			case 1:
				RecherchePopulationVille recherchePop = new RecherchePopulationVille();
				recherchePop.traiter(recensement, scanner);
				break;
			case 2:
				RecherchePopulationDep recherchePop2 = new RecherchePopulationDep();
				recherchePop2.traiter(recensement, scanner);
				break;
			case 3:
				RecherchePopulationReg recherchePop3 = new RecherchePopulationReg();
				recherchePop3.traiter(recensement, scanner);
				break;
			case 4:
				RecherchePopulation10Reg recherchePop4 = new RecherchePopulation10Reg();
				recherchePop4.traiter(recensement, scanner);
				break;
			case 5:
				RecherchePopulation10Dep recherchePop5 = new RecherchePopulation10Dep();
				recherchePop5.traiter(recensement, scanner);
				break;
			case 6:
				RechercheVille10Dep recherchePop6 = new RechercheVille10Dep();
				recherchePop6.traiter(recensement, scanner);
				break;
			case 7:
				RechercheVille10Reg recherchePop7 = new RechercheVille10Reg();
				recherchePop7.traiter(recensement, scanner);
				break;
			case 8:
				RecherchePopulation10Ville recherchePop8 = new RecherchePopulation10Ville();
				recherchePop8.traiter(recensement, scanner);
				break;
			default:
				System.out.println("Vous sortez de l'application, aurevoir");
			}
		}
	}

}
