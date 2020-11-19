package com.gcb.cdc.modelo;

public class ModeloCovid {
	// de  acuerdo a los campos de la BD
	
	String id;
	int sexo;
	int entidad;
	int edad;
	int epoc;
	int asma;
	int hipertension;
	int obesidad;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public int getEntidad() {
		return entidad;
	}
	public void setEntidad(int entidad) {
		this.entidad = entidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEpoc() {
		return epoc;
	}
	public void setEpoc(int epoc) {
		this.epoc = epoc;
	}
	public int getAsma() {
		return asma;
	}
	public void setAsma(int asma) {
		this.asma = asma;
	}
	public int getHipertension() {
		return hipertension;
	}
	public void setHipertension(int hipertension) {
		this.hipertension = hipertension;
	}
	public int getObesidad() {
		return obesidad;
	}
	public void setObesidad(int obesidad) {
		this.obesidad = obesidad;
	}
	public ModeloCovid() {
		
		id = "";
		sexo = 0;
		entidad = 0;
		edad = 0;
		epoc = 0;
		asma = 0;
		hipertension = 0;
		obesidad = 0;
	}
	
	
	
	
	

}
