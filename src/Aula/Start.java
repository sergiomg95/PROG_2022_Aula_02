package Aula;

import java.util.Set;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula aula=new Aula();
		
		Alumno a1=new Alumno("Pedro","Alvarez",97538213);
		Alumno a2=new Alumno("Juan", "Gonzalez",83253186);
		
		aula.addAlumno(a1);
		aula.addAlumno(a2);
		
		System.out.println(aula);
		
	}

}
