
package ej13GeneradorQRUsuarioCodigoQR;


public class CodigoQR {    
    //atributos
    private String valor;
    private Usuario usuario; //para asociación 1:1 CodigoQR->Usuario
        
    //constructor independiente

    public CodigoQR(String valor) {
        this.valor = valor;
    }
    //getters

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
           
}

    
