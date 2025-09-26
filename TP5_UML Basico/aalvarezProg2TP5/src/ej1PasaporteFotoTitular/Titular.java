
package ej1PasaporteFotoTitular;

public class Titular {
    //ATRIBUTOS
    private int dni;
    private String nombre;
    private Pasaporte pasaporte; //para asociación bidireccional 1:1 Pasaporte-Titular
    
    //constructor indepediente
    public Titular(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    //setter que referencia para relacion bidireccional
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if(pasaporte!=null && pasaporte.getTitular()!=this){
            pasaporte.setTitular(this);
        }
    }
    //setters y getters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
}
