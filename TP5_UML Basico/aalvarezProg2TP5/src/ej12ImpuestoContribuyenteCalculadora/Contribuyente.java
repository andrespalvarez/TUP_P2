
package ej12ImpuestoContribuyenteCalculadora;



public class Contribuyente {
    //atributos
    private String nombre;
    private String cuil;
        
    //constructor indepediente

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }
    
    
    
    
}
