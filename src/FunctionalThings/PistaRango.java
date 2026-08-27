package FunctionalThings;

import Interfaz.ProovedorPista;
public class PistaRango implements ProovedorPista{

    private int minId;
    private int maxId;

    public PistaRango(int cantidadPersonajes){
        minId=1;
        maxId = cantidadPersonajes;
    }

    @Override
    public void subirRango(int intento) {
        minId = intento + 1;

    }

    @Override
    public void bajarRango(int intento) {
        maxId = intento -1;
    }

    @Override
    public String rangoActual() {
        return "Esta entre el " + minId + " y el " + maxId;
    }
}
