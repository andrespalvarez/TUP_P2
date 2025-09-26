
package ej7VehiculoMotorConductor;


public class Vehiculo {    
    //atributos
    private String patente;
    private String modelo;
    private Conductor conductor; //para asociación bidireccional 1:1 Vehiculo-Conductor
    private Motor motor;// para agregación 1:1
    
    //constructor que agrega Motor

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    //setter que referencia para relacion bidireccional
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if(conductor!=null && conductor.getVehiculo()!=this){
            conductor.setVehiculo(this);
        }
    }
    //setters y getters

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    
    
    
       
}

    
