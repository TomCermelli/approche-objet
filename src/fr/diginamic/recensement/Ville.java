package fr.diginamic.recensement;

public class Ville {
	String codeRegion;
	String nomRegion;
	String codeDepart;
	String codeCommune;
	String nomCommune;
	int populationTotal;

	public Ville(String codeRegion, String nomRegion, String codeDepart, String codeCommune, String nomCommune,
			int populationTotal) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepart = codeDepart;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotal = populationTotal;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepart() {
		return codeDepart;
	}

	public void setCodeDepart(String codeDepart) {
		this.codeDepart = codeDepart;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopulationTotal() {
		return populationTotal;
	}

	public void setPopulationTotal(int populationTotal) {
		this.populationTotal = populationTotal;
	}

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepart=" + codeDepart
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", populationTotal=" + populationTotal
				+ "]";
	}

	
}
