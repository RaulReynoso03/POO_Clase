/*#Autor:Reynoso Santana Raul.
#Fecha:11/09/2022
#Archivo:CajaDemo5.Java
#Descripcion:En este programa se creara la clase principal donde de obtendra el volumen de
una caja mediante el metodo return establecido en la clase Caja, y con los valores establecidos con el metodo setDim() podremos 
saber el volumen de la Caja 
*/

package CajaDemo5;

public class CajaDemo5 {

	public static void main(String[] args) {
		Caja miCaja1 = new Caja();
		Caja miCaja2 = new Caja();
		double vol;
		
		miCaja1.setDim(10,20,15);
		miCaja2.setDim(3,6,9);
		
		vol = miCaja1.volumen();
		System.out.println("El volumen es "+ vol);
		
		vol = miCaja2.volumen();
		System.out.println("El volumen es "+ vol);

	}

}
