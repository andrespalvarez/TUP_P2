/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_mascotas;

import ejercicio1_registroEstudiantes.Estudiante;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        //creo la instancia y cargo los datos
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Palta";
        mascota1.especie = "mestizo";
        mascota1.edad = 2;

        //trabajo con los metodos
        mascota1.mostrarInfo();//muestro la informacion con el metodo indicado
        mascota1.cumplirAnios();//cumple un año más
        mascota1.mostrarInfo();//muestro la informacion con el metodo indicado
        mascota1.cumplirAnios();//cumple un año más
        mascota1.cumplirAnios();//cumple un año más
        mascota1.cumplirAnios();//cumple un año más
        mascota1.mostrarInfo();//muestro la informacion con el metodo indicado
    }
}
