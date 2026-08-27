import FunctionalThings.ModoComputadoraAdivina;
import FunctionalThings.ModoUsuarioAdivina;
import Interfaz.ModoDeJuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Yo elijo un personaje, vos adivinás");
        System.out.println("2 - Vos pensás un personaje, yo adivino");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        ModoDeJuego modo = (opcion == 1)
                ? new ModoUsuarioAdivina(scanner)
                : new ModoComputadoraAdivina(scanner);

        modo.jugar();
        scanner.close();
    }
}