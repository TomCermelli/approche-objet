package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

	
		List<Integer> listeInt = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, -5));
		
		
		System.out.println(listeInt);
		System.out.println("La taille de la liste est de " +listeInt.size());
		System.out.println("L'�lement maximum est : " + Collections.max(listeInt) );
		System.out.println("L'�lement minimum est : " + Collections.min(listeInt) );
		listeInt.remove(Collections.min(listeInt));
		System.out.println("On enl�ve le minimum " +listeInt);
		
		for(int i=0; i<listeInt.size(); i++) {
			if(listeInt.get(i)<0) {
				listeInt.set(i, Math.abs(listeInt.get(i)));  
			}
		}
		System.out.println("Le tableau en enlevant les valeurs n�gatives " +listeInt);
		
		// Pour remove dans une boucle il ne faut pas utiliser for mais un it�rator
		/*
		 * Iterator<Integer> iter = listeInt.iterator();
		 * 
		 * 
		 * int i = 0
		 * while(iter.hasNext()) { // iter.hasNext() est �quivalent � i<listeInt.size()
		 * 	int maVar = iter.next()  // iter.next est �quivalent � listeInt.get(i)
		 * 	if(i % 2 == 0) {
		 * 		iter.remove();
		 * 	}
		 * i++
		 * }
		 * */

	}

}
