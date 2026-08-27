package FunctionalThings;

import Interfaz.MotorDeJuego;
import Interfaz.ModoDeJuego;

import java.util.Scanner;

public class ModoUsuarioAdivina implements ModoDeJuego{

    private Scanner scanner;
    private MotorDeJuego motor;

    public ModoUsuarioAdivina(Scanner scanner){
        this.scanner = scanner;
        this.motor = new MotorJuegoImplementacion();
    }

    public void jugar(){
        motor.elegirPersonajeSecreto();
        int cantidad = motor.getCantidadPersonajes();
        boolean acerto = false;

        System.out.println("Elegí un personaje del 1 al " + cantidad + ". Escribí 'p' para pista o ingresá un id.");

        while (!acerto){
            System.out.print("> ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("p") || entrada.equalsIgnoreCase("pista")) {
                System.out.println(motor.pedirPista());
                continue;
            }

            try {
                int intento = Integer.parseInt(entrada);
                if (intento < 1 || intento > cantidad) {
                    System.out.println("Ingresá un id entre 1 y " + cantidad + ".");
                    continue;
                }
                acerto = motor.adivinar(intento);
                System.out.println(acerto ? "¡Acertaste!" : "No es ese.");

            } catch (NumberFormatException e) {
                System.out.println("Eso no es un id válido ni 'p'. Probá de nuevo.");
            }
        }
    }
}
