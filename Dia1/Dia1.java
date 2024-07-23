import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Camper {
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String acudiente;
    private String telefonoCelular;
    private String telefonoFijo;
    private String estado;
    private String riesgo;

    // Constructor
    public Camper(String identificacion, String nombres, String apellidos, String direccion, 
                  String acudiente, String telefonoCelular, String telefonoFijo, 
                  String estado, String riesgo) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.estado = estado;
        this.riesgo = riesgo;
    }

    // Getters y Setters
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    public String toString() {
        return "Camper{" +
                "identificacion='" + identificacion + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", acudiente='" + acudiente + '\'' +
                ", telefonoCelular='" + telefonoCelular + '\'' +
                ", telefonoFijo='" + telefonoFijo + '\'' +
                ", estado='" + estado + '\'' +
                ", riesgo='" + riesgo + '\'' +
                '}';
    }
}

public class CamperCRUD {
    private List<Camper> campers;
    private Scanner scanner;

    public CamperCRUD() {
        campers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addCamper() {
        System.out.print("Ingrese identificación: ");
        String identificacion = scanner.nextLine();
        System.out.print("Ingrese nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese acudiente: ");
        String acudiente = scanner.nextLine();
        System.out.print("Ingrese teléfono celular: ");
        String telefonoCelular = scanner.nextLine();
        System.out.print("Ingrese teléfono fijo: ");
        String telefonoFijo = scanner.nextLine();
        System.out.print("Ingrese estado: ");
        String estado = scanner.nextLine();
        System.out.print("Ingrese riesgo: ");
        String riesgo = scanner.nextLine();

        Camper camper = new Camper(identificacion, nombres, apellidos, direccion, acudiente, telefonoCelular, telefonoFijo, estado, riesgo);
        campers.add(camper);
        System.out.println("Camper agregado exitosamente.");
    }

    public void viewCampers() {
        if (campers.isEmpty()) {
            System.out.println("No hay campers registrados.");
        } else {
            for (Camper camper : campers) {
                System.out.println(camper);
            }
        }
    }

    public void updateCamper() {
        System.out.print("Ingrese identificación del camper a actualizar: ");
        String identificacion = scanner.nextLine();
        Camper camper = findCamperById(identificacion);

        if (camper == null) {
            System.out.println("Camper no encontrado.");
        } else {
            System.out.print("Ingrese nuevos nombres (actual: " + camper.getNombres() + "): ");
            String nombres = scanner.nextLine();
            System.out.print("Ingrese nuevos apellidos (actual: " + camper.getApellidos() + "): ");
            String apellidos = scanner.nextLine();
            System.out.print("Ingrese nueva dirección (actual: " + camper.getDireccion() + "): ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese nuevo acudiente (actual: " + camper.getAcudiente() + "): ");
            String acudiente = scanner.nextLine();
            System.out.print("Ingrese nuevo teléfono celular (actual: " + camper.getTelefonoCelular() + "): ");
            String telefonoCelular = scanner.nextLine();
            System.out.print("Ingrese nuevo teléfono fijo (actual: " + camper.getTelefonoFijo() + "): ");
            String telefonoFijo = scanner.nextLine();
            System.out.print("Ingrese nuevo estado (actual: " + camper.getEstado() + "): ");
            String estado = scanner.nextLine();
            System.out.print("Ingrese nuevo riesgo (actual: " + camper.getRiesgo() + "): ");
            String riesgo = scanner.nextLine();

            camper.setNombres(nombres);
            camper.setApellidos(apellidos);
            camper.setDireccion(direccion);
            camper.setAcudiente(acudiente);
            camper.setTelefonoCelular(telefonoCelular);
            camper.setTelefonoFijo(telefonoFijo);
            camper.setEstado(estado);
            camper.setRiesgo(riesgo);

            System.out.println("Camper actualizado exitosamente.");
        }
    }

    public void deleteCamper() {
        System.out.print("Ingrese identificación del camper a eliminar: ");
        String identificacion = scanner.nextLine();
        Camper camper = findCamperById(identificacion);

        if (camper == null) {
            System.out.println("Camper no encontrado.");
        } else {
            campers.remove(camper);
            System.out.println("Camper eliminado exitosamente.");
        }
    }

    private Camper findCamperById(String identificacion) {
        for (Camper camper : campers) {
            if (camper.getIdentificacion().equals(identificacion)) {
                return camper;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CamperCRUD camperCRUD = new CamperCRUD();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Camper");
            System.out.println("2. Ver Campers");
            System.out.println("3. Actualizar Camper");
            System.out.println("4. Eliminar Camper");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (option) {
                case 1:
                    camperCRUD.addCamper();
                    break;
                case 2:
                    camperCRUD.viewCampers();
                    break;
                case 3:
                    camperCRUD.updateCamper();
                    break;
                case 4:
                    camperCRUD.deleteCamper();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (option != 5);
    }
}