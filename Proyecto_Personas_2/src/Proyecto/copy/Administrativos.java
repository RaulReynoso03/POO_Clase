package Proyecto.copy;

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

}
