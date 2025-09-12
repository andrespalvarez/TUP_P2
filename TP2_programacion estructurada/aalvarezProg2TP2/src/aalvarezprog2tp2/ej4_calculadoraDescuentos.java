/*4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej4_calculadoraDescuentos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int descuento=0;
        
        System.out.print("Ingresá el precio del producto: ");
        double precio = Integer.parseInt(sc.nextLine());
              
        System.out.print("Ingresá el código de descuento: ");
        String codigo = sc.nextLine().toUpperCase();
        
        switch (codigo){
            case "A":
                descuento=10;
                break;
            case "B":
                descuento=15;
                break;
            case "C":
                descuento=20;
                break;
            default:
                System.out.println("Descuento no válido");
        }
        System.out.println("Descuento aplicado: "+descuento+"%");
        System.out.println("Precio: final: $"+(precio*(1-descuento/100.00)));
                 
    }
    
}