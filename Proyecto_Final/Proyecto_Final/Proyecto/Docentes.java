package Proyecto;
public class Docentes {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private String accion;
    private double notrabajo;
    private int clases;
    private String profecion;
    private double conpensacion;
    
    private String a1;
    private String a2;
    private String s3;

    public Docentes(String nom, String app, String apm, char sexo, int edad, String accion,double notrabajo,int clases,String profecion,double conpensacion,String a1,String a2,String s3){
            this.nombre=nom;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.sexo=sexo;
            this.edad=edad;
            this.accion=accion;
            this.notrabajo=notrabajo;
            this.clases=clases;
            this.profecion=profecion;
            this.conpensacion=conpensacion;
            this.a1=a1;
            this.a2=a2;
            this.s3=s3;
           
    }
    public static String docente4(String nom1,String nom2,String nom3,String sexo,String edad,String accion,String profeccion,String clases,String compensacion) {
    	String noma=nom1;
    	noma=nom2;
    	noma=nom3;
    	noma=sexo;
    	noma=edad;
    	noma=accion;
    	noma=profeccion;
    	noma=clases;
    	noma=compensacion;
    	return noma;
    }
    public String nombre(Docentes persona) {
    	System.out.println("LOS DATOS DEL DOCENTE SON:");
    	String nombre="Nombre:";
    	nombre+= persona.nombre+" ";
    	nombre+=persona.apellidoPaterno+" ";
        nombre+=persona.apellidoMaterno+" ";
    	return nombre;   	
    }
    public String sexo(Docentes persona) {
 	   System.out.print("Sexo:");	   
 	   String sexo=persona.sexo+"";
 	   return sexo;   
    }
    public String edad(Docentes persona) {
 	   System.out.print("Edad:");
 	   String edad=persona.edad+"";
 	   return edad;
    }
    public String accion(Docentes persona) {
 	   System.out.print("Accion:");
 	   String accion=persona.accion+" ";
 	   return accion;
    }
    public String notrabajo(Docentes persona) {
  	   System.out.print("Numero de trabajo:");
  	   String notrabajo=persona.notrabajo+"";
  	   return notrabajo;
     }
    public String compensacion(Docentes persona) {
    	System.out.println("Compensacion");
    	String compensacion=persona.conpensacion+"";
    	return compensacion;
    }
    
    public String clases(Docentes persona) {
  	   System.out.print("Numero de clases:");
  	   String clases=persona.clases+"";
  	   return clases;
     }
    public String profecion(Docentes persona) {

  	   System.out.print("Profeccion:");
  	   String profecion=persona.profecion+"";
  	   return profecion;
     }
    
    public String a1(Docentes persona) {
    	System.out.print("El docente puede:");
    	String a1=persona.a1+"";
    	return a1;
    }
    public String a2(Docentes persona) {
    	System.out.print("El docente puede:");
    	String a2=persona.a2+"";
    	return a2;
    }
    public String s3(Docentes persona) {
    	System.out.print("El docente puede:");
    	String s3=persona.s3+"";
    	return s3;
    }
}