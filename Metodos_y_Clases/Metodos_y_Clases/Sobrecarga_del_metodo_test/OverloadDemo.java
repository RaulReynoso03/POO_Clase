/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:SOBRECARGA DEL METODO TEST.
#Descripcion: En este programa se hara la sobrecarga del metodo test para esto se declarara 
primer metodo sin parametros,seguido de esto se declara de nuevo el metodo test con un paramatro
entero,seguido de una sobrecarga con dos parametros de tipo enteros y por ultimo se sobrecargara 
con un metodo de tipo double que retornara la multiplicacion de a*a; 
*/
package Sobrecarga_del_metodo_test;

public class OverloadDemo {
	void test() {
		System.out.println("Sin parametros");
	}

	void test(int a) {
		System.out.println("a: " + a);
	}

	void test(int a, int b) {
		System.out.println("a y b: " + a + " " + b);
	}

	double test(double a) {
		System.out.println("a double: " + a);
		return a * a;
	}
}
