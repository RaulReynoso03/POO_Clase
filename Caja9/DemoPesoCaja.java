package Caja;

public class DemoPesoCaja {

	public static void main(String[] args) {
		
		PesoCaja miCaja1=new PesoCaja(10, 20, 15, 34.4);
		PesoCaja miCaja2=new PesoCaja(2,3,4,0.076);
		double vol;
		
		vol=miCaja1.volumen();
		System.out.println("El volumen de mi caja: "+vol);
		System.out.println("El peso de mi caja:"+miCaja1.peso);
		System.out.println();
		
		vol=miCaja2.volumen();
		System.out.println("El voluem de mi caja dos:"+vol);
		System.out.println("El peso de mi caja 2 es:"+miCaja2.peso);
	}
	
	
}
