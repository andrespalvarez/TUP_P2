
package ej6ReservaClienteMesa;

public class Reserva {    
    //atributos
    private String fecha;
    private String hora;
    private Cliente cliente; //para asociación 1:1 Reserva->Cliente
    private Mesa mesa;// para agregación 1:1
    
    //constructor que agrega Mesa

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    //setter que referencia para la asociacion
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    //setters y getters

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}

    
