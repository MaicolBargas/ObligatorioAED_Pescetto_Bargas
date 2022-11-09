package Metodos;

import Dominio.Usuario;

import java.util.Scanner;

public class MetodosUsuario {
    public static void IniciarSesion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese contraseña");
        String password = scanner.nextLine();
        Usuario usuario = new Usuario(1,nombre,password);
        System.out.println("Inicio de sesion exitoso!!");
    }
}
