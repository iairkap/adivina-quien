package Things;

import FunctionalThings.InputHelper;
import FunctionalThings.Tablero;

import java.util.Scanner;

public class JugadorHumano extends Jugador{

    private Scanner scanner;
    public JugadorHumano (Tablero tablero, Scanner scanner){
        super(tablero);
        this.scanner = scanner;
    }

    @Override
    public boolean jugarTurno() {
        System.out.println("\n--- Tu turno ---");
        System.out.println("1. Aplicar un filtro a tu tablero");
        System.out.println("2. Adivinar el personaje del rival");
        System.out.print("Elegí una opción (1 o 2): ");

        int opcion = InputHelper.leerOpcion(scanner, 1, 2);

        if (opcion == 1){
            aplicarFiltrosConsola();
            return false;
        } else if (opcion == 2 ){
            return adivinarPersonaje();
        }



        return false;
    }
    private boolean adivinarPersonaje(){
        System.out.println("Ingresa el nombre del personaje: ");
        String nombre  = scanner.nextLine();
        this.ultimaAdivina = nombre;
        return true;

    }

    private void aplicarFiltrosConsola(){
        System.out.println("\n--- Elegí un filtro ---");
        System.out.println("1. Género");
        System.out.println("2. Calvicie");
        System.out.println("3. Lentes");
        System.out.println("4. Color de cabello");
        int filtro = InputHelper.leerOpcion(scanner, 1, 4);

        if (filtro == 1) {
            System.out.println("1. Masculino");
            System.out.println("2. Femenino");
            int valor = InputHelper.leerOpcion(scanner, 1, 2);
            tablero.aplicarFiltro(new FiltroGenero(valor == 1));
        } else if (filtro == 2) {
            System.out.println("1. Con calvicie");
            System.out.println("2. Sin calvicie");
            int valor = InputHelper.leerOpcion(scanner, 1, 2);
            tablero.aplicarFiltro(new FiltroCalvicie(valor == 1));
        } else if (filtro == 3) {
            System.out.println("1. Con lentes");
            System.out.println("2. Sin lentes");
            int valor = InputHelper.leerOpcion(scanner, 1, 2);
            tablero.aplicarFiltro(new FiltroLentes(valor == 1));
        } else if (filtro == 4) {
            System.out.println("1. Rubio");
            System.out.println("2. Castaño");
            System.out.println("3. Morocho");
            int valor = InputHelper.leerOpcion(scanner, 1, 3);
            Personaje.ColorCabello color = valor == 1 ? Personaje.ColorCabello.RUBIO
                    : valor == 2 ? Personaje.ColorCabello.CASTAÑO
                    : Personaje.ColorCabello.MOROCHO;
            tablero.aplicarFiltro(new FiltroColorCabello(color));
        }
    }
}
