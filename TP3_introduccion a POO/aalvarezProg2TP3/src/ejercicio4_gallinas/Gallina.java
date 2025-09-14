/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_gallinas;

/**
 *
 * @author andre
 */
public class Gallina {
    //definicion atributos
    private String idGallina;
    private int edad;
    private int huevosPuestos=0;
    //metodos
    public void ponerHuevo(){ //metodo que pone un huevo a la vez
        huevosPuestos+=1;
        System.out.println("La gallina ID: "+idGallina+" puso un huevo.");
    }
    public void envejecer(){ //metodo que envejece un año
        edad+=1;
        System.out.println("La gallina ID: "+idGallina+" cumplio un año.");        
    }
    public void mostrarEstado(){ //metodo que muestra el estado de la gallina
        System.out.println("--------------------------------------");
        System.out.println("  ESTADO DE LA GALLINA ID: "+idGallina);
        System.out.println("--------------------------------------");
        System.out.println("    Edad: "+edad+" años");
        System.out.println("    Cant. huevos: "+huevosPuestos);
        System.out.println("--------------------------------------\n");
    }
    
    //getters y setters

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
