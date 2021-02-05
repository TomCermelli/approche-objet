package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import listes.Ville;
import tri.CompareVilleNbHabs;
import tri.CompareVilleNom;

public class CreationMap {

	public static void main(String[] args) {

		HashMap<String, Double> mapSalaire = new HashMap<>();
		mapSalaire.put("Paul", 1750.10d);
		mapSalaire.put("Hicham", 1825.13d);
		mapSalaire.put("Yu", 2250.50d);
		mapSalaire.put("Ingrid", 2015.80d);
		mapSalaire.put("Chantal", 2418.12d);

		System.out.println("Taille de la map : " + mapSalaire.size());
		System.out.println();

		// Iterator pour parcourir une map
		// soit parcourir avec une clé soit la valeur

		Iterator<String> iterKey = mapSalaire.keySet().iterator();
		Iterator<Double> iterValue = mapSalaire.values().iterator();

		while (iterKey.hasNext()) {
			String key = iterKey.next();
			Double value = mapSalaire.get(key);

			System.out.print(key + " " + value + "\n");
		}
		
		/*
		List<Ville> ville = new ArrayList<Ville>(
				Arrays.asList(new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
						new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9700),
						new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600)));

		Collections.sort(ville, new CompareVilleNbHabs());
		System.out.println("Trie par nombre d'habitant croissante \n");
		System.out.println(ville);

		System.out.println();

		Collections.sort(ville, new CompareVilleNom());
		System.out.println("Trie par ordre alphabétique \n");
		System.out.println(ville);*/

	}
}
