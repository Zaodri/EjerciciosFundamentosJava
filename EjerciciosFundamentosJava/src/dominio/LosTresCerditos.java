/*
*Ejemplo de encapsulamiento desde package diferente "package dominio y  package test
*/
package dominio;

/**
 *
 * @author Zaodri
 */
public class LosTresCerditos {
    private String nomnreCerdito;
    private String colorCerdito;
    private String generoCerdito;
    private int edadCerdito;
    private double pesoCerdito;
    
    public LosTresCerditos(){
        
    }
    
    public String getNombreCerdito(){
        return nomnreCerdito;
    }
    
    public void setNombreCerdito(String nomCerdito){
        this.nomnreCerdito = nomCerdito;
    }
    
    public String getColorCerdito(){
        return colorCerdito;
    }
    
    public void setColorCerdito(String colorCerdit){
        this.colorCerdito = colorCerdit;
    }
    
    public String getGeneroCerdito(){
        return generoCerdito;
    }
    
    public void setGeneroCerdito(String geneCerdito){
        this.generoCerdito = geneCerdito;
    }
    
    public int getEdadCerdito(){
        return edadCerdito;
    }
    
    public void setEdadCerdito(int edadCerdit){
        this.edadCerdito = edadCerdit;
    }
    
    public double getPesoCerdito(){
        return pesoCerdito;
    }
    
    public void setPesoCerdito(double pesoCerdit){
        this.pesoCerdito = pesoCerdit;
    }
    
    public String toString(){
        return "Cerdito: [ nombre: " + this.nomnreCerdito +
                ", color: " + this.colorCerdito +
                ", genero: " + this.generoCerdito +
                ", edad: " + this.edadCerdito + 
                ", peso: " + this.pesoCerdito + "]";
    }
}
