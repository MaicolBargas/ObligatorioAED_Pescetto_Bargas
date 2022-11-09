package Dominio;

public class Vacuna {
    private int id;
    private String nombre;
    private String fecha;
    private Animal animal;

    private static int numId = 1;


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Vacuna(String nombre, String fecha,Animal animal) {
        this.id = numId++;
        this.nombre = nombre;
        this.fecha = fecha;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Vacuna{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
