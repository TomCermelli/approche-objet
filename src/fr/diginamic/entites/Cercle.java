package fr.diginamic.entites;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	public double surface() {
		// TODO Auto-generated method stub
		return (rayon * rayon) * Math.PI;
	}
}
