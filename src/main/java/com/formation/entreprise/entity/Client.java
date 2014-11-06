package com.formation.entreprise.entity;

public class Client extends Personne {

	private Adresse adresse;

	public Client(String nom, Adresse adresse) {
		// TODO Auto-generated constructor stub
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
