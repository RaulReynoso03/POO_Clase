/*#Autor:Reynoso Santana Raul.
#Fecha:12/09/2022
#Archivo:CajaDemo6.Java
#Descripcion:En este programa se establecera un constructor en el cual se deberan indicar
las dimenciones de la caja para posteriormente retornarlos con el metodo volumen()
*/
package CajaDemo6;

public class Caja {
	double ancho;
	double alto;
	double largo;
	
	Caja(){
		System.out.println("Constructor de la caja");
		ancho=10;
		alto= 10;
		largo=10;
		}
		double volumen() {
			return ancho*alto*largo;
}}