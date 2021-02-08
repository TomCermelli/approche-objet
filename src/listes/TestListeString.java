package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * On affiche le nombre de lettre que contient une chaine de caractère
 * On affiche par la suite toute les villes qui provient d'un ArrayList en majuscule
 * Pour finir on supprime toute les villes ou le premier caractère est égale à N
 * @author tomce
 *
 */
public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listeString = new ArrayList<String>(
				Arrays.asList("Nice", "Nyme", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		int max = 0;
		String villeLongue = "";

		for (int i = 0; i < listeString.size(); i++) {

			if (max < listeString.get(i).length()) {
				max = listeString.get(i).length();
				villeLongue = listeString.get(i);
			}
		}
		System.out.println("la ville la plus longue a " + max + " lettres\nIl s'agit de " + villeLongue + "\n");

		for (int i = 0; i < listeString.size(); i++) {
			System.out.print(listeString.get(i).toUpperCase() + " ");
		}

		Iterator<String> iter = listeString.iterator();
		int i = 0;
		while (iter.hasNext()) { // iter.hasNext() est équivalent é i<listeInt.size()
			String testIter = iter.next(); // iter.next est équivalent é listeInt.get(i)
			if (testIter.substring(0, 1).equalsIgnoreCase("N")) { // charAt(0) == 'N'
				iter.remove();
			}
			i++;
		}
		System.out.println();
		System.out.println(listeString);

	}

}
