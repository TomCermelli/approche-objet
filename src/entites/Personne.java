/**
 * 
 */
package entites;

/**
 * @author tomce
 *
 */
public class Personne {
	public String lastname = "";
	public String firstname = "";
	public AdressePostale fullAdress; 

	public Personne(String nom, String prenom) {
		lastname = nom;
		firstname = prenom;
		System.out.println("Je m'apelle " +nom + " " + prenom + "\nJe n'ai actuellement aucune adresse");
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		lastname = nom;
		firstname = prenom;
		fullAdress = adresse;
	}
	
	public String toString(Personne p) {
		
		return "Je m'apelle " +lastname+ " " + firstname + ":\nVoici mon adresse : \n" + fullAdress ;
	}


}
