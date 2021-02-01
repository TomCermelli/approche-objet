package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(16, (byte) 1));
		maison.ajouterPiece(new Chambre(25, (byte) 0));
		maison.ajouterPiece(new Cuisine(10, (byte) 0));
		maison.ajouterPiece(new Salon(25, (byte) 0));
		maison.ajouterPiece(new SalleDeBain(25, (byte) 1));
		maison.ajouterPiece(new WC(5, (byte) 0));
		maison.ajouterPiece(new WC(5, (byte) 1));
		
		maison.getNombrePiece();
		System.out.println();
		maison.superficieEtage((byte)0);
		maison.superficieEtage((byte)1);
		maison.superficieTotal();		
		
		System.out.println();
		//Il faut écrire le nom de la classe pour que ca fonctionne
		maison.typePiece("Chambre");
		maison.superficieGlobalType("Chambre");
		
		
		

	}

}
