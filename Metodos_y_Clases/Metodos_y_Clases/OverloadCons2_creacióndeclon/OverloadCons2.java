/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:OverloadCons2{} (creación de clón)
#Descripcion:En este programa se declara la clase principal seguido de esto con los
constructores se crean varios objetos con paramatros dentro, con estos objetos creados se clonaran con 
mismos paramatros de los objetos principales  , seguido de esto se obtendra el 
volumen de cada caja para despues mostrarlo de los objetos principales y los clonados . 
*/
package OverloadCons2_creacióndeclon;

public class OverloadCons2 {

	public static void main(String[] args) {
		Caja miCaja1 = new Caja(10, 20, 15);
		Caja miCaja1clon = new Caja(10, 20, 15);//Clonar miCaja1
		Caja miCaja2 = new Caja();
		Caja miCaja2clon = new Caja();//Clonar miCaja2
		Caja miCubo = new Caja(7);
		Caja miCuboclon = new Caja(7);//Clonar micubo
		Caja miClon = new Caja(miCaja1);
		double vol;

		vol = miCaja1.volumen();
		System.out.println("El volumen de miCaja1 es " + vol);
		vol = miCaja1clon.volumen();
		System.out.println("El volumen de miCaja1clon es " + vol);

		vol = miCaja2.volumen();
		System.out.println("El volumen de miCaja2 es " + vol);
		vol = miCaja2clon.volumen();
		System.out.println("El volumen de miCaja2clon es " + vol);

		vol = miCubo.volumen();
		System.out.println("El volumen de miCubo es " + vol);
		vol = miCuboclon.volumen();
		System.out.println("El volumen de miCubo es " + vol);

		vol = miClon.volumen();
		System.out.println("El volumen de miClon es " + vol);

	}

}
