package Proyecto;

public class Alumnos {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private String accion;
    private double nocontrol;
    private String carrera;
    private double altura; 
    
    
    private String Correr;
    private String Comer;
    private String	Escribir;
    private String Dormir;

    public Alumnos(String nom, String app, String apm, char sexo,double altura, int edad, String accion,double nocontrol,String carrera,String Correr,String Comer,String Escribir,String Dormir){
            this.nombre=nom;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.sexo=sexo;
            this.edad=edad;
            this.altura=altura;
            this.accion=accion;
            this.nocontrol=nocontrol;
            this.carrera=carrera;
            this.Correr=Correr;
            this.Comer=Comer;
            this.Escribir=Escribir;
            this.Dormir=Dormir;
    }
    public static String nombre4(String nom1,String nom2,String nom3,String sexo,String edad,String accion,String nocontrol1,String Carrera,String Correr,String Comer,String Escribir) {
    	String noma=nom1;
    	noma=nom2;
    	noma=nom3;
    	noma=sexo;
    	noma=edad;
    	noma=accion;
    	noma=nocontrol1;
    	noma=Carrera;
    	noma=Correr;
    	return noma;
    }
    
    public String Nombre(Alumnos persona) {
    	System.out.println("\n");
    	System.out.println("LOS DATOS DEL ALUMNO SON:\n");
    	String nombrea1="Nombre:";
    	nombrea1+= persona.nombre+" ";
    	nombrea1+=persona.apellidoPaterno+" ";
        nombrea1+=persona.apellidoMaterno+" ";
    	return nombrea1;
    }
 
   public String sexo(Alumnos persona) {
	   System.out.print("Sexo:");	   
	   String sexo=persona.sexo+"";
	   return sexo;   
   }
   public String edad(Alumnos persona) {
	   System.out.print("Edad:");
	   String edad=persona.edad+"";
	   return edad;
   }
   public String estatura(Alumnos persona) {
	   System.out.print("Estatura:");
	   String altura=persona.altura+"";
	   return altura;
   }
   public String carrera(Alumnos persona) {
	   System.out.print("Carrera:");
	   String carrera=persona.carrera+"";
	   return carrera;
   }
   public String nocontrol(Alumnos persona) {
	   System.out.print("Numero de Control:");
	   String nocontrol=persona.nocontrol+"";
	   return nocontrol;
   }
   public String accion(Alumnos persona) {
	   System.out.print("Accion:");
	   String accion=persona.accion+" ";
	   return accion;
   }
   
   public String Correr(Alumnos persona) {
	   System.out.print("El alumno puede:");
	   String Correr=persona.Correr+"";
	   return Correr;
   }
   public String Comer(Alumnos persona) {
	   System.out.print("El alumno puede:");
	   String Comer=persona.Comer+"";  
	   return Comer;
   }
   public String Escribir(Alumnos persona) {
	   System.out.print("El alumno puede:");
	   String Escribir=persona.Escribir+"";  
	   return Escribir;
   }
   public String Dormir(Alumnos persona) {
	   System.out.print("El alumno puede:");
	   String Dormir=persona.Dormir+"";  
	   return Dormir;
   }
}
