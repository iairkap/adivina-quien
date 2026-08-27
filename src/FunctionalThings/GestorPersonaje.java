package FunctionalThings;

import Things.Personaje;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonaje {
    private List <Personaje> personajes;


    public GestorPersonaje(){
        personajes = crearPersonajes();
    }


    private List <Personaje> crearPersonajes(){
        List<Personaje> lista = new ArrayList<>();
        lista.add(new Personaje(1, "Jacobo", "Winograd", false, false, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje(2, "Graciela", "Alfano", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(3, "Susana", "Giménez", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(4, "Mirtha", "Legrand", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(5, "Marcelo", "Tinelli", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje(6, "Jorge", "Rial", false, false, true, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje(7, "Silvio", "Soldán", false, true, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje(8, "Silvia", "Süller", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(9, "Nazarena", "Vélez", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(10, "Flavio", "Mendoza", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje(11, "Alejandro", "Wiebe", false, false, false, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje(12, "Carolina", "Ardohain", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(13, "Wanda", "Nara", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(14, "Guillermo", "Francella", false, false, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje(15, "Nicole", "Neumann", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(16, "Guido", "Süller", false, false, false, true, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(17, "Mariano", "Iúdica", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje(18, "Diego", "Brancatelli", false, false, false, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje(19, "Rodrigo", "Lussich", false, false, true, true, Personaje.ColorCabello.CASTAÑO));
        lista.add(new Personaje(20, "Yanina", "Latorre", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(21, "Ángel", "de Brito", false, false, true, true, Personaje.ColorCabello.MOROCHO));
        lista.add(new Personaje(22, "Karina", "Jelinek", false, false, false, false, Personaje.ColorCabello.RUBIO));
        lista.add(new Personaje(23, "Fabián", "Doman", false, false, true, true, Personaje.ColorCabello.MOROCHO));

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
