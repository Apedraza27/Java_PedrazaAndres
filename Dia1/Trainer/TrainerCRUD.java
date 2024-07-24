package trainer 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainerCRUD{
    private List<Trainer> trainers;
    private Scanner sc;

    public TrainerCRUD(){
        trainers = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addTrainer() {
        System.out.print("Ingrese identificación: ");
        String identificacion = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese teléfono celular: ");
        String telefonoCelular = scanner.nextLine();
        System.out.print("Ingrese teléfono fijo: ");
        String telefonoFijo = scanner.nextLine();

        Trainer camper = new Trainer(identificacion, nombre, direccion, telefonocelular, telefonofijo);
        trainers.add(campetrainerr);
        System.out.println("trainer agregado exitosamente.");
    }

    public static void main(String[] args) {
        TrainerCRUD trainerCRUD = new TrainerCRUD();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n Menu:");
            System.out.println("1. Ver grupos según entrenador aignado");
            System.out.println("2. Ingresar notas de campers");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (option) {
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (option != 3);
    }
}
