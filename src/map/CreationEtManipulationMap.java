package map;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> iterKey = mapVilles.keySet().iterator();
		Iterator<String> iterValue = mapVilles.values().iterator();

		while (iterKey.hasNext()) {
			Integer key = iterKey.next();

			System.out.print(key + " ");
		}
		System.out.println();

		while (iterValue.hasNext()) {
			String value = iterValue.next();

			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println("Taille de la map : " + mapVilles.size());
	}

}
