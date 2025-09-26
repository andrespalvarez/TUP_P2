
package ej1PasaporteFotoTitular;

import java.sql.Blob;

public class Pasaporte {    
    //ATRIBUTOS
    private int numero;
    private String fechaEmision;
    private Titular titular; // para asociación bidireccional 1:1 Pasaporte-Titular
    private Foto foto;// para composición 1:1
    
    //constructor que compone foto
    public Pasaporte(int numero, String fechaEmision, Blob imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // instancia la foto internamente
    }
    //setter que referencia para relacion bidireccional
    public void setTitular(Titular titular){
        this.titular = titular;
        if(titular!=null && titular.getPasaporte()!=this){
            titular.setPasaporte(this);
        }
    }
    //setters y getters
    
    public int getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }
    
}

    
