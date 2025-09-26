
package ej9CitaMedicaPacienteProfesional;


public class Paciente {
    //atributos
    private String nombre;
    private String obraSocial;
        
    //constructor indepediente

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    
    
    
    
    
}
