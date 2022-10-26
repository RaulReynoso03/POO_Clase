package Proyecto_Final_Persona_2;

public class Administrativos extends Persona {

	private String funcion;

	public Administrativos(String nombre, String apellidop, String apellidom, double altura, int peso, int edad,
			String sexo, String funcion) {

		super(nombre, apellidop, apellidom, altura, peso, edad, sexo);
		this.funcion = funcion;
	}
	
	public String getDatosA() {
		return "\nNombre:" + nombre + "\nApellidos:" + apellidopaterno + " " + apellidomaterno + "\nAltura: " + altura
				+ "\nEdad:" + edad + "\nSexo:" + sexo + "\nPeso:" + peso + "\nFuncion:" + funcion;
	}
	public int documentacion(int documentacion, Administrativos b) {
		System.out.println("El administrativo esta documentando");
		return documentacion;
	}
	public int archivando(int archivando, Administrativos b) {
		System.out.println("El administrativo esta archivando");
		return archivando;
	}
	public int comiendo(int comiendo, Administrativos b) {
		System.out.println("El administrativo esta comiendo");
		return comiendo;
	}
}
