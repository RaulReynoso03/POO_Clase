package RefDemo;

public class Caja1 {
	double ancho;
	double alto;
	double largo;
	// Construcción de un duplicado de un objeto.
	Caja1(Caja1 ob) { // Paso del objeto al constructor
	ancho = ob.ancho;
	alto = ob.alto;
	largo = ob.largo;
	}
	// Constructor que se utiliza cuando se especifican todas las dimensiones.
	Caja1(double w, double h, double d) {
	ancho = w;
	alto = h;
	largo = d;
	}
	// Constructor que se utiliza cuando no se especifican dimensiones.
	Caja1() {
	ancho = -1;
	alto = -1;
	largo = -1;
	}
	// Constructor que se utiliza para crear un cubo.
	Caja1(double lon) {
	ancho = alto = largo = lon;
	}
	double volumen() {
		return ancho * alto * largo;
		}
}
