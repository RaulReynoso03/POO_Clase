/*#Autor:Reynoso Santana Raul.
#Fecha:12/09/2022
#Archivo:CajaDemo7.Java
#Descripcion:En el metodo principal se ejecutara el programa asiendo uso del metodo return
volumen, creando los objetos tipo miCaja1 y miCaja2 asignandole los valores de ancho,largo y alto 
 
*/
package CajaDemo7;

public class CajaDemo7 {
	
	public static void main(String args[]) {
		Caja miCaja1 = new Caja(10, 20, 15);
		Caja miCaja2 = new Caja(3, 6, 9);
		double vol;
	
		vol = miCaja1.volumen();
		System.out.println("El volumen es "+ vol);
	
		vol = miCaja2.volumen();
		System.out.println("El volumen es "+ vol); 
		
	}
}