
package ej10CuentaBancariaClaveSeguridadTitular;


public class Titular {
    //atributos
    private int dni;
    private String nombre;
    private CuentaBancaria cuentaBancaria; //para asociación bidireccional 1:1 CuentaBancaria-Titular
    
    //constructor indepediente
    public Titular(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    //setter que referencia para relacion bidireccional
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria!=null && cuentaBancaria.getTitular()!=this){
            cuentaBancaria.setTitular(this);
        }
    }
    //setters y getters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    
    
}
