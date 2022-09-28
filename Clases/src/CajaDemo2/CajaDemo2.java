/*#Autor:Reynoso Santana Raul.
#Fecha:08/09/2022
#Archivo:CajaDemo2.Java
#Descripcion:En este programa se sacara el volumen de 2 cajas para esto declararemos dos objetos de
llamada miCaja1 y miCaja2.Con esto podemos llamar a los metodos y poder multiplicar los sus lados.
*/
package CajaDemo2;

public class CajaDemo2 {
	double alto;
	double ancho;
	double largo;
	public static void main(String args[]) {		
		CajaDemo2 miCaja1 = new CajaDemo2();
		CajaDemo2 miCaja2 =new CajaDemo2();		
		double vol;
		
		miCaja1.ancho =10;
		miCaja1.largo =20;
		miCaja1.alto =15;
		
		miCaja2.alto =3;
		miCaja2.ancho =6;
		miCaja2.largo =9;
		
		vol=miCaja1.ancho*miCaja1.largo*miCaja1.alto;
		System.out.println("El volumen es de:"+vol);
		
		System.out.println("\n");
		
		vol=miCaja2.ancho*miCaja2.largo*miCaja2.alto;
		System.out.println("El volumen es de:"+vol);		
	}	
}