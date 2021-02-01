package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie salarie = new Salarie("Goupillot", "Etienne", 2500);
		Pigiste pigiste = new Pigiste("CERMELLI", "Tom" ,13, 110);
		
		salarie.afficherDonnes();
		System.out.println();
		pigiste.afficherDonnes();

	}
}
