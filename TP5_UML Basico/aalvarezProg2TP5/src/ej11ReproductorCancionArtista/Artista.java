
package ej11ReproductorCancionArtista;


public class Artista {
    //atributos
    private String nombre;
    private String genero;
        
    //constructor indepediente

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    
    
    
}
