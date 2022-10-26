package Proyecto;

public class Alumnos extends Persona {

	public Alumnos() {
		super();
	}
	
	public Alumnos(String nombre, String apellidop, String apellidom, double altura, int edad, int peso, String sexo, int Nocontrol) {
		super();	}

	public String getDatosA() {
		System.out.println("Hola"+nombre);
		return "\nNombre:" + nombre + "\nApellidos:" + apellidop + " " + apellidom + "\nAltura: " + altura
				+ "\nEdad:" + edad + "\nSexo:" + sexo + "\nNumero de control:" + Nocontrol + "\nPeso:" + peso;
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