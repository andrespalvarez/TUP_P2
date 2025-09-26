
package ej10CuentaBancariaClaveSeguridadTitular;


public class CuentaBancaria {    
    //atributos
    private String cbu;
    private double saldo;
    private Titular titular; // para asociación bidireccional 1:1 CuentaBancaria-Titular
    private ClaveSeguridad claveSeguridad;// para composición 1:1
    
    //constructor que compone ClaveSeguridad
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion); // instancia la ClaveSeguridad internamente
    }
    //setter que referencia para relacion bidireccional
    public void setTitular(Titular titular){
        this.titular = titular;
        if(titular!=null && titular.getCuentaBancaria()!=this){
            titular.setCuentaBancaria(this);
        }
    }
    //setters y getters

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }
    
    
    
}

    
