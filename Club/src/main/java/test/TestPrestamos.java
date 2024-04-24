package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Prestamos;

public class TestPrestamos {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Club");
	EntityManager em = emf.createEntityManager();
	
	public TestPrestamos() {}
	
	public void Insertar_Prestamos() {
		Prestamos insertarPrestamo = new Prestamos();
		insertarPrestamo.setCod_prestamo(3);
		insertarPrestamo.setCod_cliente(2);
		insertarPrestamo.setCod_libro(5);
		insertarPrestamo.setFech_prestamo("10/04/2024");
		
		em.getTransaction().begin();
		em.persist(insertarPrestamo);
		em.getTransaction().commit();
		
	}
	
	public static void insertar(String[]args) {
		TestPrestamos testPestamos = new TestPrestamos();
		testPestamos.Insertar_Prestamos();
	}
	
	public void Actualizar_Prestamos() {
		em.getTransaction().begin();
		Prestamos actualizarPrestamos = em.find(Prestamos.class, 1);
		
		System.out.println("codigo" + actualizarPrestamos.getCod_prestamo());
		System.out.println("nombre" + actualizarPrestamos.getCod_cliente());
		System.out.println("apellido" + actualizarPrestamos.getCod_libro());
		System.out.println("num_celular" + actualizarPrestamos.getFech_prestamo());
		
	}
	/*public static void actualizar(String[]args) {
		TestPrestamos testPestamos = new TestPrestamos();
		testPestamos.Actualizar_Prestamos();
	}*/
	
	
	public void Eliminar_Prestamos() {
		em.getTransaction().begin();
		Prestamos eliminarPrestamos = em.find(Prestamos.class , 2);
		System.out.print("codigo" + eliminarPrestamos.getCod_prestamo());
		em.remove(eliminarPrestamos);
	}
	/*public static void eliminar(String[]args) {
		TestPrestamos testPestamos = new TestPrestamos();
		testPestamos.Eliminar_Prestamos();
	}*/
	
	public void ListarPrestamos() {
		List<Prestamos> listarPrestamos = em.createQuery("SELECT cod_prestamo, fech_prestamo "
				+ "FROM biblioteca.prestamos", Prestamos.class).getResultList();
		System.out.print("Numero de prestamos:"+ listarPrestamos.size());
		for(Prestamos us:listarPrestamos) {
				System.out.println("Prestamo:" + us);
		}
	}
		

}
