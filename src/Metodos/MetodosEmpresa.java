package Metodos;
import Dominio.Animal;
import Dominio.Bovino;
import Dominio.Empresa;
import Dominio.Ovino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosEmpresa {

    public static Empresa AltaEmpresa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ALTA EMPRESA");
        System.out.println("Ingrese nombre de la empresa");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = scanner.nextLine();
        System.out.println("Ingrese numero de telefono");
        int telefono = scanner.nextInt();

        Empresa empresa = new Empresa(nombre,ciudad,telefono);
        return empresa;
    }
    public static List<Animal> ListarAnimales(Empresa empresa){
        List<Animal> lista = new ArrayList<Animal>();
        for (Ovino unOvino: empresa.getOvinos()) {
            lista.add(unOvino);
        }
        for (Bovino unBovino: empresa.getBovinos()) {
            lista.add(unBovino);
        }
        return lista;
    }

    public static List<Ovino> ListarOvinos(Empresa empresa){
        List<Ovino> lista = new ArrayList<Ovino>();
        for (Ovino unOvino: empresa.getOvinos()) {
                lista.add(unOvino);
        }
        return lista;
    }
    public static List<Bovino> ListarBovinos(Empresa empresa){
        List<Bovino> lista = new ArrayList<Bovino>();
        for (Bovino unBovino: empresa.getBovinos()) {
                lista.add(unBovino);
        }
        return lista;
    }
    public static List<Ovino> ListarOvinosXSexo(Empresa empresa,char a){
        List<Ovino> lista = new ArrayList<Ovino>();
        for (Ovino unOvino: empresa.getOvinos()) {
            if (unOvino.getSexo() == a)
            {
                lista.add(unOvino);
            }
        }
        return lista;
    }

    public static List<Bovino> ListarBovinosXSexo(Empresa empresa,char a){
        List<Bovino> lista = new ArrayList<Bovino>();
        for (Bovino unBovino: empresa.getBovinos()) {
            if (unBovino.getSexo() == a)
            {
                lista.add(unBovino);
            }
        }
        return lista;
    }
}
