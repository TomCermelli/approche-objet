package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private double salaire;
	
	
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

	@Override
	public void afficherDonnes() {
		System.out.println(super.getNom()+ " "+super.getPrenom()+" est un " +afficherStatut()+ "\nSalaire :" +getSalaire()+ "$" );
		
	}
	
	public String afficherStatut() {
		return "Salarie";
	}
}
