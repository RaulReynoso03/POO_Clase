/*#Autor:Reynoso Santana Raul.
#Fecha:07/09/2022
#Archivo:CajaDemo.Java
#Descripcion:En este programa se sacara el volumen de una caja para esto se declarara un metodo llamado 
CajaDemo y con esto declararemos un objeto llamado miCaja.
*/


package CajaDemo;

public class CajaDemo {
	
	double ancho;
	double alto;
	double largo;
	
	static class Caja{
	public static void main(String args[]) {
		
		CajaDemo miCaja = new CajaDemo();
		double vol;
		
		miCaja.ancho=10;
		miCaja.largo=15;
		miCaja.alto=20;
		
		vol=miCaja.ancho*miCaja.largo*miCaja.alto;
		
		System.out.println("El volumen de la caja es:"+vol);

	}
	
	}

}
