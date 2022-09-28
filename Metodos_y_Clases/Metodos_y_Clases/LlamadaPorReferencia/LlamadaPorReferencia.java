/*#Autor:Reynoso Santana Raul.
#Fecha:28/09/2022
#Archivo:Se crea la clase pincipal en la cual se creara un constructor con valors (15,20)
con estas variables se mostraran antes de la llamada del metodo ob despues se llamara al 
metodo ob y se mostrara en pantalla como se a modificado las variables;

*/package LlamadaPorReferencia;

public class LlamadaPorReferencia {
	public static void main(String args[]) {
		Test ob = new Test(15, 20);
		System.out.println("ob.a y ob.b antes de la llamada: " + ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a y ob.b despues de la llamada: " + ob.a + " " + ob.b);
	}
}
