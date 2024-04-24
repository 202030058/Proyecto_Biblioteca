package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editorial")
public class Editorial implements Serializable{
	
	@Id
	@Column(name = "cod_editorial")
	private int cod_editorial;
	@Column(name = "nom_editorial")
	private String nom_editorial;
	@Column(name = "dir_editorial")
	private String dir_editorial;
	@Column (name= "num_telefono")
	private String num_telefono;
	
	public Editorial() {}

	public int getCod_editorial() {
		return cod_editorial;
	}

	public void setCod_editorial(int cod_editorial) {
		this.cod_editorial = cod_editorial;
	}

	public String getNom_editorial() {
		return nom_editorial;
	}

	public void setNom_editorial(String nom_editorial) {
		this.nom_editorial = nom_editorial;
	}

	public String getDir_editorial() {
		return dir_editorial;
	}

	public void setDir_editorial(String dir_editorial) {
		this.dir_editorial = dir_editorial;
	}

	public String getNum_telefono() {
		return num_telefono;
	}

	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}
	
	

}
