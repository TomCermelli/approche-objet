/**
 * 
 */
package entites;

/**
 * @author tomce
 *
 */
public class AdressePostale {

	public int streetNb;
	public String streetName;
	public int postalCode;
	public String city;

	public AdressePostale(int rue, String nomRue, int cp, String ville) {
		streetNb = rue;
		streetName = nomRue;
		postalCode = cp;
		city = ville;
	}

	public String toString() {
		return "J'habite au " + streetNb + " " + streetName + ",\n" + postalCode + ", " + city;
	}
}
