
package ej13GeneradorQRUsuarioCodigoQR;



public class GeneradorQR {
    //metodo que llama al CodigoQR
    
    public void generar(String valor){
        CodigoQR codigoQR1 = new CodigoQR(valor); //instancia un nuevo CodigoQR
        //codigo que ejecuta el generador utilizando codigoQR1.getValor()
    }
}
