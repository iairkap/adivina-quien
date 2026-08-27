package FunctionalThings;
import java.util.Random;


public class SeleccionPersonaje {

    private Random random = new Random();
    private  int cantidad;

    public void definirCantidad(int numero) {
        cantidad = numero;
    }

    public int seleccionarId() {
        //los id arrancan de 1,
        return random.nextInt(cantidad) + 1;

    }
}
