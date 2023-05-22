package org.narvasoft;

import controller.Server;
import java.util.Scanner;
import model.User;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while (exit == false) {
        Server request;
        System.out.println("---------------------------------------------------");
        System.out.println("1. Leer usuarios existentes");
        System.out.println("2. Encontrar un usuario");
        System.out.println("3. Crear un usuario");
        System.out.println("4. Actualizar un usuario");
        System.out.println("5. Eliminar un usuario");
        System.out.println("6. Salir");
        System.out.println("---------------------------------------------------");
        System.out.print("Ingrese una opción: ");
        int option = sc.nextInt();

        switch (option) {
        case 1:
            request =
            new Server(
                "GET",
                "http://localhost:/api/users",
                "Content-Type: application/json",
                ""
            );
          System.out.println(request); //respuesta del servidor
            break;
        case 2:
            System.out.print("Ingrese el id del usuario: ");
            int id = sc.nextInt();
            request =
            new Server(
                "GET",
                "http://localhost:8080/api/users",
                "Content-Type: application/json",
                "",
                id
            );
          System.out.println(request); //respuesta del servidor
            break;
        case 3:
            System.out.print("Ingrese el nombre del usuario: ");
            String name = sc.next();
            System.out.print("Ingrese el correo del usuario: ");
            String email = sc.next();
            System.out.print("Ingrese el teléfono del usuario: ");
            String phone = sc.next();
            request =
            new Server(
                "POST",
                "http://localhost:8080/api/users",
                "Content-Type: application/json",
                name + "," + email + "," + phone
            );
          System.out.println(request); //respuesta del servidor
            break;
        case 4:
            System.out.print("Ingrese el id del usuario: ");
        int id2 = sc.nextInt();
            System.out.print("Ingrese el nombre del usuario: ");
            String name2 = sc.next();
            System.out.print("Ingrese el correo del usuario: ");
            String email2 = sc.next();
            System.out.print("Ingrese el teléfono del usuario: ");
            String phone2 = sc.next();
            request =
            new Server(
                "PUT",
                "http://localhost:8080/api/users",
                "Content-Type: application/json",
                name2 + "," + email2 + "," + phone2,
                id2
            );
          System.out.println(request); //respuesta del servidor
            break;
        case 5:
            System.out.print("Ingrese el id del usuario: ");
            int id3 = sc.nextInt();
            request =
            new Server(
                "DELETE",
            "http://localhost:8080/api/users",
                "Content-Type: application/json",
                "",
                id3
            );
          System.out.println(request); //respuesta del servidor
            break;
        case 6:
            exit = true;
            break;
        }
    }
    }
}