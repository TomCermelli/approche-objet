package fr.diginamic.operations;

public class CalculMoyenne {
	private static double[] tabMoyenne = new double[2];
	private static int index=0;

	
	// Ajout dans un tableau + l'agrandir si néccéssaire
	public static double[] ajout(double nb) {
		
		if (index == tabMoyenne.length - 1) {
			double[] temp = new double[tabMoyenne.length+1];
			for(int i = 0; i<tabMoyenne.length; i++) {
				temp[i] = tabMoyenne[i];
			}
			tabMoyenne = temp;
		}
		tabMoyenne[index] = nb;
		index++;
		return tabMoyenne;
	}
	
	//Calcul de la moyenne
	public double moyenne() {
		double somme = 0;
		for(int i=0; i<tabMoyenne.length; i++) {
			somme +=tabMoyenne[i];
			if(i == tabMoyenne.length-1) {
				System.out.println(i);
				somme /=  i;
			}
		}
		return somme;
	}
	
	//Affichage du tableau
	public void affichageTableau() {
		for(int i=0; i<tabMoyenne.length; i++) {
			System.out.println("tab["+i+"] :"+tabMoyenne[i]);
		}
		
	}
	
	
	
	
	
	
	
	public double[] getTabMoyenne() {
		return tabMoyenne;
	}

	public void setTabMoyenne(double[] tabMoyenne) {
		this.tabMoyenne = tabMoyenne;
	}
	
	
	
	
	
}
