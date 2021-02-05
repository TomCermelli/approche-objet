package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hashMapTrie {

	@SuppressWarnings("unchecked") // Je voyais plus rien du coup on enl�ve ca pour le moment
	public static HashMap sortValues(HashMap map) // on donne une hashMap
	{
		List<String> list = new ArrayList<String>(map.entrySet()); // on cr�e une nouvelle liste avec pour entr�e une
																	// hashMap
		// avec ces valeurs (entrySet);
		// On va comparer 2 valeurs dans notre hashMap
		Collections.sort(list, new Comparator<Object>() {
			public int compare(Object o1, Object o2) { // On prend 2 objet , pour le coup il s'agit de nos entr�e
														// key/value o1 = premi�re valeur de notre hashmap et o2 � la
														// seconde
				// On donne le resultat de la comparaison de la premi�re valeur
				// (Comparable(Map.Entry) (o1)).getValue()) )
				// � la 2eme ".compareTo(((Map.Entry) (o2)).getValue()" la map entry prend du
				// coup la 2eme valeur de notre hashmap et en r�cup�re la value
				return ((Comparable<Object>) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());

			}
		});

		// On copie la hashMap dans une autre afin de pr�serv� l'ordre
		// Map entry demande une pair , c'est � dire une cl� + valeur, pour avoir cette
		// info il faut l'it�rator comme ca on peut avoir le getKey() et le getValue
		HashMap<Object, Object> sortedHashMap = new LinkedHashMap<Object, Object>(); // nos MapEntry sont des objets du
																						// coup on attends pour cl� un
																						// objet et en valeur �galement
		Iterator i = list.iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			sortedHashMap.put(entry.getKey(), entry.getValue()); // on entre nos nouvelles valeurs dans le tableau
		}
		return sortedHashMap;
	}

}
