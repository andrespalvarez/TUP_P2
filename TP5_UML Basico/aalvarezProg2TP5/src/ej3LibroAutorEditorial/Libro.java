
package ej3LibroAutorEditorial;

public class Libro {    
    //atributos
    private String titulo;
    private String isbn;
    private Autor autor; //para asociación 1:1 Libro->Autor
    private Editorial editorial;// para agregación 1:1
    
    //constructor que agrega editorial
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        
    }
    //setter que referencia para la asociacion
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    //setters y getters

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }
       
}

    
