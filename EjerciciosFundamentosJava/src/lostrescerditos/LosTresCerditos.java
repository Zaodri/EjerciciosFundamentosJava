/*
*Ejemplo de encapsulamiento desde el mismo package
*/
package lostrescerditos;

/**
 *
 * @author Zaodri
 */
public class LosTresCerditos {
    private String nombreCerdito;
    private String colorCerdito;
    private String generoCerdito;
    private int anioCerdito;
    private double pesoCerdito;
    
    public LosTresCerditos(){
        
    }
//    //Sin utilizar get and set
//    public LosTresCerditos(String nomCerdito, String colCerdito, String genCerdito, int anioCerdito, double pesoCerd){
//        this.nombreCerdito = nomCerdito;
//        this.colorCerdito = colCerdito;
//        this.anioCerdito = anioCerdito;
//        this.generoCerdito = genCerdito;
//        this.pesoCerdito = pesoCerd;
//    }
//    public void caracCerdito(){
//       String cerdito = nombreCerdito + colorCerdito + generoCerdito + anioCerdito + pesoCerdito;
//        System.out.println("cerdito = " + cerdito);
//    }
    
    public String getNombreCerdito(){
        return nombreCerdito;
    }    
    public void setNombreCerdito(String nomCerdito){
        this.nombreCerdito = nomCerdito;
    }
    
    public String getColorCerdito(){
        return colorCerdito;        
    }
    public void SetColorCerdito(String colCerdito){
        this.colorCerdito = colCerdito;
    }
    public int getAnioCerdito() {
        return anioCerdito;
    }  
    public void setAnioCerdito(int anioCerdito) {
        this.anioCerdito = anioCerdito;
    }   

    public String getGeneroCerdito() {
        return generoCerdito;
    }
    public void setGeneroCerdito(String genCerdito) {
        this.generoCerdito = genCerdito;
    }
    
    public double getPesoCerdito() {
        return pesoCerdito;
    }

    public void setPesoCerdito(double pesoCerd) {
        this.pesoCerdito = pesoCerd;
    }
    
}
    
