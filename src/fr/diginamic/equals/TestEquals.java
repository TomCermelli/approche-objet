package fr.diginamic.equals;

import listes.Ville;

public class TestEquals {

	public static void main(String[] args) {

		Ville v1 = new Ville("Montpellier", 285_000);
		Ville v2 = new Ville("Montpellier", 285_000);
		Ville v3 = v2;
		
		if(v1.equals(v2)){
			System.out.println("Les 2 villes sont identiques\n");
		}
		else {
			System.out.println("Les 2 villes sont différentes\n");
			
		}
		
		if(v2 == v3) {
			System.out.println("Les 2 villes sont identiques\n");
		}
		else {
			System.out.println("Les 2 villes sont différentes\n");
			
		}

	}

}
