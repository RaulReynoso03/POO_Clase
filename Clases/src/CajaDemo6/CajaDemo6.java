/*#Autor:Reynoso Santana Raul.
#Fecha:12/09/2022
#Archivo:CajaDemo6.Java
#Descripcion:En el metodo principal se ejecutara el programa asiendo uso del metodo return
volumen, creando los objetos tipo miCaja1 y miCaja2 con los valores del constructor Caja de la
clase Caja
*/
package CajaDemo6;

public class CajaDemo6 {

		public static void main(String args[]) {
			Caja miCaja1 = new Caja();
			Caja miCaja2 = new Caja();
			double vol;

			vol = miCaja1.volumen();
			System.out.println("El volumen es "+ vol);
		
			vol = miCaja2.volumen();
			System.out.println("El volumen es "+ vol);

	}

}