/*6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej6_contarPositivoNegativo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int positivo=0;
        int negativo=0;
        int cero=0;
        int nro;
        
        System.out.print("Ingresá 10 números enteros: \n");
        for (int i = 0; i < 10; i++) {
        System.out.print("Ingresá un número entero: ");
        nro = Integer.parseInt(sc.nextLine());
            if (nro>0) {
                positivo++;
            } else if (nro<0) {
                negativo++;
            } else {
                cero++;
            }        
        }        
        System.out.println("Resultados:");
        System.out.println("Positivos: "+positivo);
        System.out.println("Negativos: "+negativo);
        System.out.println("Ceros: "+cero);
    }
    
}