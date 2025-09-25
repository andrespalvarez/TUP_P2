
package aalvarezprog2tp4;

public class Main {

    public static void main(String[] args) {
        
        Empleado empl1 = new Empleado(1, "Anibal", "operario", 850); //nuevo empleado
        Empleado empl2 = new Empleado("Jorge", "supervisor"); //nuevo empleado
        
        System.out.println("");
        System.out.println(empl1); //imprime estado del empleado
        System.out.println(empl2); //imprime estado del empleado
        
        Empleado.mostrarTotalEmpleados(); //muestra el total de empleados creados
        
        System.out.println("");
        Empleado empl3 = new Empleado(101, "Camila", "operario", 900); //nuevo empleado
        Empleado empl4 = new Empleado("Ana", "gerente"); //nuevo empleado
        
        System.out.println(empl3); //imprime estado del empleado
        System.out.println(empl4); //imprime estado del empleado
        
        Empleado.mostrarTotalEmpleados(); //muestra el total de empleados creados
        
        empl3.actualizarSalario(10.0); //aumentamos el salario de empl3 en un 10%
        empl4.actualizarSalario(500); //aumentamos el salario de empl4 en 500 unidades
        
        System.out.println("");
        System.out.println(empl3); //imprime estado del empleado
        System.out.println(empl4); //imprime estado del empleado
        
        
    }
    
}
