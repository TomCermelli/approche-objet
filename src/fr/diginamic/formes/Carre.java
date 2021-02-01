package fr.diginamic.formes;

public class Carre extends Rectangle {
	double longueur;

	public Carre(double longueur) {
		super(longueur, longueur);
		// TODO Auto-generated constructor stub
	}

	public double getCote() {
		return longueur;
	}

	public void setCote(double cote) {
		this.longueur = cote;
	}

}
