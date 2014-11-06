package com.formation.entreprise.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.entreprise.entity.Departement;

/**
 * Teste la persistance de la classe Departement.
 */
public class Test1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employes");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			final Departement dept = new Departement("Direction", "Nice");
			final Departement dept2 = new Departement("Comptabilité", "Nice");
			final Departement dept3 = new Departement("Gestion personnel",
					"Nantes");
			em.persist(dept);
			em.persist(dept2);
			em.persist(dept3);
			dept.setLieu("Paris");
			tx.commit();
		} catch (final Exception e) {
			// En "vrai" il faudrait affiner un peu plus...
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

}