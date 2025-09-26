
package ej1PasaporteFotoTitular;

import java.sql.Blob;

public class Foto {
    //ATRIBUTOS
    private Blob foto;
    private String formato;
    
    //constructor indepediente
    public Foto(Blob foto, String formato) {
        this.foto = foto;
        this.formato = formato;
    }
    
    //setters y getters

    public Blob getFoto() {
        return foto;
    }

    public String getFormato() {
        return formato;
    }
    
}
