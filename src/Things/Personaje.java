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
    private boolean idAsignado = false;


    public Personaje( String nombre, String apellido, Boolean elegido, Boolean calvicie, Boolean lentes, Boolean male, ColorCabello colorCabello) {
        this.nombre = nombre;
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

    public void setId(int id) {
        if (!idAsignado) {
            this.id = id;
            idAsignado = true;
        } else {
            throw new IllegalStateException("mensaje");
        }

    }

    public void setElegido(Boolean elegido) {
        this.elegido = elegido;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getCalvicie() {
        return calvicie;
    }

    public Boolean getLentes() {
        return lentes;
    }

    public Boolean getMale() {
        return male;
    }

    public ColorCabello getColorCabello() {
        return colorCabello;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

}

