package FunctionalThings;

import Interfaz.Adivinador;
import Interfaz.ModoDeJuego;
import Things.Personaje;

import java.util.List;
import java.util.Scanner;

public class ModoComputadoraAdivina implements ModoDeJuego {

    private Scanner scanner;
    private GestorPersonaje gestor;
    private Adivinador adivinador;

    public ModoComputadoraAdivina(Scanner scanner) {
        this.scanner = scanner;
        this.gestor = new GestorPersonaje();
        this.adivinador = new AdivinadorBinario(gestor.getPersonajes().size());
    }

    public void jugar() {
        int cantidad = gestor.getPersonajes().size();
        System.out.println("Pensá un personaje del 1 al " + cantidad + ". Yo voy a adivinarlo.");

        boolean acerto = false;
        while (!acerto) {
            int intento = adivinador.siguienteIntento();
            Personaje personaje = gestor.buscarPersonajePorID(intento);
            System.out.println("¿Es " + personaje.getNombre() + " " + personaje.getApellido()
                    + " (id " + intento + ")? (s = sí, m = más alto, b = más bajo)");
            String respuesta = scanner.next().toLowerCase();

            switch (respuesta) {
                case "s":
                    acerto = true;
                    System.out.println("¡Listo, era ese!");
                    break;
                case "m":
                    adivinador.subirRango();
                    break;
                case "b":
                    adivinador.bajarRango();
                    break;
                default:
                    System.out.println("Respuesta no válida. Usá s, m o b.");
            }
        }
    }
}