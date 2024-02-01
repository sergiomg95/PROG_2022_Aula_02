package Aula;

import java.util.Arrays;

public class Aula {

	private Alumno alumnos[];
	
	public Aula() {
		alumnos=new Alumno[5];
	}

	
	public String toString() {
		return "Aula alumnos=" + Arrays.toString(alumnos) + "]";
	}
}
