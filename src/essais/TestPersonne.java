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
		Personne p2 = new Personne("Goupillot", "Etienne", adresse1);
		
		System.out.println(p2);
		
		
		/*p2.fullAdress = new AdressePostale(30, "Rue des machins", 44000, "Nantes");*/
		
	
		
	}

}
