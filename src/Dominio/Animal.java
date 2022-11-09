package Dominio;

public class Animal {
    private int id;
    private char sexo;
    private int padre;
    private int madre;
    private static int numId = 1;

    public Animal(char sexo) {
        this.id = numId++ ;
        this.sexo = sexo;
    }

    public Animal(char sexo, int padre, int madre) {
        this.id = numId++ ;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public int getMadre() {
        return madre;
    }

    public void setMadre(int madre) {
        this.madre = madre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", sexo=" + sexo +
                ", padre=" + padre +
                ", madre=" + madre +
                '}';
    }
}
