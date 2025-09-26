
package ej14EditorVideoProyectoRender;


public class Render {    
    //atributos
    private String formato;
    private Proyecto proyecto; //para asociación 1:1 Render->Proyecto
        
    //constructor independiente

    public Render(String formato) {
        this.formato = formato;
    }
    //getters

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
    

    
   
    
           
}

    
