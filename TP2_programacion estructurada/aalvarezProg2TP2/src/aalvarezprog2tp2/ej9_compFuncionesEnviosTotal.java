/*9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej9_compFuncionesEnviosTotal {
    
    //CONSTANTES
    final static double COSTO_NACIONAL_KG = 5;
    final static double COSTO_INTERNACIONAL_KG = 10;

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double peso, precioProducto, precioFinal;
        String zona;
        
        System.out.print("Ingresá el precio del producto: ");
        precioProducto = Double.parseDouble(sc.nextLine());
        System.out.print("Ingresá el peso del paquete: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Ingresá la zona de envio (Nacional/Internacional: ");
        zona = sc.nextLine().toUpperCase();
               
        precioFinal= calcularTotalCompra( precioProducto, calcularCostoEnvio( peso, zona));//llamo a las funciones
        
        System.out.println("El costo del envio es: $"+calcularCostoEnvio( peso, zona));
        System.out.println("El precio final con envio es: $"+precioFinal);
        
    } //FIN DE MAIN
    
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equals("NACIONAL")) {
            return peso*COSTO_NACIONAL_KG;
        }else if (zona.equals("INTERNACIONAL")) {
            return peso*COSTO_INTERNACIONAL_KG;            
        }else {
            System.out.println("ERROR.No es posible calcular envio");
            return 0;
        }        
    }                
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto+costoEnvio; 
    }
    
}//FIN DE CLASS