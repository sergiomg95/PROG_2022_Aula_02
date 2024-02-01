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
	
	public String toString() {
		return "Aula alumnos=" + Arrays.toString(alumnos) + "]";
	}
}
