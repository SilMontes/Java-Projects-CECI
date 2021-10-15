
package practicarelaciones;

import java.time.LocalDate;
import practicarelaciones.Entidades.Medico;
import practicarelaciones.Entidades.Paciente;

public class PracticaRelaciones {

    
    public static void main(String[] args) {
        Medico medico1 = new Medico("Juan","cardiologo");
        Medico medico2 = new Medico("Jose","Gastroenterologo");
        
        Paciente paciente1 = new Paciente("Derek",LocalDate.of(1990,1,1),80,180);
        Paciente paciente2 = new Paciente("Mike",LocalDate.of(1990,1,1),70,170);
        
        medico1.agregarPaciente(paciente1);
        paciente1.agregarMedico(medico1); ///DEBO SAGREGAR TANTO EL MEDICO AL PACIENTE COMO EL PACIENTE AL MEDICO
        
        medico2.agregarPaciente(paciente2);
        paciente2.agregarMedico(medico2); 
        
        medico2.agregarPaciente(paciente1);
        paciente1.agregarMedico(medico2); 
        
        System.out.println(medico1.getNombre()+" "+medico1.getEspecialidad());
        for (Paciente paciente:medico1.gePacientes()){
            System.out.println(paciente.getNombre());
        }
        
        System.out.println(medico2.getNombre()+" "+medico2.getEspecialidad());
        for (Paciente paciente:medico2.gePacientes()){
            System.out.println(paciente.getNombre());
        }
        
        medico1.agregarPaciente(paciente1);
    }
    
}
