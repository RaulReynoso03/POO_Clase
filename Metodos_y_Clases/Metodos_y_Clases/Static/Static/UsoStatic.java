package Static;

public class UsoStatic {
	
	static int a = 3;
	static int b;
	static void metodo(int x) {
	 System.out.println("x = " + x);
	 System.out.println("a = " + a);
	 System.out.println("b = " + b);
	}
	static {
	 System.out.println("Inicializaci�n del bloque Static.");
	 b = a * 4;
	}
	public static void main(String args[]) {
	 metodo(42);
	}
}
