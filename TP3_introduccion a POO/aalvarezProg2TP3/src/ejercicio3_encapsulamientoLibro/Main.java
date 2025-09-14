/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_encapsulamientoLibro;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        libro1.setTitulo("Don Quijote de la Mancha");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setAnioPublicacion(1605);   //setea año   
        
        libro1.mostrarInfo(); //muestra info completa
        libro1.setAnioPublicacion(2052);    //setea año   (incorrecto)
        libro1.mostrarInfo(); //muestra info completa
        libro1.setAnioPublicacion(1615);    //setea año   
        libro1.mostrarInfo(); //muestra info completa         
        
    }
    
}
