/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:SOBRECARGA DEL METODO TEST.
#Descripcion: En este programa se declara la clase principal con el metodo main, como primer punto 
declarar un constructor (ob) que nos servira para poder llamar a todas las verciones de test que se 
declararon en la clase secundaria, con esto se declara una variable de tipo double que resivira el 
resultado de test para despues mostrarlo con un mensaje en pantalla y concatenando la variable 
(result)
*/

package Sobrecarga_del_metodo_test;

public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		double result;

		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Resultado de ob.test(123.25): " + result);

	}

}
