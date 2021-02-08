package listes;

public class Ville {
	private String nom;
	private int nbHabitant;

	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Ville)) {
			return false;
		}

		Ville autre = (Ville) obj;
		return this.nom.equals(autre.getNom()) && this.nbHabitant == autre.getNbHabitant();

	}

	@Override
	public String toString() {
		return nom + ", habitants : " + nbHabitant + "\n";
	}

}
