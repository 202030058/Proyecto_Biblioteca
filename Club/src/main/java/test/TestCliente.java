package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class TestCliente {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Club");
	EntityManager em = emf.createEntityManager();
	
	public TestCliente() {}
	
	public void Insertar_Cliente() {
		Cliente insertarCliente = new Cliente();
		insertarCliente.setCodigo(6);
		insertarCliente.setNombre("Ruben");
		insertarCliente.setApellido("Gomez");
		insertarCliente.setNumeroCelular(9636474);
		
		em.getTransaction().begin();
		em.persist(insertarCliente);
		em.getTransaction().commit();
		
	}
	
	public static void main(String[]args) {
		TestCliente testCliente = new TestCliente();
		testCliente.Insertar_Cliente();
	}
	
	public void Actualizar_Cliente() {
		em.getTransaction().begin();
		Cliente actualizarCliente = em.find(Cliente.class, 6);
		
		System.out.println("codigo" + actualizarCliente.getCodigo());
		System.out.println("nombre" + actualizarCliente.getNombre());
		System.out.println("apellido" + actualizarCliente.getApellido());
		System.out.println("num_celular" + actualizarCliente.getNumeroCelular());
		actualizarCliente.setCodigo(5);
		actualizarCliente.setNombre("Pablo");
		actualizarCliente.setApellido("Salinas");
		actualizarCliente.setNumeroCelular(974643);
		em.merge(actualizarCliente) ;
		em.getTransaction().commit();
		
	}
	/*public static void main(String[]args) {
		TestCliente testCliente = new TestCliente();
		testCliente.Actualizar_Cliente();
	}*/
	
	
	public void Eliminar_Cliente() {
		em.getTransaction().begin();
		Cliente eliminarCliente = em.find(Cliente.class , 6);
		System.out.println("codigo" + eliminarCliente.getCodigo());
		System.out.println("nombre" + eliminarCliente.getNombre());
		
		em.remove(eliminarCliente);
		em.getTransaction().commit();
	}
	
	/*public static void main(String[]args) {
		TestCliente testCliente = new TestCliente();
		testCliente.Eliminar_Cliente();
	}*/
	
	
	/*public void ListarCliente() {
		List<Cliente> listarCliente = em.createQuery("SELECT cod_cliente, nombre "
				+ "FROM biblioteca.cliente", Cliente.class).getResultList();
		System.out.print("Numero de cliente:"+ listarCliente.size());
		for(Cliente us:listarCliente) {
				System.out.println("Cliente:" + us);
		}
	}*/

}
