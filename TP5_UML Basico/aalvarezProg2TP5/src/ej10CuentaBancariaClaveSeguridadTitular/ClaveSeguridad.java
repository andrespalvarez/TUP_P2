
package ej10CuentaBancariaClaveSeguridadTitular;


public class ClaveSeguridad {
    //ATRIBUTOS
    private String codigo;
    private String ultimaModificacion;
    
    //constructor indepediente

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    //setters y getters

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    
    
    
}
