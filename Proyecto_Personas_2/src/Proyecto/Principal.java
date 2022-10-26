package Proyecto;


import java.util.Scanner;

public class Principal {

	public static int op;
	public static Scanner txt = new Scanner(System.in);
	private static int opA;
	private static int opD;
	private static int opDI2;
	private static int opAD;

	public static void MenuUno() {
		System.out.println("-----MENU-----");
		System.out.println("1.Lista de personas\n2.-Salir");
		System.out.println("Ingresa una opcion:");
		op = txt.nextInt();
	}

	public static void main(String[] args) {

		Alumnos alumno1 = new Alumnos("Edgar", "Varela", "Mejia", 1.89, 89, 16, "masculino", 648372559);
		Alumnos alumno2 = new Alumnos("Raul", "Reynoso", "Santana", 1.80, 80, 17, "masculino", 128238124);
		Alumnos alumno3 = new Alumnos("Uriel", "Martinez", "Zamora", 1.65, 74, 16, "masculino", 920122324);

		Docentes docentes1 = new Docentes("Carpos", "Perez", "Matinez", 16, 89, 29, "Hombre", 24354, 5435345,
				"Geometia");
		Docentes docentes2 = new Docentes("Maria", "Gomez", "Martinez", 172, 75, 30, "femenino", 30000, 87658465,
				"Biologia");
		Docentes docentes3 = new Docentes("Pepe", "Sanchez", "Espinosa", 162, 65, 28, "masculino", 60000, 768523145,
				"Etica");

		Administrativos administrativo1 = new Administrativos("David", "Herrera", "Gonzales", 1.90, 90, 42, "masculino",
				"Perfecto");
		Administrativos administrativo2 = new Administrativos("Angela", "Reynoso", "Perez", 1.70, 79, 37, "Femenino",
				"Sub directora");
		Administrativos administrativo3 = new Administrativos("Angel", "Meneses", "Islas", 1.81, 69, 48, "masculino",
				"perfecto");

		Directivos directivo1 = new Directivos("Francisco", "Martinez", "Zamora", 1.83, 70, 54, "masculino", 30000,
				"Director");

		int continuar2 = 0;
		do {
			MenuUno();
			switch (op) {
			case 1:

				System.out.println("-----------Lista de personas-----------");

				System.out.println("1.-Alumnos \n2.-Docentes \n3.-Administrativos \n4.Directivos\n5.Salir"
						+ "\nIngresa una opcion:");
				int op1;
				op1 = txt.nextInt();
				int continuar3 = 0;

				switch (op1) {
				case 1:
					System.out.println("-----ALUMNOS-----");
					System.out.println("1.Edgar\n2.Raul\n3.Uriel\n4.Salir");
					System.out.println("Ingresa una opcion:");
					opA = txt.nextInt();
					switch (opA) {
					case 1:
						System.out.println(alumno1.getDatosA());
						get(alumno1);
						break;
					case 2:
						System.out.println(alumno2.getDatosA());
						get(alumno2);
						break;
					case 3:
						System.out.println(alumno3.getDatosA());
						get(alumno3);
						break;
					case 4:
						System.out.println("Usted a salido del programa");
						System.exit(0);
						break;
					default:
						System.out.println("Esta obcion no existe");
						break;
					}

					break;

				case 2:
					System.out.println("-----DOCENTES-----");
					System.out.println("1.Jose\n2.Maria\n3.Pepe\n4.Salir");
					System.out.println("Ingresa una opcion:");
					opD = txt.nextInt();

					switch (opD) {
					case 1:
						System.out.println(docentes1.getDatosA());
						break;
					case 2:
						System.out.println(docentes2.getDatosA());
						break;
					case 3:
						System.out.println(docentes3.getDatosA());
						break;
					case 4:
						System.out.println("Usted a salido del programa");
						System.exit(0);
						break;
					default:
						System.out.println("Esta obcion no existe");
						break;
					}
					break;
				case 3:
					System.out.println("-----ADMINISTRATIVOS-----");
					System.out.println("1.David\n2.Angela\n3.Angel\n4.Salir");
					System.out.println("Ingresa una opcion:");
					opAD = txt.nextInt();

					switch (opAD) {
					case 1:
						System.out.println(administrativo1.getDatosA());
						break;
					case 2:
						System.out.println(administrativo2.getDatosA());
						break;
					case 3:
						System.out.println(administrativo3.getDatosA());
						break;
					case 4:
						System.out.println("Usted a salido del programa");
						System.exit(0);
						break;
					default:
						System.out.println("Esta obcion no existe");
						break;
					}
					break;
				case 4:
					System.out.println("-----DIRECTIVOS-----");
					System.out.println("1.Francisco\n2.Salir");
					System.out.println("Ingresa una opcion:");
					opDI2 = txt.nextInt();

					switch (opDI2) {
					case 1:
						System.out.println(directivo1.getDatosA());
						break;
					case 2:
						System.out.println("Usted a salido del programa");
						break;
					default:
						System.out.println("Esta obcion no existe");
						break;
					}
					break;
				case 5:
					System.out.println("Usted a salido del programa");
					System.exit(0);
					break;
				default:
					System.out.println("Opcion no encontrada");
					break;
				}
				break;
			case 2:
				System.out.println("Usted a salido del programa");
				System.exit(0);
				break;
			default:
				System.out.println("Esta opcion no exite");
				break;
			}
		} while (continuar2 == 0);
	}
	static public void menuI(Alumnos a) {
		int op;
		int ac = 0;
		int continuar4 = 0;
		do {
			System.out.println("-----------METODOS-----------");
			System.out.println("1.Caminar\n2.Correr\n3.Estudiar\n4.Salir");
			System.out.print("Ingresa una opcion:");
			op = txt.nextInt();
			int c = 0, f = 0, g = 0;
			switch (op) {
			case 1:
				a.Caminar(c, a);
				break;
			case 2:
				a.Correr(f, a);
				break;
			case 3:
				a.Estudiar(g, a);
				break;
			case 4:
				System.out.println("Usted a salido del programa");
				System.exit(0);
				break;
			default:
				System.out.println("Esta opcion no esta disponible");
				break;
			}

		} while (continuar4 == 0);
	}
	static public String get(Alumnos pel) {
		int op;
		String i = "no";
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("1.-Mostrar Metodos \n2.-Volver al menu \n3.-Salir");
		System.out.println("Ingresa una opcion:");
		op = txt.nextInt();
		switch (op) {
		case 1:
			menuI(pel);
			break;
		case 2:
			i = "si";
			break;
		case 3:
			i = "n";
			System.out.println("---Gracias por usar nuestro programa---");
			System.exit(0);
			break;
		}
		return i;
	}
}