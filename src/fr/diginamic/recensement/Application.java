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

import fr.diginamic.recensement.service.RecherchePopulationVille;

public class Application {

	public static void main(String[] args) throws IOException {
		Path pathOrigine = Paths.get("C:/ProjetJava/recensement.csv");
		
		List<String> lines = Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);
		lines.remove(0);
		Recensement recensement = new Recensement();
		
		
		for(int i=0; i<lines.size(); i++) {
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
		System.out.println("1. Population d�une ville donn�e");
		System.out.println("2. Population d�un d�partement donn�");
		System.out.println("3. Population d�une r�gion donn�e");
		System.out.println("4. Afficher les 10 r�gions les plus peupl�es");
		System.out.println("5. Afficher les 10 d�partements les plus peupl�s");
		System.out.println("6. Afficher les 10 villes les plus peupl�es d�un d�partement");
		System.out.println("7. Afficher les 10 villes les plus peupl�es d�une r�gion");
		System.out.println("8. Afficher les 10 villes les plus peupl�es de France");
		System.out.println("9. Sortir");
		
		
		Scanner scanner = new Scanner(System.in, "UTF-8");
		int nbChoix = Integer.parseInt(scanner.nextLine());
		
		switch (nbChoix) {
		case 1:
			RecherchePopulationVille recherchePop = new RecherchePopulationVille();
			recherchePop.traiter(recensement, scanner);
			break;
		case 2:
			System.out.println("hello");
			break;
		default:
			// code block
		}
		scanner.close();
	}

}
