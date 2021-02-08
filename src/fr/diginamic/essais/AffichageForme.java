package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void affichage(Forme forme) {
		System.out.println("Nous avons ici un " + forme.getClass().getSimpleName() + "\nIl a pour surface "
				+ forme.calculSurface() + "cm\nAinsi qu'un périmétre de " + forme.calculPerimetre() + "cm");
		System.out.println();
	}
}
