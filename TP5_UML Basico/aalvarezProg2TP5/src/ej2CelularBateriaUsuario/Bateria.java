
package ej2CelularBateriaUsuario;

public class Bateria {
    //atributos
    private String modelo;
    private int capacidad;
    
    //constructor independiente
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    //setters y getters

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
}
