/*#Autor:Reynoso Santana Raul.
#Fecha:06/09/2022
#Archivo:PruebaBloque.Java
#Descripcion:En este programa, el cuerpo del ciclo for es un bloque y no una única sentencia. Por lo tanto,
cada vez que se realiza una iteración, se ejecutan las tres sentencias que están dentro del
bloque, tal y como muestra la salida generada por el programa
*/
package PruebaBloque;

public class PruebaBloque {
	
	public static void main(String[] args) {
		
		int x, y;
		
		y=20;
		
		for( x=0;x<10;x++){
			
			System.out.println("Esto es x:"+x);
			System.out.println("Esto y:"+y);
			
			y=y-2;
		}
	}
	
}
