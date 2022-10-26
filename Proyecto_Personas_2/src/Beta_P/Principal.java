package Beta_P;

import java.util.Iterator;
import java.util.Scanner;

import persona.alumnos;


public class Principal {

	public static int op;
	public static Scanner txt = new Scanner(System.in);
	private static int opA;

	public static void MenuUno() {
		System.out.println("-----MENU-----");
		System.out.println("1.Lista de personas\n2.-Salir");
		System.out.println("Ingresa una opcion:");
		op = txt.nextInt();
	}public static void MenuAlumnos() {
		System.out.println("-----ALUMNOS-----");
		System.out.println("1.Edgar\n2.Raul\n3.Uriel\n4.Salir");
		System.out.println("Ingresa una opcion:");
		opA = txt.nextInt();
	}public static void MenuDocentes() {
		System.out.println("-----DOCENTES-----");
		System.out.println("1.Jose\n2.Maria\n3.Pepe\n4.Salir");
		System.out.println("Ingresa una opcion:");
		int opD = txt.nextInt();
	}public static void MenuAdminitrativos() {
		System.out.println("-----ADMINISTRATIVOS-----");
		System.out.println("1.David\n2.Angela\n3.Angel\n4.Salir");
		System.out.println("Ingresa una opcion:");
		int opAD = txt.nextInt();
	}public static void MenuDirectivos() {
		System.out.println("-----DIRECTIVOS-----");
		System.out.println("1.Francisco\n2.Salir");
		System.out.println("Ingresa una opcion:");
		int opDI = txt.nextInt();
	}
	

	public static void main(String[] args) {

		
		Alumnos alumno1= new Alumnos("Edgar","Varela","Mejia",1.89,89,16,"masculino",648372559);
		Alumnos alumno2= new Alumnos("Raul","Reynoso","Santana",1.80,80,17,"masculino",128238124);
		Alumnos alumno3= new Alumnos("Uriel","Martinez","Zamora",1.65,74,16,"masculino",920122324);

		
		int continuar2 = 0;	
		do {	
		MenuUno();		
		switch(op) {
		case 1: 
			
			System.out.println("-----------Lista de personas-----------");
			
				System.out.println("1.-Alumnos \n2.-Docentes \n3.-Administrativos \n4.Directivos\n5.Salir"					
						+ "\nIngresa una opcion:");
					int op1;
					op1=txt.nextInt();
			
			switch (op1) {
				case 1:
					MenuAlumnos();
				
				switch (opA) {
					case 1:
						System.out.println(alumno1.getNombre());
						break;

					default:
						break;
					}
					
					break;
				case 2:
					MenuDocentes();
					break;
				case 3:
					MenuAdminitrativos();
					break;
				case 4:
					MenuDirectivos();
					break;
				case 5:
					
					break;
				default:
					System.out.println("Opcion no encontrada");
					break;
				}
		case 2:
			
			break;
		default:
			System.out.println("Esta opcion no exite");
			break;
		}
	
	}while (continuar2==0);
}
		
}
