package fr.diginamic.banque.entite;

public class Credit extends Operation {

	public Credit(String date, float montant) {
		super(date, montant);

	}

	@Override
	public String afficherType() {
		return "Cr�dit";
	}

	@Override
	public String getDate() {
		return "Op�ration effectu� le " + date;
	}

	@Override
	public float getMontant() {
		return montant;
	}

}
