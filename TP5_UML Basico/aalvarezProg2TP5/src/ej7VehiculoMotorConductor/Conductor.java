
package ej7VehiculoMotorConductor;


public class Conductor {
    //atributos
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; //para asociación bidireccional 1:1 Vehiculo-Conductor
    
    //constructor indepediente

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    //setter que referencia para relacion bidireccional
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if(vehiculo!=null && vehiculo.getConductor()!=this){
            vehiculo.setConductor(this);
        }
    }
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    
}
