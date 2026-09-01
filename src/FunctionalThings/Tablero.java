package FunctionalThings;

import Interfaz.Filtro;
import Things.Personaje;
import java.util.ArrayList;
import java.util.List;


public class Tablero {

    private List<Personaje> candidatos;

    public Tablero(List<Personaje> listaOriginal) {
        this.candidatos = new ArrayList<>(listaOriginal);
    }


    public void aplicarFiltro(Filtro f) {
       candidatos= f.aplicar(candidatos);
    }

    public List<Personaje> getCandidatos() {
        return candidatos;
    }

    public int cantidadCandidatos() {
        return candidatos.size();
    }

    public boolean tieneCandidato(String nombre) {
        for (Personaje p : candidatos) {
            if (p.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;


    }
}
