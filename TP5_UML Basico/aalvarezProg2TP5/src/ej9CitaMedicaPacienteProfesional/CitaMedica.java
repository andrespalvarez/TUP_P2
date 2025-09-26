
package ej9CitaMedicaPacienteProfesional;

public class CitaMedica {    
    //atributos
    private String fecha;
    private String hora;
    private Paciente paciente; //para asociación 1:1 CitaMedica->Paciente
    private Profesional profesional; //para asociación 1:1 CitaMedica->Profesional
    
    //constructor independiente

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    //setter que referencia para la asociacion
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    //setter que referencia para la asociacion
    public void setProfesional(Profesional profesional){
        this.profesional = profesional;
    }
    //setters y getters

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }
    

    
    
           
}

    
