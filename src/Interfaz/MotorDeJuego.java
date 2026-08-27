package Interfaz;

public interface MotorDeJuego {
    void elegirPersonajeSecreto();
    boolean adivinar(int idIntentado);
    String pedirPista();
    int getCantidadPersonajes();
}

// Necesitamos una funcion que recorra una lista de objetos ya establecidos en el programa y me cree por cada objeto un personaje nuevo
// Necesito una funcion que me elija 1 de los personajes
// Necesito una funcion que permita definir si el usuario o computadora es el main (quien tiene que adivinar)


