/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_naveEspacial;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        //creamos una instancia de nave
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Gral. Belgrano");
        
        //estado inicial
        nave1.mostrarEstado();

        //prueba de despegue sin recarga
        nave1.avanzar(10);
        nave1.despegar();
        
        //recarga y prueba de avance exitoso
        nave1.recargarCombustible(25);
        nave1.avanzar(10);
        nave1.despegar();
        nave1.mostrarEstado();
        
        //recarga superando el limite y prueba de avance exitoso
        nave1.recargarCombustible(40);
        nave1.avanzar(10);
        nave1.despegar();
        nave1.mostrarEstado();
        
        
    }
    
}
