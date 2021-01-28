package fr.diginamic.banque.entite;

public class CompteTaux extends Compte {
	private float tauxRemuneration;

	public CompteTaux(int compte, float solde , int remun) {
		super(compte, solde);
		tauxRemuneration = remun;
	}
	
	// -------------------GETTER----------------------
	public String getTauxRemuneration() {
		return "Le taux de r�mun�ration est de : " +tauxRemuneration+ "%";
	}
	
	// ------------------SETTER-----------------------
	
	public String setTauxRemuneration() {
		return "Le nouveau taux de r�mun�ration est de : " +tauxRemuneration+ "%";
	}
	
	
	// -----------------toString----------------------
	public String toString() {
		
		String compteToString = super.toString();
		return compteToString + " avec un taux de r�mun�ration de " +tauxRemuneration+ "%";
	}

}
