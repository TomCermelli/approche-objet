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

	// Récupérer le prénom + nom en majuscule
	public String getFullName() {
		return lastname.toUpperCase() + " " + firstname;
	}

	// Récupérer le nom
	public String getLastname() {
		return "Votre nom : " + lastname;
	}

	// Récupérer le prénom
	public String getFirstname() {
		return "Votre prénom : " + firstname;
	}

	// Récupérer l'adresse
	public String getAdresse() {
		return "Votre adresse : " + fullAdress;
	}

	// ----------------------SETTER-----------------------

	// Modifié nom
	public String setLastname(String nom) {
		lastname = nom;
		return "Votre nouveau nom est : " + lastname;
	}

	// Modifié prénom
	public String setFirstname(String prenom) {
		firstname = prenom;
		return "Votre nouveau prénom est : " + firstname;
	}

	// Modifié adresse
	public String setAdress(AdressePostale adresse) {
		fullAdress = adresse;
		return "Votre nouvelle adresse est : " + fullAdress;
	}

	// ----------------------toString-----------------------
	public String toString() {

		return "Je m'apelle " + lastname + " " + firstname + ":\nVoici mon adresse : \n" + fullAdress;
	}

}
