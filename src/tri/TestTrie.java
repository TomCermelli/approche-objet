package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import listes.Ville;

public class TestTrie {

	public static void main(String[] args) {
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
		System.out.println(ville);

	}

}
