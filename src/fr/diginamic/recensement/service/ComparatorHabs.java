package fr.diginamic.recensement.service;

import java.util.Comparator;

import fr.diginamic.recensement.Ville;

public class ComparatorHabs implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if(o1.getPopulationTotal() < o2.getPopulationTotal()) {
			return 1;
		}
		else if (o1.getPopulationTotal() > o2.getPopulationTotal()) {
			return -1;
		}
		return 0;
	}
	
}
