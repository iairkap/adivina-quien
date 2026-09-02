package FunctionalThings;

import Interfaz.Filtro;
import Things.Personaje;

import java.util.ArrayList;
import java.util.List;


public class FiltroGenero implements Filtro{
    private final boolean esMale;

    public FiltroGenero(boolean esMale){
        this.esMale = esMale;
    }
    @Override
    public List<Personaje>aplicar(List<Personaje>candidatos){
        List<Personaje> resultado = new ArrayList<>();
        for(Personaje p : candidatos){
            Boolean valor =p.getMale();
            if(valor != null && valor == esMale){
                resultado.add(p);
            }
        }
        return resultado;
    }
}
