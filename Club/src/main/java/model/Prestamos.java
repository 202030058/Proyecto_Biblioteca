package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "prestamos")
public class Prestamos implements Serializable {
	@Id
	@Column(name = "cod_prestamo")
	private int cod_prestamo;
	private int cod_cliente;
	private int cod_libro;
	private String fech_prestamo;
	
	public Prestamos() {}

	

	public int getCod_prestamo() {
		return cod_prestamo;
	}



	public void setCod_prestamo(int cod_prestamo) {
		this.cod_prestamo = cod_prestamo;
	}



	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(int cod_libro) {
		this.cod_libro = cod_libro;
	}



	public String getFech_prestamo() {
		return fech_prestamo;
	}



	public void setFech_prestamo(String fech_prestamo) {
		this.fech_prestamo = fech_prestamo;
	}

	
	

}
