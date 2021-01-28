package fr.diginamic.banque.entite;

public class Credit extends Operation{

	public Credit(String date, float montant) {
		super(date, montant);
		
	}
	
	public static String afficherType() {
		return "Crédit";
	}
	
	@Override
	public String toString() {
		String typeOperation = super.toString(Credit.afficherType());
		return typeOperation;
	}
	
}
