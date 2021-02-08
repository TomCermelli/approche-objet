package fr.diginamic.banque.entite;

public class Credit extends Operation {

	public Credit(String date, float montant) {
		super(date, montant);

	}

	@Override
	public String afficherType() {
		return "Crédit";
	}

	@Override
	public String getDate() {
		return "Opération effectué le " + date;
	}

	@Override
	public float getMontant() {
		return montant;
	}

}
