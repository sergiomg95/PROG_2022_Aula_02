package Aula;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int telefono;
	private Asignatura asignaturas[];
	private int cuantasAsig;
	
	
	public Alumno() {
		asignaturas=new Asignatura[4];
		cuantasAsig=0;
	}
	
	public void addAsig(Asignatura Asignatura) {
		if(cuantasAsig<asignaturas.length) {
			asignaturas[cuantasAsig]=Asignatura;
			cuantasAsig++;
		}
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String toString() {
		return "Alumno nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", asignaturas="
				+ Arrays.toString(asignaturas) + "";
	}

}
