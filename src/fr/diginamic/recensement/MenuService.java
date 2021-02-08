package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {
	
	public static void affichage() {
		System.out.println("1. Population déune ville donnée");
		System.out.println("2. Population déun département donné");
		System.out.println("3. Population déune région donnée");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées déun département");
		System.out.println("7. Afficher les 10 villes les plus peuplées déune région");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir");
	}
	
	public abstract void traiter(Recensement recensement, Scanner scanner);

}
