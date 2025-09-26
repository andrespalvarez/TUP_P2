
package ej3LibroAutorEditorial;


public class Autor {
    //atributos
    private String nombre;
    private String nacionalidad;
        
    //constructor indepediente
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
