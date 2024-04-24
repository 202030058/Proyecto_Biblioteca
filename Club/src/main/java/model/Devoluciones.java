package model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "devoluciones")
public class Devoluciones implements Serializable{
	
	@Id
	@Column(name="cod_devolucion")
	private int codigodevolucion;
	@Column(name="cod_pestamo")
	private int codigopestamo;
	@Column(name="fech_devolucion")
	private String fecha;
	
	public Devoluciones() {}

	public int getCodigodevolucion() {
		return codigodevolucion;
	}

	public void setCodigodevolucion(int codigodevolucion) {
		this.codigodevolucion = codigodevolucion;
	}

	public int getCodigopestamo() {
		return codigopestamo;
	}

	public void setCodigopestamo(int codigopestamo) {
		this.codigopestamo = codigopestamo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
		

}
