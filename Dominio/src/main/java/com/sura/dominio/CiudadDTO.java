package com.sura.dominio;

public class CiudadDTO implements java.io.Serializable{

	private String nombre;
	
	public CiudadDTO(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
