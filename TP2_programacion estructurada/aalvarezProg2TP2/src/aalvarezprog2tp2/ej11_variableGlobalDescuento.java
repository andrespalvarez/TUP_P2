/*11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
*/

package aalvarezprog2tp2;

import java.util.Scanner;

public class ej11_variableGlobalDescuento {
    
    //CONSTANTES
    
    //VARIABLES GLOBALES
    public static double descuentoGlobal = 0.10;
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());
        
        System.out.println("El descuento especial del producto es: "+precio*descuentoGlobal);
        System.out.println("El precio final con descuento es: "+calcularDescuentoEspecial(precio));
       
    } //FIN DE MAIN
    
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado=precio*descuentoGlobal;
        return precio-descuentoAplicado;
    }                
 
}//FIN DE CLASS