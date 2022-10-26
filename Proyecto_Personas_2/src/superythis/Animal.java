package superythis;
public class Animal {
    
    private int patas;
    private String come;
    private String voz;
    
    public Animal(){
        super();
        
    }
    
    public Animal(int patas, String come, String voz){
        super();
        
        this.patas = patas;
        this.come = come;
        this.voz = voz;
    }
    /**
     * @return the patas
     */
    public int getPatas() {
        return patas;
    }
    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
    }
    /**
     * @return the come
     */
    public String getCome() {
        return come;
    }
    /**
     * @param come the come to set
     */
    public void setCome(String come) {
        this.come = come;
    }
    /**
     * @return the voz
     */
    public String getVoz() {
        return voz;
    }
    /**
     * @param voz the voz to set
     */
    public void setVoz(String voz) {
        this.voz = voz;
    }
    
}