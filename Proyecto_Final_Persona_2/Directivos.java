package Proyecto_Final_Persona_2;

public class Directivos extends Persona {
	private double compensacion;
	private String cargo;

	public Directivos(String nombre, String apellidopaterno, String apellidomaterno, double altura, int peso, int edad,
			String sexo, int compensacion, String cargo) {
		super(nombre, apellidopaterno, apellidomaterno, altura, peso, edad, sexo);
		this.compensacion = compensacion;
		this.cargo = cargo;
	}

	@Override
	String getDatosA() {
		return "\nNombre:" + nombre + "\nApellidos:" + apellidopaterno + " " + apellidomaterno + "\nAltura: " + altura
				+ "\nEdad:" + edad + "\nSexo:" + sexo + "\nPeso:" + peso + "\nCompensacion:" + compensacion + "\nCargo:"
				+ cargo;
	}
}
