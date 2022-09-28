package Proyecto;

public class Administrativos {


    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private String accion;
    private double notrabajo;
    private int htrabajo;
    
    private String a1;
    private String a2;
    private String a3;

    public Administrativos(String nom, String app, String apm, char sexo, int edad, String accion,double notrabajo,int htrabajo,String a1,String a2,String a3){
            this.nombre=nom;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.sexo=sexo;
            this.edad=edad;
            this.accion=accion;
            this.notrabajo=notrabajo;
            this.htrabajo=htrabajo;
            
            this.a1=a1;
            this.a2=a2;
            this.a3=a3;
    }
    
    public static String nuevoAdministrador(String nom1,String nom2,String nom3,String sexo,String edad,String accion,String nocontrol1,String horas) {
    	String noma=nom1;
    	noma=nom2;
    	noma=nom3;
    	noma=sexo;
    	noma=edad;
    	noma=accion;
    	noma=nocontrol1;
    	noma=horas;
    	return noma;
    }
    public String nombre1(Administrativos persona) {
    	System.out.println("\n");
    	System.out.println("LOS DATOS DEL ALUMNO SON:\n");
    	String nombrea1="Nombre:";
    	nombrea1+= persona.nombre+" ";
    	nombrea1+=persona.apellidoPaterno+" ";
        nombrea1+=persona.apellidoMaterno+" ";
    	return nombrea1;
    }
    public String sexo(Administrativos persona) {
 	   System.out.print("Sexo:");	   
 	   String sexo=persona.sexo+"";
 	   return sexo;   
    }
    public String edad(Administrativos persona) {
 	   System.out.print("Edad:");
 	   String edad=persona.edad+"";
 	   return edad;
    }
    public String notrabajo(Administrativos persona) {
  	   System.out.print("Numero de trabajo:");
  	   String notrabajo=persona.notrabajo+"";
  	   return notrabajo;
     }
    public String accion(Administrativos persona) {
 	   System.out.print("Accion:");
 	   String accion=persona.accion+" ";
 	   return accion;
    }
    public String htrabajo(Administrativos persona) {
 	   System.out.print("Horas de trabajo:");
 	   String htrabajo=persona.htrabajo+" ";
 	   return htrabajo;
    }
    public String a1(Administrativos persona) {
    	System.out.println("El  puede:");
    	String a1=persona.a1+"";
    	return a1;
    }
    public String a2(Administrativos persona) {
    	System.out.println("El  puede:");
    	String a2=persona.a2+"";
    	return a2;
    }
    public String a3(Administrativos persona) {
    	System.out.println("El puede:");
    	String a3=persona.a3+"";
    	return a3;
    }
    
}