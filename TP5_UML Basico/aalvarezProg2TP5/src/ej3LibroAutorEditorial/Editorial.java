
package ej3LibroAutorEditorial;


public class Editorial {
    //atributos
    private String nombre;
    private String direccion;
    
    //constructor independiente

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    

}
