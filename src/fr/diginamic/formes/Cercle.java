package fr.diginamic.formes;

public class Cercle extends Forme {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculSurface() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	@Override
	public double calculPerimetre() {
		// TODO Auto-generated method stub
		return (rayon * rayon) * Math.PI;
	}
}
