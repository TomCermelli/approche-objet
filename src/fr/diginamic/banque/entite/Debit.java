package fr.diginamic.banque.entite;

public class Debit extends Operation {

	public Debit(String date, float montant) {
		super(date, montant);
		
	}
	
	public static String afficherType() {
		return "Débit";
	}
	
	@Override
	public String toString() {
		String typeOperation = super.toString(Debit.afficherType());
		return typeOperation;
	}
	

}
