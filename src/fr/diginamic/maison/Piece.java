package fr.diginamic.maison;

public abstract class Piece {
	double superficie;
	byte etage;
	
	
	
	public Piece(double superficie, byte etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}
	
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public short getEtage() {
		return etage;
	}
	public void setEtage(byte etage) {
		this.etage = etage;
	}
	
	public String toString() {
		String text = (getClass().getSimpleName()+ " � l'�tage " +etage+ ", Superficie : " +superficie+ "cm�");
		return text;
		
	}
	

	

}
