package Dominio;

import java.util.List;

public class Empresa {
    private int id;
    private String nombre;
    private String ciudad;
    private int contacto;
    private List<Ovino> ovinos;
    private List<Bovino> bovinos;
    private int numId = 1;

    public Empresa(String nombre, String ciudad, int contacto, List<Ovino> ovinos, List<Bovino> bovinos) {
        this.id = numId++;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.contacto = contacto;
        this.ovinos = ovinos;
        this.bovinos = bovinos;
    }

    public List<Ovino> getOvinos() {
        return ovinos;
    }

    public void setOvinos(List<Ovino> ovinos) {
        this.ovinos = ovinos;
    }

    public List<Bovino> getBovinos() {
        return bovinos;
    }

    public void setBovinos(List<Bovino> bovinos) {
        this.bovinos = bovinos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", contacto=" + contacto +
                '}';
    }

    public Empresa(String nombre, String ciudad, int contacto) {
        this.id = numId++;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.contacto = contacto;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

}
