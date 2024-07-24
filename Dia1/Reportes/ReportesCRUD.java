package reportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportesCRUD{
    private List<Reportes> repo;
    private Scanner sc;

    public ReportesCRUD(){
        repo = new ArrayList<>();
        sc = new Scanner(Aysten.in);
    }

    public static void main(String[] args) {
        ReportesCRUD reportesCRUD = new ReportesCRUD();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Listar los campers que se encuentren en estado de inscrito");
            System.out.println("2. Listar los campers que aprobaron el examen inicial");
            System.out.println("3. Listar los entrenadores que se encuentran trabajando con CampusLands");
            System.out.println("4. Listar los campers que cuentan con bajo rendimiento");
            System.out.println("5. Listar los campers y trainers que se encuentren asociados a una ruta de entrenamiento");
            System.out.println("6. Mostrar cuantos campers perdieron y aprobaron cada uno de los módulos teniendo en cuenta la ruta de entrenamiento y el entrenador encargado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine();  // Clear the buffer

            switch (option) {
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (option != 7);
    }
}