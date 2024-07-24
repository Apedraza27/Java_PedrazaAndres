package camper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoordinadorCRUD{
    private List<Coordinador> cordi;
    private Scanner sc;

    public CoordinadorCRUD(){
        cordi = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        CoordinadorCRUD CoordinadorCRUD = new CoordinadorCRUD();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n Que desea realizar:");
            System.out.println("1. Ver opciones sobre los campers");
            System.out.println("2. Ver opciones sobre los trainers");
            System.out.println("3. Grupos (creacion, vista...)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (option) {
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (option != 4);
    } 
}