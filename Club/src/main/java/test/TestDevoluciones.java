package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;
import model.Devoluciones;

public class TestDevoluciones {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Club");
	EntityManager em = emf.createEntityManager();
	
	public TestDevoluciones() {}
	
	public void Insertar_Devoluciones() {
		Devoluciones insertarDevolucion = new Devoluciones();
		insertarDevolucion.setCodigodevolucion(2);
		insertarDevolucion.setCodigopestamo(2);
		insertarDevolucion.setFecha("");
		
		em.getTransaction().begin();
		em.persist(insertarDevolucion);
		em.getTransaction().commit();
		
	}
	
	/*public static void main(String[]args) {
		TestDevoluciones testDevolucion = new TestDevoluciones();
		testDevolucion.Insertar_Devoluciones();
	}*/
	
	public void Actualizar_Devoluciones() {
		em.getTransaction().begin();
		Devoluciones actualizarDevolucion = em.find(Devoluciones.class, 2);
		
		System.out.println("codigodevolucion" + actualizarDevolucion.getCodigodevolucion());
		System.out.println("codigoprestamo" + actualizarDevolucion.getCodigopestamo());
		System.out.println("fecha" + actualizarDevolucion.getFecha());
		actualizarDevolucion.setCodigodevolucion(2);
		actualizarDevolucion.setCodigopestamo(4);
		actualizarDevolucion.setFecha("");
		em.merge(actualizarDevolucion) ;
		em.getTransaction().commit();
		
	}
	/*public static void main(String[]args) {
		TestDevoluciones testDevolucion = new TestDevoluciones();
		testDevolucion.Actualizar_Devoluciones();
	}*/
	
	
	public void Eliminar_Devoluciones() {
		em.getTransaction().begin();
		Devoluciones eliminarDevolucion = em.find(Devoluciones.class , 2);
		System.out.println("codigodevolucion" + eliminarDevolucion.getCodigodevolucion());
		System.out.println("fecha" + eliminarDevolucion.getFecha());
		em.remove(eliminarDevolucion);
		em.getTransaction().commit();
	}
	
	public static void main(String[]args) {
		TestDevoluciones testDevolucion = new TestDevoluciones();
		testDevolucion.Eliminar_Devoluciones();
	}

}
