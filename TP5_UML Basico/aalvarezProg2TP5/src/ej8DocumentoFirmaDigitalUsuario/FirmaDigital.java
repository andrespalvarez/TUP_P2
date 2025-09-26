
package ej8DocumentoFirmaDigitalUsuario;


public class FirmaDigital {    
    //atributos
    private String codigoHash;
    private String fecha;
    private Usuario usuario;// para agregación 1:1
    
    //constructor que agrega Usuario

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    //setters y getters

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
    
    
    
    
    
       
}

    
