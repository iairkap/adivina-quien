package FunctionalThings;

import Things.Personaje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestorPersonaje {
    private List <Personaje> personajes;


    public GestorPersonaje(){
        personajes = crearPersonajes();
    }


    private List <Personaje> crearPersonajes(){

        int contadorId = 1;
        List<Personaje> lista = new ArrayList<>();
        lista.add(new Personaje("Jacobo", "Winograd", false, false, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje("Graciela", "Alfano", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Susana", "Giménez", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Mirtha", "Legrand", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Marcelo", "Tinelli", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje("Jorge", "Rial", false, false, true, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje("Silvio", "Soldán", false, true, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje("Silvia", "Süller", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Nazarena", "Vélez", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Flavio", "Mendoza", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje("Alejandro", "Wiebe", false, false, false, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje("Carolina", "Ardohain", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Wanda", "Nara", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Guillermo", "Francella", false, false, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje("Nicole", "Neumann", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Guido", "Süller", false, false, false, true, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Mariano", "Iúdica", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje("Diego", "Brancatelli", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje("Rodrigo", "Lussich", false, false, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje("Yanina", "Latorre", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Ángel", "de Brito", false, false, true, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje("Karina", "Jelinek", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje("Fabián", "Doman", false, false, true, true, Personaje.ColorCabello.MOROCHO));

        lista.sort(Comparator.comparing(Personaje::getMale));
        for (int i = 0; i < lista.size() ; i++) {
            lista.get(i).setId(i + 1);
        }
        return lista;
    }
    public List <Personaje> getPersonajes(){
        return personajes;
    }

    public Personaje buscarPersonajePorID(int id){
        for (Personaje p : personajes){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

}
