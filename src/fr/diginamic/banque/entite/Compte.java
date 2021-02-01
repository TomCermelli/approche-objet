package fr.diginamic.banque.entite;

import entites.AdressePostale;

public class Compte {
	private long numeroCompte;
	private float soldeCompte;

	public Compte(int compte, float solde) {
		numeroCompte = compte;
		soldeCompte = solde;
	}

	// ---------------------GETTER-----------------------

	// R�cup�rer num�ro de compte
	public String getNumeroCompte() {
		return "Votre nouveau num�ro de compte est : " + numeroCompte;
	}

	// R�cup�rer solde
	public String getSolde() {
		return "Votre nouveau pr�nom est : " + soldeCompte;
	}

	// ----------------------SETTER-----------------------

	// Modifi� num�ro de compte
	public String setNumeroCompte(long compte) {
		numeroCompte = compte;
		return "Votre nouveau num�ro de compte est : " + numeroCompte;
	}

	// Modifi� solde
	public String setSolde(float solde) {
		soldeCompte = solde;
		return "Votre nouveau pr�nom est : " + soldeCompte;
	}

	// ------------------------toString--------------------
	public String toString() {
		return "Votre num�ro de compte : " + numeroCompte + "\nVotre solde : " + soldeCompte + "$";
	}
}
