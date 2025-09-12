/*2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej2_numeroMayor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresá el 1er número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingresá el 2do número: ");
        int num2 = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingresá el 3er número: ");
        int num3 = Integer.parseInt(sc.nextLine());
        
        int mayor = num1;
        
        if (num2>mayor) {
            mayor=num2;
        } 
        if (num3>mayor) {
            mayor=num3;            
        }
        System.out.println("El numero mayor es "+mayor);
    }
    
}