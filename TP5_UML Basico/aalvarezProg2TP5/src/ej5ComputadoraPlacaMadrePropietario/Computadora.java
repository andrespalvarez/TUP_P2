
package ej5ComputadoraPlacaMadrePropietario;


public class Computadora {    
    //atributos
    private String marca;
    private String numeroSerie;
    private Propietario propietario; // para asociación bidireccional 1:1 Computadora-Propietario
    private PlacaMadre placaMadre;// para composición 1:1
    
    //constructor que compone PlacaMadre
    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset); // instancia la PlacaMadre internamente
    }
    //setter que referencia para relacion bidireccional
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if(propietario!=null && propietario.getComputadora()!=this){
            propietario.setComputadora(this);
        }
    }
    //setters y getters

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
}

    
