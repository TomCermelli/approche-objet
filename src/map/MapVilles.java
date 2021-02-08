package map;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

/**
 * Suppréssion de la Ville la plus petite
 * @author tomce
 *
 */
public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();
		mapVilles.put("Marseille", new Ville("Marseille", 34_000));
		mapVilles.put("Montpellier", new Ville("Montpellier", 55_000));
		mapVilles.put("Nantes", new Ville("Nantes", 25_000));
		mapVilles.put("Paris", new Ville("Paris", 75_000));
		mapVilles.put("Toulouse", new Ville("Toulouse", 20_000));

		System.out.println("Map d'origine :");
		System.out.println(mapVilles + "\n");

		Iterator<String> iterKey = mapVilles.keySet().iterator();
		Iterator<Ville> iterValue = mapVilles.values().iterator();
		long min = Integer.MAX_VALUE;
		String villeRemove = null;

		while (iterKey.hasNext()) {
			String key = iterKey.next();
			Ville population = mapVilles.get(key);

			if (min > mapVilles.get(key).getNbHabitant()) {
				min = mapVilles.get(key).getNbHabitant();
				villeRemove = key;
			}
		}
		System.out.println("Suppréssion de " + villeRemove);
		mapVilles.remove(villeRemove);
		System.out.println(mapVilles);
	}

}
