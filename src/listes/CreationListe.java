package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listeTab = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			listeTab.add(i);
		}
		
		for(Integer elem : listeTab) {
			System.out.print(elem+ " ");
			if(elem%10 == 0) {
				System.out.println();
			}
		}
	}
}
