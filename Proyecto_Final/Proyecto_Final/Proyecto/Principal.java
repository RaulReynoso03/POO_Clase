package Proyecto;

import java.util.Scanner;

public class Principal {

	private static Scanner scan;
	@SuppressWarnings("unused")
	private static boolean salir;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int continuar = 0;
		salir = true;
		do {
			System.out.println("***MENU***");
			System.out.println("1.Alumnos");
			System.out.println("2.Docentes");
			System.out.println("3.Directivos");
			System.out.println("4.Administrativos");
			System.out.println("5.Salir");
			System.out.print("Ingresa una opcion:");
			int opción = scan.nextInt();

			switch (opción) {
			case 1:
				System.out.println("");
				System.out.println("**MENU DE ALUMNOS**");
				System.out.println("1.Raul");
				System.out.println("2.Edgar");
				System.out.println("3.Uriel");
				System.out.println("4.Ingresar alumno");
				System.out.println("5.Salir");
				System.out.print("Ingresa una opcion:");
				int opciona = scan.nextInt();

				switch (opciona) {
				case 1:
					Alumnos persona1 = new Alumnos("Raul", "Reynoso", "Santana", 'H', 183, 17,
							"Raul esta programando su proyecto", 1028972, "Programacion", "Comer", "Correr", "Dormir",
							"Escribir");
					System.out.println(persona1.Nombre(persona1));
					System.out.println(persona1.sexo(persona1));
					System.out.println(persona1.edad(persona1));
					System.out.println(persona1.estatura(persona1));
					System.out.println(persona1.carrera(persona1));
					System.out.println(persona1.nocontrol(persona1));
					System.out.println(persona1.accion(persona1));
					System.out.println(persona1.Correr(persona1));
					System.out.println(persona1.Comer(persona1));
					System.out.println(persona1.Dormir(persona1));
					System.out.println(persona1.Escribir(persona1));
					System.out.println("\n");
					break;
				case 2:
					Alumnos persona2 = new Alumnos("Edgar", "Varela", "Mejia", 'H', 16, 187,
							"Edgar esta preguntando sobre la tarea", 65764654, "Programacion", "Comer", "Correr",
							"Dormir", "Escribir");
					System.out.println(persona2.Nombre(persona2));
					System.out.println(persona2.sexo(persona2));
					System.out.println(persona2.edad(persona2));
					System.out.println(persona2.estatura(persona2));
					System.out.println(persona2.carrera(persona2));
					System.out.println(persona2.nocontrol(persona2));
					System.out.println(persona2.accion(persona2));
					System.out.println(persona2.Correr(persona2));
					System.out.println(persona2.Comer(persona2));
					System.out.println(persona2.Dormir(persona2));
					System.out.println(persona2.Escribir(persona2));
					System.out.println("\n");
					break;
				case 3:
					Alumnos persona3 = new Alumnos("Uriel", "Martinez", "Zamora", 'H', 16, 158, "Uriel esta dibujando",
							4534272, "Programacion", "Comer", "Dormir", "Escribir", "Correr");
					System.out.println(persona3.Nombre(persona3));
					System.out.println(persona3.sexo(persona3));
					System.out.println(persona3.edad(persona3));
					System.out.println(persona3.estatura(persona3));
					System.out.println(persona3.carrera(persona3));
					System.out.println(persona3.nocontrol(persona3));
					System.out.println(persona3.accion(persona3));
					System.out.println(persona3.Correr(persona3));
					System.out.println(persona3.Comer(persona3));
					System.out.println(persona3.Dormir(persona3));
					System.out.println(persona3.Escribir(persona3));
					System.out.println("\n");
					break;
				case 4:

					System.out.println("Ingresa un nombre:");
					String nombre = scan.next();
					System.out.println("Ingresa el apellido materno:");
					String apellidoMaterno = scan.next();
					System.out.println("Ingresa el apellido paterno:");
					String apellidoPaterno = scan.next();
					System.out.println("Ingresa el sexo del alumno:");
					String sexo = scan.next();
					System.out.println("Ingresa la edad del alumno:");
					String edad = scan.next();
					System.out.println("Ingresa que actividad esta haciendo:");
					String accion = scan.next();
					System.out.println("Ingresa su numero de control:");
					String nocontrol = scan.next();
					System.out.println("Ingresa la carrera del alumno:");
					String carrera = scan.next();

					System.out.println("**Mostrar datos del alumno nuevo**");
					System.out.println("Nombre:" + nombre + " " + apellidoMaterno + " " + apellidoPaterno);
					System.out.println("Sexo:" + sexo);
					System.out.println("Edad:" + edad);
					System.out.println("Accion:" + accion);
					System.out.println("Numero de control:" + nocontrol);
					System.out.println("Carrera:" + carrera);
					System.out.println("\n");
					break;

				case 5:
					break;
				default:
					System.out.println("Esta opcion no esta disponible");
					break;
				}
				break;
			case 2:
				System.out.println(" ");
				System.out.println("**MENU DE DOCENTES**");
				System.out.println("1.Profesor.Isacc");
				System.out.println("2.Profesor.Ulises");
				System.out.println("3.Profesora.Zapien");
				System.out.println("4.Ingresar un docente");
				System.out.println("5.Calcelar");
				System.out.println("Ingresa una opcion:");
				int opciond = scan.nextInt();
				switch (opciond) {

				case 1:
					Docentes docente1 = new Docentes("Isacc", "Granados", "Herrara", 'H', 40,
							"El ingeniero isacc esta aplicando su examen a los alumnos de primero", 695686, 4,
							"Ingeniero en programacion", 6897, "Reprobar", "Domir", "Enseñar");
					System.out.println(docente1.nombre(docente1));
					System.out.println(docente1.edad(docente1));
					System.out.println(docente1.sexo(docente1));
					System.out.println(docente1.notrabajo(docente1));
					System.out.println(docente1.accion(docente1));
					System.out.println(docente1.profecion(docente1));
					System.out.println(docente1.clases(docente1));
					System.out.println(docente1.compensacion(docente1));
					System.out.println(docente1.a1(docente1));
					System.out.println(docente1.a2(docente1));
					System.out.println(docente1.s3(docente1));
					break;
				case 2:
					Docentes docente2 = new Docentes("Rene", "Jarillo", "Silva", 'H', 31,
							"El profesor esta dando instrucciones para su clase", 463422, 3, "Maestro de Ingles", 1344,
							"Correr", "Hablar", "Escribir");
					System.out.println(docente2.nombre(docente2));
					System.out.println(docente2.edad(docente2));
					System.out.println(docente2.sexo(docente2));
					System.out.println(docente2.notrabajo(docente2));
					System.out.println(docente2.accion(docente2));
					System.out.println(docente2.profecion(docente2));
					System.out.println(docente2.clases(docente2));
					System.out.println(docente2.compensacion(docente2));
					System.out.println(docente2.a1(docente2));
					System.out.println(docente2.a2(docente2));
					System.out.println(docente2.s3(docente2));
					break;
				case 3:
					Docentes docente3 = new Docentes("Nombre:Margarita", "Zapien", "Tapia", 'M', 39,
							"La Maestra es revisando el proyecto final", 6876576, 6, "Ingerieria en programacion", 6986,
							"Enseñar", "Escribir", "Regañar");
					System.out.println(docente3.nombre(docente3));
					System.out.println(docente3.edad(docente3));
					System.out.println(docente3.sexo(docente3));
					System.out.println(docente3.notrabajo(docente3));
					System.out.println(docente3.accion(docente3));
					System.out.println(docente3.profecion(docente3));
					System.out.println(docente3.clases(docente3));
					System.out.println(docente3.compensacion(docente3));
					System.out.println(docente3.a1(docente3));
					System.out.println(docente3.a2(docente3));
					System.out.println(docente3.s3(docente3));
					break;
				case 4:

					System.out.println("Ingresar un nuevo docente");
					System.out.print("Ingresa un nombre:");
					String nombred = scan.next();
					System.out.print("Ingresa el apellido materno:");
					String apellidopaternod = scan.next();
					System.out.print("Ingresa el apellido paterno:");
					String apellidomaternod = scan.next();
					System.out.print("Ingresa el sexo del docente:");
					String sexo = scan.next();
					System.out.print("Ingresa la edad del docente:");
					String edad = scan.next();
					System.out.print("Ingresa que actividad esta haciendo:");
					String accion = scan.next();
					System.out.print("Ingresa la profeccion del docente:");
					String profeccion = scan.next();
					System.out.print("Ingresa el numero de clases que tiene:");
					String clases = scan.next();
					System.out.println("Ingresa la compensacion que resibe:");
					String compensacion = scan.next();

					System.out.println("**Mostrar datos del alumno nuevo**");
					System.out.println("Nombre:" + nombred + " " + apellidopaternod + " " + apellidomaternod);
					System.out.println("Sexo:" + sexo);
					System.out.println("Edad:" + edad);
					System.out.println("Accion:" + accion);
					System.out.println("Numero de control:" + profeccion);
					System.out.println("Carrera:" + clases);
					System.out.println("Compensacion" + compensacion);
					System.out.println("\n");

					break;

				case 5:
					break;

				default:
					System.out.println("Esta opcion no esta disponible");
					break;

				}

				break;
			case 3:
				System.out.println(" ");
				System.out.println("MENU DE DIRECTIVOS");
				System.out.println("1.Director");
				System.out.println("2.Calcelar");
				System.out.print("Ingresa una opcion:");
				int opciondi = scan.nextInt();
				switch (opciondi) {

				case 1:
					Directivos director = new Directivos("Juan", "Zenil", "Chavez", 'h', 65, 453643, "Director", 10000,
							2020, 2030, "El director esta organizando una junta con los maestros", "Expulsar",
							"Dar avisos", "Dirigir");
					System.out.println(director.nombre(director));
					System.out.println(director.sexo(director));
					System.out.println(director.edad(director));
					System.out.println(director.notrabajo(director));
					System.out.println(director.cargo(director));
					System.out.println(director.compensacion(director));
					System.out.println(director.fechai(director));
					System.out.println(director.fechaf(director));
					System.out.println(director.Accion(director));
					System.out.println(director.a1(director));
					System.out.println(director.a2(director));
					System.out.println(director.a3(director));
					break;
				default:
					System.out.println("Esta opcion no esta disponible");
					break;
				}
				break;

			case 4:
				System.out.println(" ");
				System.out.println("MENU DE ADMINISTRATIVOS");
				System.out.println("1.Perfecto_Pol");
				System.out.println("2.Inocencia Espinoza Lopez");
				System.out.println("3.Orientadora.Angelica");
				System.out.println("4.Ingresar un nuevo administrador");
				System.out.println("5.Calcelar");
				System.out.print("Ingresa una opcion:");
				int opcionad = scan.nextInt();

				switch (opcionad) {

				case 1:
					Administrativos pol = new Administrativos("Pol", "Perez", "Gonzales", 'h', 34,
							"Pol esta pasando lista en los salones", 87678675, 7, "Poner reportes", "Regañar",
							"Dar informes");
					System.out.println(pol.nombre1(pol));
					System.out.println(pol.sexo(pol));
					System.out.println(pol.edad(pol));
					System.out.println(pol.accion(pol));
					System.out.println(pol.notrabajo(pol));
					System.out.println(pol.htrabajo(pol));
					System.out.println(pol.a1(pol));
					System.out.println(pol.a2(pol));
					System.out.println(pol.a3(pol));

					break;
				case 2:
					Administrativos sub = new Administrativos("Inocencia", "Espinoza", "Lopez", 'm', 27,
							"La subdirectora esta arreglando unos papeles", 75764654, 9, "Dar avisos", "Dar reportes",
							"Regañar");
					System.out.println(sub.nombre1(sub));
					System.out.println(sub.sexo(sub));
					System.out.println(sub.edad(sub));
					System.out.println(sub.accion(sub));
					System.out.println(sub.notrabajo(sub));
					System.out.println(sub.htrabajo(sub));
					System.out.println(sub.a1(sub));
					System.out.println(sub.a2(sub));
					System.out.println(sub.a3(sub));
					break;
				case 3:
					Administrativos ori = new Administrativos("Angelica", "Espinoza", "Lopez", 'm', 47,
							"Esta hablando con los padres de familia", 32525, 9, "Reportar", "Dar avisos", "Regañar");
					System.out.println(ori.nombre1(ori));
					System.out.println(ori.sexo(ori));
					System.out.println(ori.edad(ori));
					System.out.println(ori.accion(ori));
					System.out.println(ori.notrabajo(ori));
					System.out.println(ori.htrabajo(ori));
					System.out.println(ori.a1(ori));
					System.out.println(ori.a2(ori));
					System.out.println(ori.a3(ori));
					break;

				case 4:
					System.out.println("Ingresar un nuevo administrativo");
					System.out.print("Ingresa un nombre:");
					String nombred = scan.next();
					System.out.print("Ingresa el apellido materno:");
					String apellidopaternod = scan.next();
					System.out.print("Ingresa el apellido paterno:");
					String apellidomaternod = scan.next();
					System.out.print("Ingresa el sexo del docente:");
					String sexo = scan.next();
					System.out.print("Ingresa la edad del docente:");
					String edad = scan.next();
					System.out.print("Ingresa que actividad esta haciendo:");
					String accion = scan.next();
					System.out.print("Ingresa el numero de trabajo:");
					String notrabajo = scan.next();
					System.out.print("Ingresa las horas que trabaja:");
					String horas = scan.next();

					String noma = Administrativos.nuevoAdministrador(nombred, apellidomaternod, apellidomaternod, sexo,
							edad, accion, notrabajo, horas);
					System.out.println("**Mostrar datos del administrador nuevo**");
					System.out.println("Nombre:" + noma + " " + apellidopaternod + " " + apellidomaternod);
					System.out.println("Sexo:" + sexo);
					System.out.println("Edad:" + edad);
					System.out.println("Accion:" + accion);
					System.out.println("Numero de trabajo:" + notrabajo);
					System.out.println("horas de trabajo:" + horas);
					System.out.println("\n");
					break;

				case 5:
					break;
				default:
					System.out.println("Esta opcion no existe :D");
					break;
				}

				break;
			case 5:
				salir = false;
				continuar = 1;
				System.out.println(" ");
				System.out.println("USTED A SALIDO DEL PROGRAMA :D ");
				break;

			}
		} while (continuar == 0);

	}
}