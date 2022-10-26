package Proyecto;

public class Docentes extends Persona{
	
	public Docentes() {
		super();
	}
	
	public Docentes (String nombre,String apellidopaterno, String
			apellidomaterno, int altura,int peso, int edad, String sexo, int sueldo, double numerodeempleado,String materia ) {
	}

	@Override
	public String getDatosA() {
		return "\nNombre:"+nombre+"\nApellidos:"+apellidop+" "+apellidom+"\nAltura: "+altura+
				"\nEdad:"+edad+"\nSexo:"+sexo+"\nNumero de empleado:"+numerodeempleado+"\nPeso:"+peso+"\nSueldo:"+sueldo+"\nMateria:"+materia;
	}	

}
