package Ejemplo;

import java.util.Calendar; //Ejemplo aprenderaprogramar.com
import java.util.Scanner;

public class TestAbstract {

	public static void main(String[] Args) {

		Scanner teclado=new Scanner(System.in);
		
		Calendar fecha1 = Calendar.getInstance();

		fecha1.set(2019, 10, 22); // Los meses van de 0 a 11, luego 10 representa noviembre

		ProfesorInterino pi1 = new ProfesorInterino("José", "Hernández López", 45, "45221887-K", fecha1);

		ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", 87, "72332634-L", fecha1);

		ProfesorInterino pi3 = new ProfesorInterino("José", "Ríos Mesa", 76, "34998128-M", fecha1);

		ProfesorTitular pt1 = new ProfesorTitular("Juan", "Pérez Pérez", 23, "73-K");

		ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa Mota", 49, "88-L");

		ProfesorTitular pt3 = new ProfesorTitular("Alberto", "Centa Mota", 49, "81-F");

		ListinProfesores listinProfesorado = new ListinProfesores();

		
		listinProfesorado.addProfesor(pi2);
		listinProfesorado.addProfesor(pi3);

		listinProfesorado.addProfesor(pt1);
		listinProfesorado.addProfesor(pt2);
		listinProfesorado.addProfesor(pt3);

		listinProfesorado.imprimirListin();

		System.out.println("El importe de las nóminas del profesorado que consta en el listín es " +

				listinProfesorado.importeTotalNominaProfesorado() + " euros");
		
		System.out.println("In");
		int op=teclado.nextInt();
		
		switch (op) {
		case 1:
			listinProfesorado.addProfesor(pi1);
			listinProfesorado.imprimirListin();
			break;

		default:
			break;
		}
		
	}
} // Cierre del main y cierre de la clase
