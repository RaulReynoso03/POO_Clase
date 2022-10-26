package persona;

	public class docentes extends abstracta{
		public docentes (String nombre,String apellidopaterno, String
				apellidomaterno, String altura,String peso, String edad, String sexo, String sueldo, String numerodeempleado,String materia ) {
			this.nombre=nombre;
			this.apellidopaterno=apellidopaterno;
			this.apellidomaterno=apellidomaterno;
			this.altura=altura;
			this.peso=peso;
			this.edad=edad;
			this.sexo=sexo;
			this.sueldo=sueldo;
			this.numerodecontrol=numerodeempleado;
			this.materia=materia;
		}
		public docentes() {
			super();
		}
		public static String docentea1(String nombre,String apellidopaterno, String apellidomaterno, String altura,String peso, String edad, String sexo, String sueldo, String numerodeempleado, String materia ) {
			String datosb=nombre;
			datosb=apellidopaterno;
			datosb=apellidomaterno;
			datosb=altura;
			datosb=peso;
			datosb=edad;
			datosb=sexo;
			datosb=sueldo;
			datosb=numerodeempleado;
			datosb=materia;
			return datosb;
		}
	}