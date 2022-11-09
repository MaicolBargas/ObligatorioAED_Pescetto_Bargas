package Dominio;

public class Ovino extends Animal{

    public Ovino(int id, char sexo) {
        super(id, sexo);
    }

    public Ovino(int id, char sexo, int padre, int madre) {
        super(id, sexo, padre, madre);
    }
}
