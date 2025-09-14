/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_encapsulamientoLibro;

import java.time.Year;



/**
 *
 * @author andre
 */
public class Libro {
    //constantes
    final static int ANIO_MIN=800; 
      
    //creo los atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //metodos
    void mostrarInfo() {    //muestra la info en pantalla
    System.out.println("Titulo : " + titulo + " | " +"Autor: "+autor+" | " +"Año Publicación: " + anioPublicacion);
    }
     //getters y setters
    public String getTitulo() { //getter titulo
        return titulo;
    }

    public void setTitulo(String titulo) { //setter titulo
        this.titulo = titulo;
    }

    public String getAutor() { //getter autor
        return autor;
    }

    public void setAutor(String autor) { //setter autor
        this.autor = autor;
    }

    public int getAnioPublicacion() { //getter año
        return anioPublicacion;
    }
          
    public void setAnioPublicacion(int anioPublicacion) { //setter año
        
        int anioActual=Year.now().getValue(); //tomamos el año actual
    
        if (anioPublicacion > ANIO_MIN && anioPublicacion <= anioActual ) {
            this.anioPublicacion = anioPublicacion;            
        } else {
            System.out.println("Año ingresado "+anioPublicacion+" invalido. Ingrese año entre "+ANIO_MIN+" y "+anioActual);
        }

    }
    
    
    
    
    
}
