package fr.diginamic.formes;

public class Rectangle extends Forme{
	double longueur;
	double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculSurface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

	@Override
	public double calculPerimetre() {
		// TODO Auto-generated method stub
		return (largeur+ longueur)*2;
	}

}
