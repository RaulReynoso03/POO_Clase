package Proyecto_Final_Persona_2;

public class Docentes extends Persona {

	private String materia;
	private double sueldo;//
	private double numerodeempleado;//

	public Docentes() {
		super();
	}

	public Docentes(String nombre, String apellidopaterno, String apellidomaterno, int altura, int peso, int edad,
			String sexo, int sueldo, double numerodeempleado, String materia) {
		super(nombre, apellidopaterno, apellidomaterno, altura, peso, edad, sexo);
		this.materia = materia;
		this.sueldo = sueldo;
		this.numerodeempleado = numerodeempleado;
	}

	@Override
	String getDatosA() {

		return "\nNombre:" + nombre + "\nApellidos:" + apellidopaterno + " " + apellidomaterno + "\nAltura: " + altura
				+ "\nEdad:" + edad + "\nSexo:" + sexo + "\nNumero de empleado:" + numerodeempleado + "\nPeso:" + peso
				+ "\nSueldo:" + sueldo + "\nMateria:" + materia;
	}
	public int Dictar(int dictar, Docentes a2) {
		System.out.println("El maestro esta dictando");
		return dictar;
	}

	public int Calificar(int calificar, Docentes a2) {
		System.out.println("El maestro esta calificando");
		return calificar;
	}

	public int Regañar(int Regañar, Docentes a2) {
		System.out.println("El maestro esta regaÃ±ando a su grupo");
		return Regañar;
	}
}
