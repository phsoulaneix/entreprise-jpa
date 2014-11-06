package jpa;

import java.util.ArrayList;
import java.util.Collection;

public class Departement {

  private int id;
  private String nom;
  private String lieu;
  private Collection<Employe> employes = new ArrayList<Employe>();

  /**
   * Retourne l'identificateur géré par le SGBD. Identifie une ligne
   * de la base.
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
   * Méthode utilitaire souvent employée pour les associations
   * bidirectionnelles pour éviter d'oublier de mettre à jour
   * un des bouts de l'assocation.
   * @param employe
   */
  public void addEmploye(Employe employe) {
    // Si l'employé est déjà dans un département, il faut l'enlever de
    // ce département dans la liste des employés de ce département
    Departement ancienDept;
    if ((ancienDept = employe.getDepartement()) != null) {
      ancienDept.employes.remove(employe);
    }
    employes.add(employe);
    employe.setDepartement(this);
  }

}
