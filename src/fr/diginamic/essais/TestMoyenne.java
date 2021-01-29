package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;
import fr.diginamic.operations.Operations;

public class TestMoyenne {

	public static void main(String[] args) {
		
		double a = 12;
		double b = 6;
		double c = 20.3;
		
		CalculMoyenne calculMoyenneTab = new CalculMoyenne();
		// Afficher le tableau qui grandit
		System.out.println();
		calculMoyenneTab.affichageTableau();
		calculMoyenneTab.ajout(a);
		System.out.println();
		calculMoyenneTab.affichageTableau();
		calculMoyenneTab.ajout(b);
		System.out.println();
		calculMoyenneTab.affichageTableau();
		calculMoyenneTab.ajout(c);
		System.out.println();
		calculMoyenneTab.affichageTableau();
		
		System.out.println("La moyenne du tableau est de "+calculMoyenneTab.moyenne());		
		
	}

}
