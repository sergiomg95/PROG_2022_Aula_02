package Aula;

import java.util.Set;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula aula=new Aula();
		
		Alumno a1=new Alumno("Pedro","Alvarez",97538213);
		Asignatura asig1=new Asignatura("Ingles",7,6,8);
		Asignatura asig2=new Asignatura("Progamacion",7,6,5);
		Asignatura asig3=new Asignatura("Bases de Datos",5,6,5);
		Asignatura asig4=new Asignatura("Lenguaje de Marcas",4,5,6);
		Alumno a2=new Alumno("Juan", "Gonzalez",83253186);
		Asignatura asig5=new Asignatura("Sistemas",4,7,5);
		Asignatura asig6=new Asignatura("Progamacion",4,8,7);
		Asignatura asig7=new Asignatura("Bases de Datos",7,8,8);
		Asignatura asig8=new Asignatura("FOL",5,5,5);
		
		aula.addAlumno(a1);
		a1.addAsig(asig1);
		a1.addAsig(asig2);
		a1.addAsig(asig3);
		a1.addAsig(asig4);
		
		aula.addAlumno(a2);
		a2.addAsig(asig5);
		a2.addAsig(asig6);
		a2.addAsig(asig7);
		a2.addAsig(asig8);
		
		System.out.println(aula);
		
	}

}
