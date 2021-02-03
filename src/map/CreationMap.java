package map;

import java.util.HashMap;
import java.util.Iterator;

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

	}
}
