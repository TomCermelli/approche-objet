package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	double jourTravailler;
	double salaireJour;

	public Pigiste(String nom, String prenom, double jourTravailler, double salaireJour) {
		super(nom, prenom);
		this.jourTravailler = jourTravailler;
		this.salaireJour = salaireJour;
		// TODO Auto-generated constructor stub
	}

	public double getJourTravailler() {
		return jourTravailler;
	}

	public void setJourTravailler(short jourTravailler) {
		this.jourTravailler = jourTravailler;
	}

	public double getSalaireJour() {
		return salaireJour;
	}

	public void setSalaireJour(double salaireJour) {
		this.salaireJour = salaireJour;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return jourTravailler * salaireJour;
	}

	@Override
	public void afficherDonnes() {
		System.out.println(super.getNom() + " " + super.getPrenom() + " est un " + afficherStatut() + "\nSalaire :"
				+ getSalaire() + "$");

	}

	public String afficherStatut() {
		return "Pigiste";
	}

}
