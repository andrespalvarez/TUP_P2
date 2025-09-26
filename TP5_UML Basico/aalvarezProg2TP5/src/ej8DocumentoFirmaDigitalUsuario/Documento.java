
package ej8DocumentoFirmaDigitalUsuario;

import java.sql.Blob;

public class Documento {    
    //atributos
    private String titulo;
    private Blob contenido;
    private FirmaDigital firmaDigital;// para composición 1:1
    
    //constructor que compone FirmaDigital
    public Documento(String titulo, Blob contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario); // instancia la FirmaDigital internamente
    }
    
    
}

    
