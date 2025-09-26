
package ej11ReproductorCancionArtista;


public class Cancion {    
    //atributos
    private String titulo;
    private Artista artista; //para asociación 1:1 Cancion->Artista
        
    //constructor independiente

    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    //getters

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    
   
    
           
}

    
