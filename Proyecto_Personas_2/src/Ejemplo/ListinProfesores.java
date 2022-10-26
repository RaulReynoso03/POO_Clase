package Ejemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListinProfesores {

	private ArrayList<Profesor> listinProfesores; // Campo de la clase

	public ListinProfesores() {
		listinProfesores = new ArrayList<Profesor>();
	} // Constructor

	public void addProfesor(Profesor profesor) {
		listinProfesores.add(profesor);
	} // Método

	public void imprimirListin() {  

		System.out.println("Se procede a mostrar los datos de los profesores existentes en el listín \n");
		System.out.println(toString());
	

	} // Cierre método imprimirListin

	public float importeTotalNominaProfesorado() {

		float importeTotal = 0f; // Variable temporal que usamos como auxiliar

		Iterator<Profesor> it = listinProfesores.iterator();

		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeNomina();
		}

		return importeTotal;

	} // Cierre del método importeTotalNominaProfesorado

} // Cierre de la clase ejemplo aprenderaprogramar.com