package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int nbMax;
	private int client;
	private int argentTotal;
	
	
	//Constructeur
	public Theatre(String nom, int nbMax, int client, int argentTotal) {
		this.nom = nom;
		this.nbMax = nbMax;
		this.client = client;
		this.argentTotal = argentTotal;
	}


	// Inscription, met à jour nombre de client total et l'argentTotal
	public void inscrire(int clients, float price) {
		int placeRestante = nbMax-client;
		if((this.client+clients)<=nbMax) {
			this.client += clients ;
			argentTotal += price;
		}
		else if((client+clients)>nbMax && placeRestante>0) {
			client += placeRestante;
			System.out.println("Vous avez rentré trop de participant seulement " +placeRestante+ " personnes ont pus s'inscrire sur les " +clients+ " participants");
		}
		else if (client == nbMax) {
			System.err.println("Il n'y a plus de place dans le théatre");
		}
	}

	
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbMax() {
		return nbMax;
	}


	public void setNbMax(int nbMax) {
		this.nbMax = nbMax;
	}


	public int getClient() {
		return client;
	}


	public void setClient(int client) {
		this.client = client;
	}


	public int getArgentTotal() {
		return argentTotal;
	}


	public void setArgentTotal(int argentTotal) {
		this.argentTotal = argentTotal;
	}
	
	
	
}
