
package ej2CelularBateriaUsuario;

public class Usuario {
    //atributos
    private int dni;
    private String nombre;
    private Celular celular; //para asociación bidireccional 1:1 Celular-Usuario
    
    //constructor indepediente
    public Usuario(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    //setter que referencia para relacion bidireccional
    public void setCelular(Celular celular){
        this.celular = celular;
        if(celular!=null && celular.getUsuario()!=this){
            celular.setUsuario(this);
        }
    }
    //setters y getters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }
    
}
