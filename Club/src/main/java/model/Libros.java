package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libros implements Serializable{
	@Id
	@Column(name = "cod_libro")
	private int codigo;	
	@Column(name = "nom_libro")
	private String nombre;
	@Column(name = "cod_autor")
	private int cod_autores;
	@Column(name = "cod_editorial")
	private int cod_editorial;
	@Column(name = "fec_lanzamiento")
	private String fechalanzamiento;
	
	
	public Libros() {
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCod_autores() {
		return cod_autores;
	}


	public void setCod_autores(int cod_autores) {
		this.cod_autores = cod_autores;
	}


	public int getCod_editorial() {
		return cod_editorial;
	}


	public void setCod_editorial(int cod_editorial) {
		this.cod_editorial = cod_editorial;
	}


	public String getFechalanzamiento() {
		return fechalanzamiento;
	}


	public void setFechalanzamiento(String fechalanzamiento) {
		this.fechalanzamiento = fechalanzamiento;
	}
	
	

}
