package jpa;

import java.math.BigDecimal;

/** 
 * Un employé de l'entreprise.
 */
public class Employe extends Personne {
	private BigDecimal salaire;
	private Employe superieur;
	private Departement departement;

	public BigDecimal getSalaire() {
		return salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	public Employe getSuperieur() {
		return superieur;
	}

	public void setSuperieur(Employe employe) {
		this.superieur = employe;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
}
