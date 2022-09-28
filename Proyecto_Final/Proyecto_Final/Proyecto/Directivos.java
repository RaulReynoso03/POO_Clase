package Proyecto;

public class Directivos {
	
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private double notrabajo;
    private int fechai;
    private int fechaf;
    private float compensacion;
    private String cargo;
    private String Accion;
    
    private String a1;
    private String a2;
    private String a3;
    
    public Directivos(String nom, String app, String apm, char sexo, int edad,double notrabajo,String cargo,float compensacion,int fechai,int fechaf,String Accion,String a1,String a2,String a3){
            this.nombre=nom;
            this.apellidoPaterno=app;
            this.apellidoMaterno=apm;
            this.sexo=sexo;
            this.edad=edad;
            this.notrabajo=notrabajo;
            this.compensacion=compensacion;
            this.fechai=fechai;
            this.fechaf=fechaf;
            this.cargo=cargo;
            this.Accion=Accion;
            this.a1=a1;
            this.a2=a2;
            this.a3=a3;
    }
    
    public String nombre(Directivos persona) {
    	System.out.println("\n");
    	System.out.println("LOS DATOS DEL DIRECTOR  SON:\n");
    	String nombrea1="Nombre:";
    	nombrea1+= persona.nombre+" ";
    	nombrea1+=persona.apellidoPaterno+" ";
        nombrea1+=persona.apellidoMaterno+" ";
    	return nombrea1;
    }
    public String sexo(Directivos persona) {
 	   System.out.print("Sexo:");	   
 	   String sexo=persona.sexo+"";
 	   return sexo;   
    }
    public String edad(Directivos persona) {
 	   System.out.print("Edad:");
 	   String edad=persona.edad+"";
 	   return edad;
    }
    public String notrabajo(Directivos persona) {
 	   System.out.print("Numero de trabajo:");
 	   String notrabajo=persona.notrabajo+"";
 	   return notrabajo;
    }
    public String fechai(Directivos persona) {
    	System.out.println("Fecha de inicio:");
    	String fechai=persona.fechai+"";
    	return fechai;
    }
    public String fechaf(Directivos persona) {
    	System.out.println("Fecha de salida:");
    	String fechaf=persona.fechaf+"";
    	return fechaf;
    }
    public String compensacion(Directivos persona) {
    	System.out.print("Compensacion:");
    	String compensacion=persona.compensacion+"";
    	return compensacion;
    }  
    public String Accion(Directivos persona) {
    	System.out.print("Accion:");
    	String Accion=persona.Accion+"";
    	return Accion;
    }
    
    public String cargo(Directivos persona) {
    	System.out.println("Cargo:");
    	String cargo=persona.cargo+"";
    	return cargo;
}
    public String a1(Directivos persona) {
    	System.out.println("El director puede:");
    	String a1=persona.a1+"";
    	return a1;
    }
    public String a2(Directivos persona) {
    	System.out.println("El director puede:");
    	String a2=persona.a2+"";
    	return a2;
    }
    public String a3(Directivos persona) {
    	System.out.println("El director puede:");
    	String a3=persona.a3+"";
    	return a3;
    }
    }