/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_naveEspacial;

/**
 *
 * @author andre
 */
public class NaveEspacial {
    //definicion de atributos
    private String nombre;
    private double combustible;
    private double combustibleNecesario;
   
    
    //constantes
    final static double AVANCE_COMBUSTIBLE_RATIO = 0.5;//relacion avance a combustible
    final static double LIMITE_COMBUSTIBLE = 50;//cantidad maxima de combustible
        
    //metodos
    void despegar() { //permite despegar si el combustible alcanza para el avance solicitado
        if (combustible>=combustibleNecesario)  {
            System.out.println("La nave ha despegado!");
            combustible-=combustibleNecesario; //restamos el combustible utilizado
        } else {
            System.out.println("La nave no tiene combustible suficiente");
        }
    }
    void avanzar(double distancia){ //calcula el consumo de combustible dependiendo de la distancia
        combustibleNecesario=AVANCE_COMBUSTIBLE_RATIO * distancia;
        System.out.println("ATENCION: Se utilizaran "+combustibleNecesario+" para recorrer la distancia solicitada");
    }
    void recargarCombustible(double cantidad) { //recarga de combustible con validacion y confirmacion
        if (cantidad>0) {
        combustible+=cantidad;
        System.out.println("Se recargaron "+cantidad+" uni de combustible");
            if (combustible>LIMITE_COMBUSTIBLE) {
                combustible=LIMITE_COMBUSTIBLE;
                System.out.println("ATENCION: Limite de "+LIMITE_COMBUSTIBLE+" uni de combustible alcanzado. ");
            }            
        }else{
            System.out.println("Cantidad invalida. Ingrese una cantidad mayor que 0");
        }
            
    }
    void mostrarEstado() { //mostrar estado de la nave
        System.out.println("\n---------------------------------");
        System.out.println("ESTADO DE LA NAVE: "+nombre);
        System.out.println("Cantidad de combustible: "+combustible+" uni");
        System.out.println("---------------------------------\n");
    }
    
    //setters y gettters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
