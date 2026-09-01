package Interfaz;
import Things.Personaje;
import java.util.List;
public interface Filtro {
    List<Personaje> aplicar(List<Personaje> candidatos);
}