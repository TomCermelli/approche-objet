package fr.diginamic.banque;

import fr.diginamic.banque.entite.Credit;
import fr.diginamic.banque.entite.Debit;
import fr.diginamic.banque.entite.Operation;

public class TestOperation {
	public static void main(String[] args) {
		Object[] tabOperation = new Operation[8];
		// par exemple un CompteTaux est une extension de Compte du coup il est possible de cr�e CompteTaux � partir de Compte
		tabOperation[0] = new Credit("21 f�vrier", 156.10f);
		tabOperation[1] = new Debit("22 f�vrier",35840f);
		tabOperation[2] = new Credit("23 f�vrier", 946.10f);
		tabOperation[3] = new Debit("24 f�vrier",10.0f);
		tabOperation[4] = new Credit("25 f�vrier", 1587.65f);
		tabOperation[5] = new Debit("26 f�vrier",780f);
		tabOperation[6] = new Credit("27 f�vrier", 156.10f);
		tabOperation[7] = new Debit("28 f�vrier",20.1f);
		
		//Boucle classique pour afficher le contenu du tableaux compteTab[i] = compteTab[0] = new Compte(1234,15674);
		for(int i=0; i<tabOperation.length; i++) {
			System.out.println(tabOperation[i]);
			System.out.println();
		}
		
	}
}
