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


public class ej12_arraysPrecios {
    
    //CONSTANTES
    
    //VARIABLES GLOBALES
         
    public static void main(String[] args) {
                
        double[] precios = {199.99,299.5,149.75,399.0,89.99};     
        
        System.out.println("Precios originales:");
        imprimirPrecios(precios);        
        
        precios[2]=129.99;
        System.out.println("Precios modificados:");
        imprimirPrecios(precios);      
          
    } //FIN DE MAIN
 
    public static void imprimirPrecios(double[] precios) {
        for (double precio:precios) {
        System.out.println("Precio: $"+precio);
        }
    }        
 
}//FIN DE CLASS