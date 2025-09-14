/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_registroEstudiantes;

/**
 *
 * @author andre
 */
public class Estudiante {
    //creo los atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    //creo los metodos
    void mostrarInfo() {    //muestra la info en pantalla
        System.out.println("Nombre completo: "+nombre+" "+apellido+" | "+"Curso: "+curso+" | "+"Calificacion: "+calificacion);
    }
    
    void subirCalificacion(double puntos) { //sube la calificacion la cantidad puntos
        calificacion+=puntos;
    }
    
    void bajarCalificacion(double puntos) { //baja la calificacion la cantidad puntos
        calificacion-=puntos;
    } 
}
