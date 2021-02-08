package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;;

public class RecherchePopulation10Ville extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		List<Ville> ville = recensement.getVilles();
		
		Collections.sort(ville, new ComparatorHabs());
		
		for(int i=0; i<10; i++) {
			System.out.println(ville.get(i));
		}
		
		
	}
}
