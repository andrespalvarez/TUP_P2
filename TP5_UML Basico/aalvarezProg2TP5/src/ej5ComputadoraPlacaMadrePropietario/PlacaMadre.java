
package ej5ComputadoraPlacaMadrePropietario;

public class PlacaMadre {
    //ATRIBUTOS
    private String modelo;
    private String chipset;
    
    //constructor indepediente

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    //setters y getters

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }
    
}
