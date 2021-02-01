/**
 * 
 */
package essais;

import entites.AdressePostale;
import entites.Personne;

/**
 * @author tomce
 *
 */
public class TestPersonne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instance de la classe Personne nommée p2
		Personne p1 = new Personne("CERMELLI", "Tom");
		System.out.println();

		// instance de la classe Personne nommée p2
		AdressePostale adresse1 = new AdressePostale(30, "Rue des machins", 44000, "Nantes");
		AdressePostale adresse2 = new AdressePostale(26, "Rue de Clementville", 34070, "Montpellier");
		Personne p2 = new Personne("Goupillot", "Etienne", adresse1);

		System.out.println(p2.getFullName());
		System.out.println(p2.getFirstname());
		System.out.println(p2.getLastname());
		System.out.println(p2.getAdresse());

		System.out.println();

		p2.setLastname("Cermelli");
		p2.setFirstname("Tom");
		p2.setAdress(adresse2);

		System.out.println(p2.getFullName());
		System.out.println(p2.getFirstname());
		System.out.println(p2.getLastname());
		System.out.println(p2.getAdresse());

		/*
		 * p2.fullAdress = new AdressePostale(30, "Rue des machins", 44000, "Nantes");
		 */

	}

}
