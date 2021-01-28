package geometrie.entite;

public class Rectangle implements ObjetGeometrique {
	double longueur;
	double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return (largeur+ longueur)*2;
	}
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}
	
	
}
