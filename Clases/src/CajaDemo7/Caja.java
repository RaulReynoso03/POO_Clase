/*#Autor:Reynoso Santana Raul.
#Fecha:12/09/2022
#Archivo:CajaDemo7.Java
#Descripcion:En este programa se establecera un constructor parametrizado 
de la caja para posteriormente retornarlos con el metodo volumen()
*/
package CajaDemo7;

public class Caja {
	

		double ancho;
		double alto;
		double largo;
	
		Caja(double w, double h, double d) {
		ancho = w;
		alto = h;
		largo = d;
		}

		double volumen() {
		return ancho * alto * largo;
		
		}

}