package persona;

public class alumnos extends abstracta{
	public alumnos (String nombre,String apellidopaterno, String
			apellidomaterno, String altura,String peso, String edad, String sexo, String numerodecontrol ) {
		this.nombre=nombre;
		this.apellidopaterno=apellidopaterno;
		this.apellidomaterno=apellidomaterno;
		this.altura=altura;
		this.peso=peso;
		this.edad=edad;
		this.sexo=sexo;
		this.numerodecontrol=numerodecontrol;
	}
	public alumnos() {
		super();
	}
	public static String nombrea1(String nombre,String apellidopaterno, String apellidomaterno, String altura,String peso, String edad, String sexo, String numerodecontrol ) {
		String datosa=nombre;
		datosa=apellidopaterno;
		datosa=apellidomaterno;
		datosa=altura;
		datosa=peso;
		datosa=edad;
		datosa=sexo;
		datosa=numerodecontrol;
		return datosa;
	}
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
}
