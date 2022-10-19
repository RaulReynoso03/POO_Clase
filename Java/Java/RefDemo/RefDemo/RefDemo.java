package RefDemo;

public class RefDemo {
	public static void main(String args[]) {
		pesoCaja pesoCaja = new pesoCaja (3,5,7,8.98);
		 Caja1 cajaSencilla = new Caja1();
		 double vol;
		vol = pesoCaja.volumen();
		System.out.println("El volumen de pesoCaja es " + vol);
		System.out.println("El peso de pesoCaja es " + pesoCaja.peso);
		System.out.println();
	
		cajaSencilla = pesoCaja;
		vol = cajaSencilla.volumen(); 
		System.out.println("El volumen de cajaSencilla es " + vol);

		}
	

}
