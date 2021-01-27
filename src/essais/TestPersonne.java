/**
 * 
 */
package essais;
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
		Personne p1 = new Personne();
		p1.lastname = "CERMELLI";
		p1.firstname = "Tom";
		p1.fullAdress.streetNb = 26 ;
		p1.fullAdress.streetName = "Rue de Clementville" ;
		p1.fullAdress.postalCode = 34070 ;
		p1.fullAdress.city = "Montpellier" ;
		
		System.out.println(p1.lastname);
		System.out.println(p1.fullAdress.streetName);
		
		
		// instance de la classe Personne nommée p2
		Personne p2 = new Personne();
		p2.lastname = "Goupillot";
		p2.firstname = "Etienne";
		p2.fullAdress.streetNb = 30 ;
		p2.fullAdress.streetName = "Rue de la Comédie" ;
		p2.fullAdress.postalCode = 34000 ;
		p2.fullAdress.city = "Montpellier" ;
		
		System.out.println(p2.firstname);
		System.out.println(p2.fullAdress.streetName);
		
	}

}
