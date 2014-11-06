package com.formation.entreprise.entity;

import java.util.ArrayList;
import java.util.Collection;

public class Departement {

	private int id;
	private String nom;
	private String lieu;
	private final Collection<Employe> employes = new ArrayList<Employe>();

	public Departement(String nom, String lieu) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Retourne l'identificateur g�r� par le SGBD. Identifie une ligne de la
	 * base.
	 */
	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Collection<Employe> getEmployes() {
		return employes;
	}

	/**
	 * M�thode utilitaire souvent employ�e pour les associations
	 * bidirectionnelles pour �viter d'oublier de mettre � jour un des bouts de
	 * l'assocation.
	 * 
	 * @param employe
	 */
	public void addEmploye(Employe employe) {
		// Si l'employ� est d�j� dans un d�partement, il faut l'enlever de
		// ce d�partement dans la liste des employ�s de ce d�partement
		Departement ancienDept;
		if ((ancienDept = employe.getDepartement()) != null) {
			ancienDept.employes.remove(employe);
		}
		employes.add(employe);
		employe.setDepartement(this);
	}

}
