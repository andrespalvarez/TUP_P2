
package ej7VehiculoMotorConductor;


public class Motor {
    //atributos
    
    private String tipo;
    private String numeroSerie;
    
    //constructor independiente

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    //setters y getters

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    
    

}
