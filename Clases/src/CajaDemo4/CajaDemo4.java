/*#Autor:Reynoso Santana Raul.
#Fecha:11/09/2022
#Archivo:CajaDemo4.Java
#Descripcion:En este programa se creara la clase principal donde de obtendra el volumen de
una caja mediante el metodo return establecido en la clase Caja 
*/
package CajaDemo4;

public class CajaDemo4 {
	
	public static void main(String[] args) {
	
	Caja miCaja1 = new Caja();
	Caja miCaja2 = new Caja();
	double vol;
	
	miCaja1.ancho = 10;
	miCaja1.alto = 20;
	miCaja1.largo = 15;
	
	miCaja2.ancho = 3;
	miCaja2.alto = 6;
	miCaja2.largo = 9;
	
	vol = miCaja1.volumen();
	System.out.println("El volumen es "+ vol);
	
	vol = miCaja2.volumen();
	System.out.println("El volumen es "+ vol); 
	
	}
	}
