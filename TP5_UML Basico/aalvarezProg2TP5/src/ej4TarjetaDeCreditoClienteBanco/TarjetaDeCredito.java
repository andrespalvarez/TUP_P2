
package ej4TarjetaDeCreditoClienteBanco;

public class TarjetaDeCredito {    
    //atributos
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; //para asociación bidireccional 1:1 TarjetaDeCredito-Cliente
    private Banco banco;// para agregación 1:1
    
    //constructor que agrega Banco

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    //setter que referencia para relacion bidireccional
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if(cliente!=null && cliente.getTarjetaDeCredito()!=this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    //setters y getters

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
       
}

    
