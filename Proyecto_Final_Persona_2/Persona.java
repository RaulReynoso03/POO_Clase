package Proyecto_Final_Persona_2;

public abstract class Persona {
	protected String nombre;
	protected String apellidopaterno;
	protected String apellidomaterno;
	protected double altura;
	protected int peso;
	protected int edad;
	protected String sexo;
	protected double NoControl;//

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidopaterno, String apellidomaterno, double altura, int peso, int edad,
			String sexo) {
		this.nombre = nombre;
		this.apellidopaterno = apellidopaterno;
		this.apellidomaterno = apellidomaterno;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.sexo = sexo;

	}

	abstract String getDatosA();
}
