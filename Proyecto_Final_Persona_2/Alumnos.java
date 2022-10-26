package Proyecto_Final_Persona_2;

public class Alumnos extends Persona {
	protected double NoControl;//

	public Alumnos() {
		super();
	}

	public Alumnos(String nombre, String apellidop, String apellidom, double altura, int edad, int peso, String sexo,
			float NoControl) {
		super(nombre, apellidop, apellidom, altura, edad, peso, sexo);
		this.NoControl = NoControl;
	}

	public String getDatosA() {
		System.out.println("Hola" + nombre);
		return "\nNombre:" + nombre + "\nApellidos:" + apellidopaterno + " " + apellidomaterno + "\nAltura: " + altura
				+ "\nEdad:" + edad + "\nSexo:" + sexo + "\nNumero de control:" + NoControl + "\nPeso:" + peso;
	}

	public int Caminar(int caminar, Alumnos a) {
		System.out.println("El alumno esta caminado");
		return caminar;
	}

	public int Correr(int correr, Alumnos a) {
		System.out.println("El alumno esta corriendo");
		return correr;
	}

	public int Estudiar(int estudiar, Alumnos a) {
		System.out.println("El alumno esta estudiando");
		return estudiar;
	}

}