package Super;

public class Caja {
	private double ancho;
	private double alto;
	private double largo;

	Caja(Caja ob) {
		ancho = ob.ancho;
		alto = ob.alto;
		largo = ob.largo;
	}

	Caja(double w, double h, double d) {
		ancho = w;
		alto = h;
		largo = d;
	}
	Caja() {
		ancho = -1; 
		alto = -1; 
		largo = -1;
		}
	Caja(double lon) {
		ancho = alto = largo = lon;
		}
	double volumen() {
		return ancho * alto * largo;
		}
	
}