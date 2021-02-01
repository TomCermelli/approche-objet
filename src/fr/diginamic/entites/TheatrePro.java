package fr.diginamic.entites;

import fr.diginamic.maison.Piece;

public class TheatrePro {
	private String nom;
	private Spectacle[] spectacleTab = new Spectacle[4];
	private int index = 0;

	public void ajouterSpectacle(Spectacle spectacle) {
		spectacleTab[index] = spectacle;
		index++;
	}

	// Retourner un spectacle grâce à son nom
	public void getSpectacle(String nomSpectacle) {
		boolean verif = false;
		for (int i = 0; i < spectacleTab.length; i++) {
			if (spectacleTab[i].getNom().equalsIgnoreCase(nomSpectacle)) {
				System.out.println("Voici toute les informations du spectacle : \n" + spectacleTab[i].getNom()
						+ " est un spectacle de type : " + spectacleTab[i].getType() + "\nIl peut accueillir "
						+ spectacleTab[i].getCapacitySpectacle() + " et son prix d'entré est de "
						+ spectacleTab[i].getTarifUnitaire() + "$");

				verif = true;
			} else if (i == spectacleTab.length - 1 && verif == false) {
				System.err.println("Aucun spectacle de ce nom n'a été trouvé");
			}
		}
	}

	// Inscription d'un certain nombre de client à un Spectacle de notre choix
	public String inscrire(int nbClient, String spectacleNom) {
		String text = "";
		for (int i = 0; i < spectacleTab.length; i++) {
			// Nombre de place restante pour chaque spectacle
			int placeRestante = spectacleTab[i].getCapacitySpectacle() - spectacleTab[i].getInscrit();

			// Si on a trouvé le bon nom est qu'on a assez de place
			if (spectacleTab[i].getNom().equalsIgnoreCase(spectacleNom)
					&& spectacleTab[i].getCapacitySpectacle() >= (spectacleTab[i].getInscrit() + nbClient)) {

				spectacleTab[i].setInscrit((short) (spectacleTab[i].getInscrit() + (short) nbClient));
				return text = nbClient + " personnes ont été ajouté au spectacle " + spectacleTab[i].getNom();
			}

			// Si on a trop de participant dans le spectacle demandé mais qu'il reste de la
			// place on ajoute ceux qui le peuvent
			else if ((spectacleTab[i].getNom().equalsIgnoreCase(spectacleNom)
					&& (spectacleTab[i].getCapacitySpectacle() < (spectacleTab[i].getInscrit() + nbClient)
							&& placeRestante > 0))) {

				spectacleTab[i].setInscrit((short) ((short) spectacleTab[i].getInscrit() + placeRestante));
				System.out.println();
				return text = "Vous avez rentré trop de participant seulement " + placeRestante
						+ " personnes ont pus s'inscrire sur les " + nbClient + " participants";
			}

			else if (spectacleTab[i].getInscrit() == spectacleTab[i].getCapacitySpectacle()) {
				System.err.println();
				return text = "Il n'y a plus de place dans le spectacle " + spectacleTab[i].getNom();
			}

			// Si on est déja au max de participant on prévient l'utilisateur
			else if (!spectacleTab[i].getNom().equalsIgnoreCase(spectacleNom)) {
				return "Ce spectacle n'existe pas ";
			}
		}
		return text;
	}

	// La recette global à tout les spectacles
	public float getRecetteTotal() {
		float recetteTotal = 0.0f;
		for (int i = 0; i < spectacleTab.length; i++) {
			recetteTotal += spectacleTab[i].getTarifUnitaire() * spectacleTab[i].getInscrit();
		}
		System.out.println("La recette total de tout les spectacles est de :" + recetteTotal + "$");
		return recetteTotal;
	}

	// Nombre total de client
	public int getNbTotalClients() {
		int clientTotal = 0;
		for (int i = 0; i < spectacleTab.length; i++) {
			clientTotal += spectacleTab[i].getInscrit();
		}
		System.out.println("Le nombre total d'inscrit sur tout les spectacles est de " + clientTotal + " personnes");
		return clientTotal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Spectacle[] getSpectacleTab() {
		for (int i = 0; i < spectacleTab.length; i++) {
			System.out.println(spectacleTab[i]);
		}
		return spectacleTab;
	}

	public void setSpectacleTab(Spectacle[] spectacleTab) {
		this.spectacleTab = spectacleTab;
	}

}
