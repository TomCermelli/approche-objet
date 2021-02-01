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
		System.out.println("Je m'apelle " + nom + " " + prenom + "\nJe n'ai actuellement aucune adresse");
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		lastname = nom;
		firstname = prenom;
		fullAdress = adresse;
	}

	// ---------------------GETTER-----------------------

	// R�cup�rer le pr�nom + nom en majuscule
	public String getFullName() {
		return lastname.toUpperCase() + " " + firstname;
	}

	// R�cup�rer le nom
	public String getLastname() {
		return "Votre nom : " + lastname;
	}

	// R�cup�rer le pr�nom
	public String getFirstname() {
		return "Votre pr�nom : " + firstname;
	}

	// R�cup�rer l'adresse
	public String getAdresse() {
		return "Votre adresse : " + fullAdress;
	}

	// ----------------------SETTER-----------------------

	// Modifi� nom
	public String setLastname(String nom) {
		lastname = nom;
		return "Votre nouveau nom est : " + lastname;
	}

	// Modifi� pr�nom
	public String setFirstname(String prenom) {
		firstname = prenom;
		return "Votre nouveau pr�nom est : " + firstname;
	}

	// Modifi� adresse
	public String setAdress(AdressePostale adresse) {
		fullAdress = adresse;
		return "Votre nouvelle adresse est : " + fullAdress;
	}

	// ----------------------toString-----------------------
	public String toString() {

		return "Je m'apelle " + lastname + " " + firstname + ":\nVoici mon adresse : \n" + fullAdress;
	}

}
