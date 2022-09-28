/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:LlamadaPorValor {} (Los tipos simples se pasan por valor).
#Descripcion: Se creara metodo y porterior mente se declaran variables de tipo entero donde se
les asigna un valor para despues mostrar esos valores en pantalla.
*/

package LlamadaPorValorLostipossimplessepasanporvalor;

public class LlamadaPorValor {
	public static void main(String args[]) {
		Test ob = new Test();
		int a = 15, b = 20;

		System.out.println("a y b antes de la llamada: " + a + " " + b);
		ob.meth(a, b);
		System.out.println("a y b después de la llamada: " + a + " " + b);
	}
}
