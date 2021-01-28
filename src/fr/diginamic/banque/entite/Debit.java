package fr.diginamic.banque.entite;

public class Debit extends Operation {

	public Debit(String date, float montant) {
		super(date, montant);
		
	}
	
	@Override
	public  String afficherType() {
		return "Débit";
	}

	@Override
	public String getDate() {
		return "Opération effectué le " +date;
	}

	@Override
	public float getMontant() {
		return montant;
	}
	
	
	

}
