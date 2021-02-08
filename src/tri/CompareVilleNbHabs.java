package tri;

import java.util.Comparator;

import listes.Ville;

/**
 * Comparateur sur le nb d'habitants.  
 * tri ascendant si nombre d'habitant de v1 est supérieur à nombre d'habitant v2
 * @author tomce
 *
 */
public class CompareVilleNbHabs implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		if(v1.getNbHabitant() > v2.getNbHabitant()) {
			return 1;
		}
		else if(v1.getNbHabitant() < v2.getNbHabitant()) {
			return -1;
		}
		return 0;
	}
	

}
