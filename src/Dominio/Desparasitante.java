package Dominio;

public class Desparasitante {
    private int id;
    private String nombre;
    private String fecha;
    private int idAnimal;

    public Desparasitante(int id, String nombre, String fecha, int idAnimal) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.idAnimal = idAnimal;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
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

    @Override
    public String toString() {
        return "Desparasitante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
