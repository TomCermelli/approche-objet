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
		if(clients<nbMax) {
			this.client += clients ;
			argentTotal += price;
		}
		else {
			System.err.println("Le theâtre " +nom+ " est remplit\n Venez moin nombreux");
		}
	}
	
}
