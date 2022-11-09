import Dominio.*;
import static Metodos.MetodosEmpresa.*;
import static Metodos.MetodosUsuario.*;
import static Metodos.MetodosAnimal.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        IniciarSesion();
        Empresa empresa = AltaEmpresa();
        AgregarDatos(empresa);
        Menu(empresa);
    }

    public static void Menu(Empresa empresa){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("MENÚ DE EMPRESA");
        System.out.println("Seleccione una opcion");
        System.out.println("1. Alta Animal");
        System.out.println("2. Vacunar Animal");
        System.out.println("3. Listar Animales");
        System.out.println("4. Buscar Animal");
        System.out.println("-----------------------------------");
        int e = scanner.nextInt();
        switch (e){
            case 0:break;
            case 1: AltaAnimal(empresa);
            break;
            case 2: ;
        }
    }



    public static void AgregarDatos(Empresa empresa){
        Ovino o1 = new Ovino(1,'m');
        Ovino o2 = new Ovino(2,'h');
        Ovino o3 = new Ovino(3,'h',1,2);
        Ovino o4 = new Ovino(4,'m',1,2);

        Bovino b1 = new Bovino(8,'m');
        Bovino b2 = new Bovino(9,'h');
        Bovino b3 = new Bovino(10,'h',8,9);
        Bovino b4 = new Bovino(11,'m',8,9);

        List<Ovino> listaO = new ArrayList<>();
        listaO.add(o1);
        listaO.add(o2);
        listaO.add(o3);
        listaO.add(o4);

        List<Bovino> listaB = new ArrayList<>();
        listaB.add(b1);
        listaB.add(b2);
        listaB.add(b3);
        listaB.add(b4);
        empresa.setOvinos(listaO);
        empresa.setBovinos(listaB);

    }

}
