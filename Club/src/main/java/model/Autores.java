package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Autores implements Serializable{
	@Id
	@Column(name = "cod_autor")
	private int cod_autores;
	@Column(name = "nom_autor")
	private String nombre;
	@Column(name = "nacionalidad")
	private String nacionalidad;
	
	public Autores () {
		
	}

	public int getCod_autores() {
		return cod_autores;
	}

	public void setCod_autores(int cod_autores) {
		this.cod_autores = cod_autores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
