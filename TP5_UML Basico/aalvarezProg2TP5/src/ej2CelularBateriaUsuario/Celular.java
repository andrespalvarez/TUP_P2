
package ej2CelularBateriaUsuario;

public class Celular {    
    //atributos
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario; //para asociación bidireccional 1:1 Celular-Usuario
    private Bateria bateria;// para agregación 1:1
    
    //constructor que agrega bateria
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    //setter que referencia para relacion bidireccional
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if(usuario!=null && usuario.getCelular()!=this){
            usuario.setCelular(this);
        }
    }
    //setters y getters

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
           
}

    
