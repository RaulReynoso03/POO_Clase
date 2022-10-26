package persona;
public class administrativos extends abstracta{
	public administrativos (String nombre,String apellidopaterno, String
			apellidomaterno, String altura,String peso, String edad, String sexo, String funcion ) {
		this.nombre=nombre;
		this.apellidopaterno=apellidopaterno;
		this.apellidomaterno=apellidomaterno;
		this.altura=altura;
		this.peso=peso;
		this.edad=edad;
		this.sexo=sexo;
		this.funcion=funcion;
	}
	public administrativos() {
		super();
	}
	public static String administrativoa1(String nombre,String apellidopaterno, String apellidomaterno, String altura,String peso, String edad, String sexo, String funcion ) {
		String datosc=nombre;
		datosc=apellidopaterno;
		datosc=apellidomaterno;
		datosc=altura;
		datosc=peso;
		datosc=edad;
		datosc=sexo;
		datosc=funcion;
		return datosc;
	}
}


