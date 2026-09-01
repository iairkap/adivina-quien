package FunctionalThings;

import java.util.Scanner;

public class InputHelper {


    public static int leerOpcion(Scanner scanner, int min, int max) {
        int opcion = -1;
        while (opcion < min || opcion > max) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion < min || opcion > max) {
                    System.out.println("Ingresá una opción entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor no válido.");
            }
        }
        return opcion;
    }

}
