package FunctionalThings;


import Interfaz.Adivinador;

public class AdivinadorBinario implements Adivinador {

    private int minId;
    private int maxId;
    private int intentoActual;


    public AdivinadorBinario(int cantidadPersonajes){
        minId = 1;
        maxId = cantidadPersonajes;
    }

    public int siguienteIntento(){
        intentoActual = (minId + maxId) / 2;
        return intentoActual;
    }

    public void subirRango (){
        minId = intentoActual + 1;
    }

    @Override
    public void bajarRango() {
        maxId = intentoActual - 1;
    }
}
