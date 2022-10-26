package persona;

public class principal {
	public static void main(String[] args) {
		alumnos alumno1= new alumnos("Edgar","Varela","Mejia","1.89","89","16","masculino","648372559");
		alumnos alumno2= new alumnos("Raul","Reynoso","Santana","1.80","80","17","masculino","128238124");
		alumnos alumno3= new alumnos("Uriel","Martinez","Zamora","1.65","74","16","masculino","920122324");
		
		docentes docentes1=new docentes("Jose","Perez","Herrera","1.82","85","32","masculino","50000","6573487956","Ingles");
		docentes docentes2=new docentes("Maria","Gomez","Martinez","1.72","75","30","femenino","30000","8765098465","Biologia");
		docentes docentes3=new docentes("Pepe","Sanchez","Espinosa","1.62","65","28","masculino","60000","7685623145","Etica");
		
		administrativos administrativo1=new administrativos("David","Herrera","Gonzales","1.90","90","42","masculino","Perfecto");
		administrativos administrativo2=new administrativos("Angela","Reynoso","Perez","1.70","79","37","Femenino","Sub directora");
		administrativos administrativo3=new administrativos("Angel","Meneses","Islas","1.81","69","48","masculino","perfecto");
		
		directivos directivo1= new directivos("FranciscO","Martinez","Zamora","1.83","70","54","masculino","30000","Director");
	}

}
