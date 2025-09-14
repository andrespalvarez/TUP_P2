/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_registroEstudiantes;

/**
 *
 * @author andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo la instancia y cargo los datos
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre="Andres";
        estudiante1.apellido="Alvarez";
        estudiante1.curso="1A";
        
        //trabajo con los metodos
        estudiante1.mostrarInfo();//muestro la informacion con el metodo indicado
        estudiante1.subirCalificacion(5.5); //subo la calificacion
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(1); //bajo la calificacion
        estudiante1.mostrarInfo();
    }
    
}
