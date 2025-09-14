/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_gallinas;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        //instanciamos las gallinas con sus datos iniciales
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina("G00001");
        gallina1.setEdad(0);
        
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina("G00002");
        gallina2.setEdad(2);
        
        //mostramos estado inicial
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        //simulamos vida de las gallinas
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        
        //mostramos estado final
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
        
    }
    
}
