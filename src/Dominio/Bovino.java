package Dominio;

public class Bovino extends Animal{
    public Bovino(int id, char sexo) {
        super(id, sexo);
    }

    public Bovino(int id, char sexo, int padre, int madre) {
        super(id, sexo, padre, madre);
    }
}
