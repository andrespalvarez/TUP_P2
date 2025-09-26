
package ej5ComputadoraPlacaMadrePropietario;

public class Propietario {
    //atributos
    private int dni;
    private String nombre;
    private Computadora computadora; //para asociación bidireccional 1:1 Computadora-Propietario
    
    //constructor indepediente
    public Propietario(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    //setter que referencia para relacion bidireccional
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        if(computadora!=null && computadora.getPropietario()!=this){
            computadora.setPropietario(this);
        }
    }
    //setters y getters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Computadora getComputadora() {
        return computadora;
    }
    
}
