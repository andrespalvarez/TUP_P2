
package aalvarezprog2tp4;

public class Empleado {
    
    //declaracion atributos
    private int id=0;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados=0; //atributo de la clase
    
    //constructores

    public Empleado(int id, String nombre, String puesto, double salario) { //constructor con todos los atributos
        this.id=id;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        totalEmpleados++; //incrementa la cantidad de empleados
    }

    public Empleado(String nombre, String puesto) { //constructor que necesita solo nombre y puesto
        this(generarId(), nombre, puesto, 1000);
        
                
    }
    
    //metodos estaticos
    static private int generarId() {   //genera id
        return totalEmpleados+1;
    }
    
    static void mostrarTotalEmpleados() { //muestra el total de empleados
        System.out.println("\nCantidad de empleados: "+Empleado.totalEmpleados);
    }
    
    // metodos
    void actualizarSalario(double porcentaje){         //aumenta un porcentaje double dado
        salario=salario+salario*porcentaje/100;
        System.out.println("Se aumento el salario del empleado: "+id+" en un "+porcentaje+"%");
    }
    
    void actualizarSalario(int aumento){    //aumenta una cifra int dada        
        salario=salario+aumento;
        System.out.println("Se aumento el salario del empleado: "+id+" en "+aumento+"uni");
    }
    
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // tostring personalizado

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
  
        
            
    
}
