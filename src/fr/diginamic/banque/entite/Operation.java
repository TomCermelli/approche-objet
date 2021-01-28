package fr.diginamic.banque.entite;

public abstract class Operation {
	private String date;
	private float montant;
	
	public Operation(String date, float montant) {
		this.date = date;
		this.montant = montant;
	}

	// ------------------GETTER------------------
	public String getDate() {
		return date;
	}
	
	public float getMontant() {
		return montant;
	}

	// ----------------------SETTER--------------

	public void setDate(String date) {
		this.date = date;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	// Autre Methode
	
	public static String afficherType() {
		return null;
	}
	
	public String toString(String type) {
		return "Vous avez crée un " +type+ " le " +date+ "\nSon montant est actuellement de " +montant+ "$";
		
	}
	
}
