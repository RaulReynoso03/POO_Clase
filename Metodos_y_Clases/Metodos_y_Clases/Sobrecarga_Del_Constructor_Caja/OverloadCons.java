/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:SOBRECARGA DEL CONSTRUCTOR CAJA.
#Descripcion: En este programa se declara la clase principal seguido de esto con los
constructores se crean varios objetos con paramatros dentro, seguido de esto se obtendra el 
volumen de cada caja para despues mostrarlo. 
*/
package Sobrecarga_Del_Constructor_Caja;

public class OverloadCons {
	public static void main(String[] args) {

		Caja miCaja1 = new Caja(10, 20, 15);
		Caja miCaja2 = new Caja();
		Caja miCubo = new Caja(7);
		double vol;

		vol = miCaja1.volumen();
		System.out.println("El volumen de miCaja1 es " + vol);

		vol = miCaja2.volumen();
		System.out.println("El volumen de miCaja2 es " + vol);

		vol = miCubo.volumen();
		System.out.println("El volumen de miCubo es " + vol);
	}

}
