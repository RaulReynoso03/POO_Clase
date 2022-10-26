package Beta_P;

public abstract class Persona {
	protected String nombre;
	protected String apellidopaterno;
	protected String apellidomaterno;
	protected double altura;
	protected int peso;
	protected int edad;
	protected String sexo;
	protected double numerodecontrol;
	protected double sueldo;
	protected float  numerodeempleado;
	protected String materia;
	protected double compensacion;
	protected String cargo;
	
	
	public String getNombre() {
		return nombre+altura;
	}public String getApellidoP() {
		return apellidopaterno;
	}public String getApellidoM() {
		return apellidomaterno;
	}public double getAltura() {
		return altura;
	}public int getPeso() {
		return peso;
	}public int getEdad() {
		return edad;
	}public String getSexo() {
		return sexo;
	}public double getNoControl() {
		return numerodecontrol;
	}public double getSueldo() {
		return sueldo;
	}public float getNoEmpleado() {
		return numerodeempleado;	
	}public String getMateria() {
		return materia;
	}public double getCompensacion() {
		return compensacion;
	}public String getCargo() {
		return cargo;
	}
	
	public String getDatosA() {
		return nombre+apellidopaterno+apellidomaterno+altura+edad+sexo+numerodecontrol;
	}
}
