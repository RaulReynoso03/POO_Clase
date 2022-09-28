/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:LlamadaPorReferencia {} (Los objetos se pasan por referencia)
#Descripcion: Se declaran 2 variables de tipo entero seguido de esto se crea un metodo el cual
tiene por paramatros 2 variables de tipo int, despues se crea otro metodo el cual afectara
a las variables a y b;
*/
package LlamadaPorReferencia;

public class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}
}
