package geometrie.entite;

public class Cercle implements ObjetGeometrique {
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return (rayon * rayon) * Math.PI;
	}
}
