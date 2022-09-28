/*#Autor:Reynoso Santana Raul.
#Fecha:06/09/2022
#Archivo:EjemploIF.Java
#Descripcion:El programa es una sentencia if el cual imprimira direfentes cadenas de texto de
			dependiendo si la condicion se cumple,exceptuando la ultima.				
*/

package EjemploIF;

public class EjemploIF {

	public static void main(String[] args) {
	
		int x,y;
		x=10;
		y=20;
		
		if (x<y)System.out.println("x es menor que y");
		x=x*2;
		if (x==y)System.out.println("x ahora igual que y");
		x=x*2;
		if(x>y)System.out.println("x es ahora mayor que y");
		
		if(x==y)System.out.println("esto no se vera");		
		
	}

}
