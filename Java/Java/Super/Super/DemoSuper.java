package Super;

public class DemoSuper {
	public static void main(String args[]) {
		PesoCaja miCaja1 = new PesoCaja(10, 20, 15, 34.3);
		PesoCaja miCaja2 = new PesoCaja(2, 3, 4, 0.076);
		PesoCaja miCaja3 = new PesoCaja(); // Por defecto.
		PesoCaja miCubo = new PesoCaja(3, 2);
		PesoCaja miDuplicado = new PesoCaja(miCaja1);
		double vol;
		vol = miCaja1.volumen();
		System.out.println("El volumen de miCaja1 es " + vol);
		System.out.println("El peso de miCaja1 es " + miCaja1.peso);
		System.out.println();
		vol = miCaja2.volumen();
		System.out.println("El volumen de miCaja2 es " + vol);
		System.out.println("El peso de miCaja2 es " + miCaja2.peso);
		System.out.println();
		vol = miCaja3.volumen();
		System.out.println("El volumen de miCaja3 es " + vol);
		System.out.println("El peso de miCaja3 es " + miCaja3.peso);
		System.out.println();
		vol = miDuplicado.volumen();
		System.out.println("El volumen de miDuplicado es " + vol);
		System.out.println("El peso de miDuplicado es " + miDuplicado.peso);
		System.out.println();
		vol = miCubo.volumen();
		System.out.println("El volumen de miCubo es " + vol);
		System.out.println("El peso de miCubo es " + miCubo.peso);
		System.out.println();
	}
}
