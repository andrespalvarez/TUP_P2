/*5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej5_sumarPares {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma=0;
        int nro;
        
        System.out.print("Ingresá un número entero: ");
        nro = Integer.parseInt(sc.nextLine());
        
        while (nro!=0) {
            if (nro%2==0) {
                suma=suma+nro;
            }            
            System.out.print("Ingresá otro número entero: ");
            nro = Integer.parseInt(sc.nextLine());
        }
        System.out.println("La suma de los nros. pares ingresados da: "+suma);         
    }
    
}