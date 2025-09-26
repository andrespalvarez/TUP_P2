
package ej6ReservaClienteMesa;


public class Cliente {
    //atributos
    private String nombre;
    private String telefono;
        
    //constructor indepediente

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
    
}
