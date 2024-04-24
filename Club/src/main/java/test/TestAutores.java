package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Autores;

public class TestAutores {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Club");
	EntityManager em = emf.createEntityManager();
	
	public TestAutores() {}
	
	public void Insertar_Autores() {
		Autores insertarAutores = new Autores();
		insertarAutores.setCod_autores(5);;
		insertarAutores.setNombre("Ramon");
		insertarAutores.setNacionalidad("Peru");
		
		em.getTransaction().begin();
		em.persist(insertarAutores);
		em.getTransaction().commit();
		
	}
	
	public static void main(String[]args) {
		TestAutores testAutores = new TestAutores();
		testAutores.Insertar_Autores();
		
	}
	
	
	public void Actualizar_Autores() {
		em.getTransaction().begin();
		Autores actualizarAutores = em.find(Autores.class, 5);
		
		System.out.println("cod_autores" + actualizarAutores.getCod_autores());
		System.out.println("nombre" + actualizarAutores.getNombre());
		System.out.println("nacionalidad" + actualizarAutores.getNacionalidad());
		
	}
	
	/*public static void main1(String[]args) {
		TestAutores testAutores = new TestAutores();
		testAutores.Actualizar_Autores();
		
	}*/
	
	
	public void EliminaAutores() {
	em.getTransaction().begin();
	Autores eliminarAutores = em.find(Autores.class , 5);
	System.out.print("codigo" + eliminarAutores.getCod_autores());
	System.out.print("nombre" + eliminarAutores.getNombre());
	System.out.print("nombre" + eliminarAutores.getNacionalidad());
	em.remove(eliminarAutores);
	}
	
	
	/*public static void main(String[]args) {
		TestAutores testAutores = new TestAutores();
		testAutores.EliminaAutores();
		
	}*/
	
	/*public void Listar_Autores() {
		List<Autores> listarAutores = em.createQuery("SELECT cod_usua, nom_usua FROM ciberfarmadawi.usuarios",
		Autores.class).getResultList();
		System.out.println("Numero de autores:" + listarAutores.size());
		for (Autores us: listarAutores) {
		System.out.println("Autores: " + us);
		}
		}*/

}
