
package ej4TarjetaDeCreditoClienteBanco;


public class Banco {
    //atributos
    
    private String nombre;
    private String cuit;
    
    //constructor independiente

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
}
