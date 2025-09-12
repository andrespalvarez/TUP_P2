/*8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej8_funcionesPrecioFinal {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double precioBase, impuesto, descuento, precioFinal;
        
        System.out.print("Ingresá el precio base del producto: ");
        precioBase = Double.parseDouble(sc.nextLine());
        System.out.print("Ingresá el porcentaje de impuesto: ");
        impuesto = Double.parseDouble(sc.nextLine());
        System.out.print("Ingresá el porcentaje de descuento: ");
        descuento = Double.parseDouble(sc.nextLine());
        
        precioFinal= calcularPrecioFinal( precioBase, impuesto,  descuento); //llamo a la funcion
        
        System.out.println("El precio final es del producto: $"+precioFinal);
        
    } //FIN DE MAIN
    
    static double calcularPrecioFinal( double precioBase, double impuesto, double descuento) {
        return precioBase+(precioBase*impuesto/100)-(precioBase*descuento/100);
    }
    
}//FIN DE CLASS