
package ej6ReservaClienteMesa;

public class Mesa {
    //atributos
    private int numero;
    private int capacidad;
    
    //constructor independiente

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    //setters y getters

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    

}
