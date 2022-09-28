/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:OverloadCons2{} (creación de clón)
#Descripcion:En este programa en la clase Caja se definen primeramente las dimenciones que 
puede tener la caja siendo estas de tipo double, seguido de declaran 3 constructores, 1 donde 
se especifican las dimenciones, 2 un constructor que no especifican las dimenciones , 3 un 
constructor el cual crea crea un cubo y por ultimo se calcula y se devuelve el volumen con un
return. 
*/
package OverloadCons2_creacióndeclon;

public class Caja {
	double ancho;
	double alto;
	double largo;
	
	Caja(Caja ob) { 
	ancho = ob.ancho;
	alto = ob.alto;
	largo = ob.largo;
	}
	
	Caja(double w, double h, double d) {
	ancho = w;
	alto = h;
	largo = d;
	}
	
	Caja() {
	ancho = -1;
	alto = -1;
	largo = -1;
	}

	Caja(double lado) {
	ancho = alto = largo = lado;
	}

	double volumen() {
	return ancho * alto * largo;
	}
}

