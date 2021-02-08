package fr.diginamic.banque;

import fr.diginamic.banque.entite.Credit;
import fr.diginamic.banque.entite.Debit;
import fr.diginamic.banque.entite.Operation;

public class TestOperation {
	public static void main(String[] args) {
		Operation[] tabOperation = new Operation[8];
		// par exemple un CompteTaux est une extension de Compte du coup il est possible
		// de crée CompteTaux é partir de Compte
		tabOperation[0] = new Credit("21 février", 156.10f);
		tabOperation[1] = new Debit("22 février", 340f);
		tabOperation[2] = new Credit("23 février", 946.10f);
		tabOperation[3] = new Debit("24 février", 10.0f);
		tabOperation[4] = new Credit("25 février", 1587.65f);
		tabOperation[5] = new Debit("26 février", 780f);
		tabOperation[6] = new Credit("27 février", 156.10f);
		tabOperation[7] = new Debit("28 février", 20.1f);

		float montantTotal = 0.0f;

		// Boucle classique pour afficher le contenu du tableaux compteTab[i] =
		// compteTab[0] = new Compte(1234,15674);
		for (int i = 0; i < tabOperation.length; i++) {
			System.out.println(i + 1 + " tour de boucle");
			System.out.println(tabOperation[i].getDate() + ", il s'agit d'un " + tabOperation[i].afficherType());
			System.out.println("Le montant de cette opération est de " + tabOperation[i].getMontant() + " $");
			if (tabOperation[i].afficherType().equalsIgnoreCase("Crédit")) {
				montantTotal += tabOperation[i].getMontant();
			} else if (tabOperation[i].afficherType().equalsIgnoreCase("Débit")) {
				montantTotal -= tabOperation[i].getMontant();
			}
			System.out.println("Le montant Total entre le crédit et le débit est de " + montantTotal + " $");
			System.out.println();
		}

	}
}
