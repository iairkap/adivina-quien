package Things;

import FunctionalThings.Tablero;

public abstract class Jugador {

    protected Tablero tablero;
    protected Personaje personajeSecreto;
    protected String ultimaAdivina;

    public Jugador(Tablero tablero){
        this.tablero = tablero;
    }

    public void setPersonajeSecreto(Personaje p) {
        this.personajeSecreto = p;
    }

    public Personaje getPersonajeSecreto() {
        return personajeSecreto;
    }

    public String getUltimaAdivina() {
        return ultimaAdivina;
    }

    public abstract boolean jugarTurno();
}
