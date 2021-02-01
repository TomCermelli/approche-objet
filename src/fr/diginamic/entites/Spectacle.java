package fr.diginamic.entites;

public class Spectacle {
	private String nom;
	private String type;
	private float tarifUnitaire;
	private short capacitySpectacle;
	private short inscrit;

	public Spectacle(String nom, String type, float tarifUnitaire, short capacitySpectacle, short inscrit) {
		super();
		this.nom = nom;
		this.type = type;
		this.tarifUnitaire = tarifUnitaire;
		this.capacitySpectacle = capacitySpectacle;
		this.inscrit = inscrit;
	}

	@Override
	public String toString() {
		return "Nom=" + nom + ", type=" + type + ", tarifUnitaire=" + tarifUnitaire + ", nombreMax=" + capacitySpectacle
				+ ", inscrit=" + inscrit + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getTarifUnitaire() {
		return tarifUnitaire;
	}

	public void setTarifUnitaire(float tarifUnitaire) {
		this.tarifUnitaire = tarifUnitaire;
	}

	public short getCapacitySpectacle() {
		return capacitySpectacle;
	}

	public void setCapacitySpectacle(short capacitySpectacle) {
		this.capacitySpectacle = capacitySpectacle;
	}

	public short getInscrit() {
		return inscrit;
	}

	public void setInscrit(short inscrit) {
		this.inscrit = inscrit;
	}

}
