package Aula;

import java.util.Arrays;

public class Aula {

	private Alumno alumnos[];
	private int cuantosHay;
	
	public Aula(){
		alumnos=new Alumno[5];
		cuantosHay=0;
	}

	public void addAlumno(Alumno Alumno) {
		if(cuantosHay<alumnos.length) {
			alumnos[cuantosHay]=Alumno;
			cuantosHay++;
		}
	}
	
	public float getMediaTotal() {
		float MediaTotal=0;
		float suma = 0;
		for(int i=0;i<cuantosHay;i++) {
			Asignatura[] asignatura= alumnos[i].getCalificacion();
			suma=alumnos[i].getMediaEV1(asignatura);
			
			if(suma>0) {
				MediaTotal+=suma;
			}
		}
		MediaTotal=MediaTotal/cuantosHay;
		return MediaTotal;
	}
	
	
	
	public String toString() {
		String devolver= "Aula alumnos ";
		for(int i=0;i<cuantosHay;i++) {
			devolver+=alumnos[i]+" ";
		}
		return  devolver;
	}
}
