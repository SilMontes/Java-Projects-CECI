
package relaciones;
import relaciones.Entidades.Empresa;
import relaciones.Entidades.Departamento;
import relaciones.Entidades.Empleado;
import java.time.LocalDate;
public class Relaciones {

   
    public static void main(String[] args) {
       Empresa empresa = new Empresa("Zoom");
       empresa.crearDepartamento("Ventas", 1);
       empresa.crearDepartamento("Contaduría", 2);
       LocalDate fechaNacimiento = LocalDate.of(2006, 5, 3);
       LocalDate fechaNacimiento2 = LocalDate.of(2006, 9, 3);
       
       Empleado e1 = new Empleado("Sil",fechaNacimiento);
       Empleado e2 = new Empleado("Ana",fechaNacimiento2);
       empresa.contratarEmpleado(e1,0);
       empresa.contratarEmpleado(e2,1);
       System.out.println(e1.getDepartamento());
       System.out.println(e2.getDepartamento());
       
       
       // se deben agregar los colegas entre sí
       e1.agregarColega(e2);
       e2.agregarColega(e1);
    }
    
}
/// LAs relaciones en una empresa
// Tendremos un objeto empresa, con una composición con departamentos, esos departamentos tienen una agregación con empleados, 
//y esos empleados tienen una asociación con otros empleados (un empleado tiene una lista de colegas o tambien podría tener una lista de cliente)
