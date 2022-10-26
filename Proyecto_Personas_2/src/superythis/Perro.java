package superythis;
public class Perro extends Animal{
    
    private String color;
    private String tamano;
    private boolean muerde;
    
    public Perro(){
        super();
    }
    
    public Perro(int patas, String come, String voz){
        super(patas, come, voz);
        
    }
    
    public Perro(int patas, String come, String voz, String color, String tamano, boolean muerde){
        super(patas, come, voz);
        
        this.color = color;
        this.tamano = tamano;
        this.muerde = muerde;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the tamaño
     */
    public String getTamano() {
        return tamano;
    }
    /**
     * @param tamaño the tamaño to set
     */
    public void setTamano(String tamaño) {
        this.tamano = tamaño;
    }
    /**
     * @return the muerde
     */
    public boolean isMuerde() {
        return muerde;
    }
    /**
     * @param muerde the muerde to set
     */
    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }
    
    
    
}