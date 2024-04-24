package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Libros;

public class TestLibros {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Club");
	EntityManager em = emf.createEntityManager();
	
	public TestLibros() {}
	
	public void Insertar_Libros() {
		Libros insertarLibro = new Libros();
		insertarLibro.setCodigo(3);
		insertarLibro.setNombre("El quijote");
		insertarLibro.setCod_autores(5);
		insertarLibro.setCod_editorial(7);
		insertarLibro.setFechalanzamiento("08/12/12");
		
		em.getTransaction().begin();
		em.persist(insertarLibro);
		em.getTransaction().commit();
		
	}
	
	
	
	public static void main(String[]args) {
		TestLibros testCliente = new TestLibros();
		testCliente.Insertar_Libros();
	}
	
	public void Actualizar_Libro() {
		em.getTransaction().begin();
		Libros actualizarLibro = em.find(Libros.class, 6);
		
		System.out.println("codigo" + actualizarLibro.getCodigo());
		System.out.println("nombre" + actualizarLibro.getNombre());
		System.out.println("apellido" + actualizarLibro.getCod_autores());
		System.out.println("num_celular" + actualizarLibro.getCod_editorial());
		System.out.println("num_celular" + actualizarLibro.getCod_editorial());
		System.out.println("num_celular" + actualizarLibro.getFechalanzamiento());
	
		actualizarLibro.setCodigo(6);
		actualizarLibro.setNombre("Paco Yunke");
		actualizarLibro.setCod_autores(8);
		actualizarLibro.setCod_editorial(9);
		actualizarLibro.setFechalanzamiento("07/13/06");
		em.merge(actualizarLibro) ;
		em.getTransaction().commit();
		
	}
	/*public static void main(String[]args) {
		TestCliente testCliente = new TestCliente();
		testCliente.Actualizar_Cliente();
	}*/
	
	
	public void Eliminar_Libro() {
		em.getTransaction().begin();
		Libros eliminarLibro = em.find(Libros.class , 6);
		System.out.println("codigo" + eliminarLibro.getCodigo());
		System.out.println("nombre" + eliminarLibro.getNombre());
		em.remove(eliminarLibro);
		em.getTransaction().commit();
	}
	
	/*public static void main(String[]args) {
		TestLibros testLibro = new TestLibros();
		testLibro.Eliminar_Libro();
	}*/
	
	
	
	public void ListarLibro() {
		List<Libros> listarCliente = em.createQuery("SELECT cod_libro, nombre "
				+ "FROM biblioteca.libros", Libros.class).getResultList();
		System.out.print("Numero de libros:"+ listarCliente.size());
		for(Libros us:listarCliente) {
				System.out.println("Libros:" + us);
		}
		
	}

}
