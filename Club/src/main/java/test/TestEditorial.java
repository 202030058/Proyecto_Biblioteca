package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Editorial;

public class TestEditorial {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Club");
	EntityManager em = emf.createEntityManager();
	
	public TestEditorial() {}
	
	public void Insertar_Editorial() {
		Editorial insertarEditorial = new Editorial();
		insertarEditorial.setCod_editorial(2);
		insertarEditorial.setNom_editorial("Perubian");
		insertarEditorial.setDir_editorial("AV. España");
		insertarEditorial.setNum_telefono("935 655 556");
		
		em.getTransaction().begin();
		em.persist(insertarEditorial);
		em.getTransaction().commit();
		
	}
	
	public static void main(String[]args) {
		TestEditorial testEditorial = new TestEditorial();
		testEditorial.Insertar_Editorial();
		
	}
	

}
