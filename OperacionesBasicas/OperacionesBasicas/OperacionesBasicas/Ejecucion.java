/*#Autor:Reynoso Santana Raul.
#Fecha:12/09/2022
#Archivo:Operaciones Basicas.Java
#Descripcion:Este programa sera el principal en el cual se ingresaran los datos con la clase Scanner como punto de inicio,
despues de esto de declararan las varibles que nos serviran para todo el programa, con ayuda de los System.out.printl se mostrara 
un menu seguido del menu se pedira que se ingrese una opcion con Scanner, haciendo uso de la seleccion swith y de la variable que
se guardo en opcion se desplegara el menu de suma,resta,multiplicacion,divicion y salir dependiendo de que caso se eliga
(Un ejemplo de esto es el caso 1:"Suma" en el cual se pedira que se ingresen 2 numeros y con ayuda de la clase OPeracionesBasicas 
se calcularael resultado devolviendolo a la variable resultado)para cerrar el programa tendremos que ingresar el numero 5 ya que al
usar el defaul en los casos se finalizara el programa y para que el programa siga continuando y devolviendo al menu deberia cambiar la
variable continuar lo cual es imposible de modificar;
*/
package OperacionesBasicas;

import java.util.Scanner;

public class Ejecucion {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		new OperacionesBasicas();

		int opcion;
		double numero1;
		double numero2;
	     int continuar = 0;
		@SuppressWarnings("unused")
		boolean salir = true;
		do {
			
			System.out.println("**CALCULARODA**");
			System.out.println("1.Sumar");//
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Divir");
			System.out.println("5.Salir");
			System.out.print("Ingresa la opcion que quieres hacer:");
			opcion=teclado.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingresa  2 numeros:");
				numero1=teclado.nextDouble();
				numero2=teclado.nextDouble();
				
				double resultadoSsuma=OperacionesBasicas.sumar(numero1, numero2);
				System.out.println("");
				System.out.println("El resultado de la suma es:"+resultadoSsuma);	
				break;
				
			case 2:
				System.out.println("Ingresa  2 numeros:");
				numero1=teclado.nextDouble();
				numero2=teclado.nextDouble();
				
				
				double resultadoResta=OperacionesBasicas.restar(numero1, numero2);
				System.out.println("");
				System.out.println("El resultado de la resta es: "+resultadoResta);
				break;
				
			case 3:
				System.out.println("Ingresa  2 numeros:");
				numero1=teclado.nextDouble();
				numero2=teclado.nextDouble();
				
				double resultadoMultiplicacion=OperacionesBasicas.multiplicar(numero1, numero2);
				System.out.println("");//
				System.out.println("El resultado de la multiplicacion es: "+resultadoMultiplicacion);
				break;
				
			case 4:
				System.out.println("Ingresa  2 numeros:");
				numero1=teclado.nextDouble();
				numero2=teclado.nextDouble();
				
				double resultadoDividir=OperacionesBasicas.divisor(numero1, numero2);
				System.out.println("");
				System.out.println("El resultado de la multiplicacion es: "+resultadoDividir);
				break;
			case 5:
                  salir = false;
                  continuar = 1;
                   System.out.println(" ");
                   System.out.println("USTED A SALIDO DEL PROGRAMA :D ");
                   break;
				
			default:
				System.out.println("Esta opcion no esta disponible :(");
				break;
			}
			

		}while (continuar==0);

}
	}