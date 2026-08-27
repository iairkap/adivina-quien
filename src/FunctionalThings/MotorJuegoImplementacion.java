package FunctionalThings;

import Interfaz.MotorDeJuego;
import Things.Personaje;

public class MotorJuegoImplementacion implements MotorDeJuego {

    private GestorPersonaje gestor;
    private SeleccionPersonaje seleccion;
    private Personaje secreto;
    private PistaRango pista;

    public MotorJuegoImplementacion() {
        gestor = new GestorPersonaje();
        seleccion = new SeleccionPersonaje();
    }

    public void elegirPersonajeSecreto() {
        seleccion.definirCantidad(gestor.getPersonajes().size());
        int id = seleccion.seleccionarId();
        secreto = gestor.buscarPersonajePorID(id);
        secreto.setElegido(true);
        pista = new PistaRango(gestor.getPersonajes().size());
    }
    public boolean adivinar(int idIntentado) {
        if (idIntentado < 1 || idIntentado > getCantidadPersonajes()) {
            return false;
        }
        if (idIntentado == secreto.getId()) {
            return true;
        } else if (idIntentado < secreto.getId()) {
            pista.subirRango(idIntentado);
        } else {
            pista.bajarRango(idIntentado);
        }
        return false;
    }

    public String pedirPista() {
        return pista.rangoActual();
    }

    public int getCantidadPersonajes() {
        return gestor.getPersonajes().size();
    }
}