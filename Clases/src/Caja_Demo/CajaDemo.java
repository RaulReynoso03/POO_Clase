/*#Autor:Reynoso Santana Raul.
#Fecha:07/09/2022
#Archivo:CajaDemo.Java
#Descripcion:En este programa se declara la clase principal la cual con el apoyo
de la clase Caja se ejecutara la operacion para saber el volumen del objeto 
 miCaja.
*/

package Caja_Demo;

public class CajaDemo {

	public static void main(String[] args) {
		
		Caja miCaja = new Caja();
		double vol;
		
		miCaja.ancho=10;
		miCaja.largo=15;
		miCaja.alto=20;
		
		vol=miCaja.ancho*miCaja.largo*miCaja.alto;
		
		System.out.println("El volumen de la caja es:"+vol);

	}
	
}