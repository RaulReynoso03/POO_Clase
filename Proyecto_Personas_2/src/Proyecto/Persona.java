package Proyecto;
public abstract class Persona {
	protected String nombre;
	protected String apellidop;
	protected String apellidom;
	protected double altura;
	protected int peso;
	protected int edad;
	protected String sexo;
	protected double Nocontrol;
	protected double sueldo;
	protected float  numerodeempleado;
	protected String materia;
	protected double compensacion;
	protected String cargo;
	protected String funcion;

	public Persona() {
		super();
	}
	
	public Persona(String nombre, double altura, String apellidop, String apellidom, int peso, int edad, String sexo, double Nocontrol, double sueldo, float numerodeempleado, String materia, double compensacion, String cargo) {
		this.nombre=nombre;
		this.apellidop=apellidop;
		this.apellidom=apellidom;
		this.altura=altura;
		this.peso=peso;
		this.edad=edad;
		this.sexo=sexo;
		this.Nocontrol=Nocontrol;
		this.sueldo=sueldo;
		this.numerodeempleado=numerodeempleado;
		this.materia=materia;
		this.compensacion=compensacion;
		this.cargo=cargo;
		this.funcion=funcion;
		
	}

	abstract String getDatosA();
}