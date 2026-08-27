package Things;

public class Personaje {
    private int id;
    private String nombre;
    private String apellido;
    private Boolean elegido;
    private Boolean calvicie;
    private Boolean lentes;
    private Boolean male;
    private ColorCabello colorCabello;


    public Personaje(int id, String nombre, String apellido, Boolean elegido, Boolean calvicie, Boolean lentes, Boolean male, ColorCabello colorCabello) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
        this.elegido = elegido;
        this.calvicie = calvicie;
        this.lentes = lentes;
        this.male = male;
        this.colorCabello = colorCabello;


    }
    public enum  ColorCabello {
        RUBIO,
        CASTAÑO,
        MOROCHO

    }

    public void setElegido(Boolean elegido) {
        this.elegido = elegido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

}

