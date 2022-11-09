package Metodos;
import Dominio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Metodos.MetodosEmpresa.*;

public class MetodosAnimal {

    public static Animal BuscarAnimal(int pId, Empresa empresa){
        for (Ovino unOvino: empresa.getOvinos()) {
            if (unOvino.getId() == pId){
                return unOvino;
            }
        }
        for (Bovino unBovino: empresa.getBovinos()) {
            if (unBovino.getId() == pId){
                return unBovino;
            }
        }
        return null;
    }

    public static void AltaAnimal(Empresa empresa){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ALTA ANIMAL");
        System.out.println("Seleccione si el animal es Ovino o Bovino");
        System.out.println("1.Ovino");
        System.out.println("2.Bovino");
        int tipo = scanner.nextInt();
        System.out.println("Ingrese sexo ('M' o 'H')");
        String s = scanner.nextLine();
        char sexo = s.toUpperCase().charAt(0);
        if (tipo == 1){
            System.out.println("Seleccionar padre del Ovino");
            ListarOvinosXSexo(empresa,'M');
            int padre = scanner.nextInt();
            System.out.println("Seleccionar madre del Ovino");
            ListarOvinosXSexo(empresa,'H');
            int madre = scanner.nextInt();
            Animal animal = new Animal(sexo,padre,madre);
        }
        else if (tipo == 2){
            System.out.println("Seleccionar padre del Bovino");
            ListarBovinosXSexo(empresa,'M');
            int padre = scanner.nextInt();
            System.out.println("Seleccionar madre del Bovino");
            ListarBovinosXSexo(empresa,'H');
            int madre = scanner.nextInt();
            Animal animal = new Animal(sexo,padre,madre);
        }
        else System.out.println("Ingrese un valor valido");
    }

    public static void VacunarAnimal(Empresa empresa){
        Scanner scanner = new Scanner(System.in);
        System.out.println("VACUNACION!!");
        System.out.println("Seleccione al animal que desea vacunar");
        ListarAnimales(empresa);
        int id = scanner.nextInt();
        Animal unAnimal = BuscarAnimal(id,empresa);
        System.out.println("Ingrese el nombre de la vacuna");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha");
        String fecha = scanner.nextLine();

        Vacuna vacuna = new Vacuna(nombre,fecha,unAnimal);
    }
}
