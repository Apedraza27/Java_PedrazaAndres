/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia3;

import java.util.List;
import java.util.Date;
/**
 *
 * @author andre
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellidos;
    private String direccion;

public class Hospital {
    private int idHospital;
    private String nombre;
    private String direccion;
    private List<Departamento> departamentos;
}

public class Pabellon {
    private int idPabellon;
    private String nombre;
    private int capacidad;
    private Hospital hospital;
}

public class Paciente extends Persona {
    private int idPaciente;
    private int edad;
    private Date fechaNacimiento;
    private Date fechaIngresoHospital;
    private Pabellon pabellon;
    
    public void calcularEdad() {
        // Implementar lógica para calcular la edad
    }
}

public class Departamento {
    private int idDepartamento;
    private Hospital hospital;
    private List<PersonalHospital> personalHospital;
}

public class PersonalHospital extends Persona {
    private int idPersonalHospital;
    private Date fechaVinculacion;
    private int salario;
    private TipoPersonal tipo;
    private Hospital hospital;

    public enum TipoPersonal {
        ADMINISTRATIVO, TECNICO, OPERACIONES
    }
}

public class Doctor extends PersonalHospital {
    private int idDoctor;
    private TipoDoctor tipo;

    public enum TipoDoctor {
        ASOCIADO, JUNIOR
    }

    // Constructor, getters y setters
}


public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.setIdHospital(1);
        hospital.setNombre("Hospital General");
        hospital.setDireccion("123 Calle Principal");

        Persona persona = new Persona();
        persona.setIdPersona(1);
        persona.setNombre("Juan");
        persona.setApellidos("Pérez");
        persona.setDireccion("456 Calle Secundaria");

        Pabellon pabellon = new Pabellon();
        pabellon.setIdPabellon(1);
        pabellon.setNombre("Pabellón A");
        pabellon.setCapacidad(100);
        pabellon.setHospital(hospital);

        Paciente paciente = new Paciente();
        paciente.setIdPaciente(1);
        paciente.setNombre("Ana");
        paciente.setApellidos("García");
        paciente.setDireccion("789 Calle Tercera");
        paciente.setFechaNacimiento(new Date(90, 5, 15)); // 15 de junio de 1990
        paciente.setFechaIngresoHospital(new Date());
        paciente.setPabellon(pabellon);
        paciente.calcularEdad();
    }
}

