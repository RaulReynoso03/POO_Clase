package persona;

	public class directivos extends abstracta{
		public directivos (String nombre,String apellidopaterno, String
				apellidomaterno, String altura,String peso, String edad, String sexo, String compensacion, String cargo) {
			this.nombre=nombre;
			this.apellidopaterno=apellidopaterno;
			this.apellidomaterno=apellidomaterno;
			this.altura=altura;
			this.peso=peso;
			this.edad=edad;
			this.sexo=sexo;
			this.compensacion=compensacion;
			this.cargo=cargo;
		}
		public directivos() {
			super();
		}
		public static String directivosa1(String nombre,String apellidopaterno, String apellidomaterno, String altura,String peso, String edad, String sexo, String compensacion, String cargo ) {
			String datosd=nombre;
			datosd=apellidopaterno;
			datosd=apellidomaterno;
			datosd=altura;
			datosd=peso;
			datosd=edad;
			datosd=sexo;
			datosd=compensacion;
			datosd=cargo;
			return datosd;
		}

}
