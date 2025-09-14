/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_mascotas;

/**
 *
 * @author andre
 */
public class Mascota {
    //creo los atributos

    String nombre;
    String especie;
    int edad;

    //creo los metodos
    void mostrarInfo() {    //muestra la info en pantalla
        System.out.println("Nombre : " + nombre + " | " +"Especie: "+especie+" | " +"Edad: " + edad);
    }

    void cumplirAnios() { //aumenta la edad un año por vez
        edad += 1;
    }

}
