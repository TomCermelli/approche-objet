package fr.diginamic.banque.entite;

public class CompteTaux extends Compte {
	private float tauxRemuneration;

	public CompteTaux(int compte, float solde , int remun) {
		super(compte, solde);
		tauxRemuneration = remun;
	}
	
	// -------------------GETTER----------------------
	public String getTauxRemuneration() {
		return "Le taux de rémunération est de : " +tauxRemuneration+ "%";
	}
	
	// ------------------SETTER-----------------------
	
	public String setTauxRemuneration() {
		return "Le nouveau taux de rémunération est de : " +tauxRemuneration+ "%";
	}
	
	
	// -----------------toString----------------------
	public String toString() {
		
		String compteToString = super.toString();
		return compteToString + " avec un taux de rémunération de " +tauxRemuneration+ "%";
	}

}
