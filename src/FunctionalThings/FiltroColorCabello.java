package FunctionalThings;

import Interfaz.Filtro;
import Things.Personaje;

import java.util.ArrayList;
import java.util.List;

public class FiltroColorCabello implements Filtro {
    private final Personaje.ColorCabello  color ;

    public FiltroColorCabello(Personaje.ColorCabello color){
        this.color = color;
    }

    @Override
    public List<Personaje> aplicar(List<Personaje> candidatos){
        List<Personaje> resultado = new ArrayList<>();
        for (Personaje p : candidatos){
            if (p.getColorCabello() == color){
                resultado.add(p);

            }
        }
        return resultado;
    }
}
