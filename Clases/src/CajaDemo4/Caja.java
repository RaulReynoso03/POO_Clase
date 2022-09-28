/*#Autor:Reynoso Santana Raul.
#Fecha:11/09/2022
#Archivo:CajaDemo4.Java
#Descripcion:Se estableceran los valores que tendra la caja los cuales seran tipo double y 
se iniciara un metodo con este metodo se establecera que volumen va a devolver el valor de una
Caja mediante el metodo return; 
*/
package CajaDemo4;

public class Caja {
	
	double ancho;
	double alto;
	double largo;
	
	double volumen() {
		
		return ancho*alto*largo;
		
	}
}
