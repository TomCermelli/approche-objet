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

	// Récupérer numéro de compte
	public String getNumeroCompte() {
		return "Votre nouveau numéro de compte est : " + numeroCompte;
	}

	// Récupérer solde
	public String getSolde() {
		return "Votre nouveau prénom est : " + soldeCompte;
	}

	// ----------------------SETTER-----------------------

	// Modifié numéro de compte
	public String setNumeroCompte(long compte) {
		numeroCompte = compte;
		return "Votre nouveau numéro de compte est : " + numeroCompte;
	}

	// Modifié solde
	public String setSolde(float solde) {
		soldeCompte = solde;
		return "Votre nouveau prénom est : " + soldeCompte;
	}

	// ------------------------toString--------------------
	public String toString() {
		return "Votre numéro de compte : " + numeroCompte + "\nVotre solde : " + soldeCompte + "$";
	}
}
