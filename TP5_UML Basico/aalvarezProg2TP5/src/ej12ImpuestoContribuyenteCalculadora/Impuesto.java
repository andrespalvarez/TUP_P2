
package ej12ImpuestoContribuyenteCalculadora;


public class Impuesto {    
    //atributos
    private double monto;
    private Contribuyente contribuyente; //para asociación 1:1 Impuesto->Contribuyente
        
    //constructor independiente

    public Impuesto(double monto) {
        this.monto = monto;
    }
    //getters

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
   
    
           
}

    
