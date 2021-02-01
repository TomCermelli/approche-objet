package fr.diginamic.banque.entite;

public abstract class Operation {
	protected String date;
	protected float montant;

	public Operation(String date, float montant) {
		this.date = date;
		this.montant = montant;
	}

	// ------------------GETTER------------------
	public abstract String getDate();

	public abstract float getMontant();

	public abstract String afficherType();

	public void setDate(String date) {
		this.date = date;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

}
