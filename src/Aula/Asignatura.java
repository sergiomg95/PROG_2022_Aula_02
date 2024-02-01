package Aula;

public class Asignatura {
	
	private String nombre;
	private int EV1;
	private int EV2;
	private int EV3;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEV1() {
		return EV1;
	}
	public void setEV1(int eV1) {
		EV1 = eV1;
	}
	public int getEV2() {
		return EV2;
	}
	public void setEV2(int eV2) {
		EV2 = eV2;
	}
	public int getEV3() {
		return EV3;
	}
	public void setEV3(int eV3) {
		EV3 = eV3;
	}
	
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", EV1=" + EV1 + ", EV2=" + EV2 + ", EV3=" + EV3 + "]";
	}
	
	
}
