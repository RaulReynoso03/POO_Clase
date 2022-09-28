/*#Autor:Reynoso Santana Raul.
#Fecha:08/09/2022
#Archivo:CajaDemo3.Java
#Descripcion:En este programa se calcula el volumen de 2 cajas para esto se 
incluye un metodo. 
*/
package CajaDemo3;
public class CajaDemo3 {
	double ancho;
	double alto;
	double largo;
	
	void volumen() {
		System.out.println("El volumen es de");
		System.out.println(ancho*largo*alto);	
	}
	public static void main(String[] args) {
		
		CajaDemo3 miCaja1 = new CajaDemo3();
		CajaDemo3 miCaja2 = new CajaDemo3();
		
		miCaja1.ancho =10;
		miCaja1.alto =20;
		miCaja1.largo =15;
		
		miCaja2.ancho =3;
		miCaja2.alto =6;
		miCaja2.largo =9;
		
		miCaja1.volumen();
		miCaja2.volumen();		
	}
}