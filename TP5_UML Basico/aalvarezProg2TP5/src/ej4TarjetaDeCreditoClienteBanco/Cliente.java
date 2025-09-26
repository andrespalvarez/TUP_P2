
package ej4TarjetaDeCreditoClienteBanco;


public class Cliente {
    //atributos
    private int dni;
    private String nombre;
    private TarjetaDeCredito tarjetaDeCredito; //para asociación bidireccional 1:1 TarjetaDeCredito-Cliente
    
    //constructor indepediente
    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    //setter que referencia para relacion bidireccional
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        if(tarjetaDeCredito!=null && tarjetaDeCredito.getCliente()!=this){
            tarjetaDeCredito.setCliente(this);
        }
    }
    //setters y getters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
}
