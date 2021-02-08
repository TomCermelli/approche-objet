package fr.diginamic.maison;

public class Maison {
	private Piece[] nombrePiece = new Piece[7];
	private int index = 0;

	public void getNombrePiece() {
		for (int i = 0; i < nombrePiece.length; i++) {
			System.out.println(nombrePiece[i]);
		}
	}

	public void setNombrePiece(Piece[] nombrePiece) {
		this.nombrePiece = nombrePiece;
	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.superficie >= 0 && piece.etage >= 0) {
			nombrePiece[index] = piece;
			index++;
		} else {
			System.err.println("Votre objet n'est pas conforme é ce qui est demandé");
		}
	}

	public double superficieTotal() {
		double superficieTotal = 0;
		for (int i = 0; i < nombrePiece.length; i++) {
			superficieTotal += nombrePiece[i].getSuperficie();
		}
		System.out.println("La superficie total de la maison est de " + superficieTotal + "cmé");
		return superficieTotal;
	}

	public double superficieEtage(byte etage) {
		double superficiePrecis = 0;
		for (int i = 0; i < nombrePiece.length; i++) {
			if (nombrePiece[i].getEtage() == etage) {
				superficiePrecis += nombrePiece[i].getSuperficie();
			}
		}
		System.out.println("La superficie de l'étage " + (etage + 1) + " est de " + superficiePrecis + "cmé");
		return superficiePrecis;

	}

	public void superficieGlobalType(String type) {
		double superficieGlobal = 0;
		for (int i = 0; i < nombrePiece.length; i++) {
			if (nombrePiece[i].getClass().getSimpleName().equalsIgnoreCase(type)) {
				superficieGlobal += nombrePiece[i].getSuperficie();
			}
		}
		System.out.println("La superficie global de tous/toutes les " + type + " est de " + superficieGlobal + "cmé");

	}

	public void typePiece(String type) {
		byte identique = 0;
		for (int i = 0; i < nombrePiece.length; i++) {
			if (nombrePiece[i].getClass().getSimpleName().equalsIgnoreCase(type)) {
				identique++;
			}
		}
		System.out.println("Il y a " + identique + " piéce de type " + type + " dans cette maison");
	}
}
