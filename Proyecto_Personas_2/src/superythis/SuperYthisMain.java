package superythis;
public class SuperYthisMain {
    
    public static void main(String []args){
        
        Perro rufo = new Perro();
        //Seteo de atributos de la clase padre (Animal)
        rufo.setPatas(4);
        rufo.setCome("carne");
        rufo.setVoz("ladra");
        
        //Seteo de los atributos de la clase hijo (Perro)
        rufo.setColor("negro");
        rufo.setTamano("grande");
        rufo.setMuerde(true);
        
        //Imprimir los atributos de Rufo
        System.out.println("RUFO");
        System.out.println("Rufo tiene " + rufo.getPatas() + " patas, come " + rufo.getCome() + 
                           ", y " + rufo.getVoz() + ". Rufo es de color " + rufo.getColor() + ", y es de tamaño " + rufo.getTamano() + " y muerde " + rufo.isMuerde());
        
        Perro fifi = new Perro(4, "croquetas", "ladra");
        fifi.setColor("blanco");
        fifi.setTamano("chico");
        fifi.setMuerde(false);
        System.out.println("FIFI");
        System.out.println("Fifi tiene " + fifi.getPatas() + " patas, come " + fifi.getCome() + 
                           ", y " + fifi.getVoz() + ". Fifi es de color " + fifi.getColor() + ", y es de tamaño " + fifi.getTamano() + " y muerde " + fifi.isMuerde());
        
        
        Perro sanson = new Perro(4, "de todo", "ladra", "gris", "grande", true);
        System.out.println("SANSON");
        System.out.println("Sanson tiene " + sanson.getPatas() + " patas, come " + sanson.getCome() + 
                           ", y " + sanson.getVoz() + ". Sanson es de color " + sanson.getColor() + ", y es de tamaño " + sanson.getTamano() + " y muerde " + sanson.isMuerde());
        
    }
    
}