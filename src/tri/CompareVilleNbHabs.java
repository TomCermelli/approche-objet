package tri;

import java.util.Comparator;

import listes.Ville;

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
