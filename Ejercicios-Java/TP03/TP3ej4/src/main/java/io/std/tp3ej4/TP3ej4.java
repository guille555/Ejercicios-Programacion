package io.std.tp3ej4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TP3ej4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<Character, ArrayList<String>> nombresMap = new HashMap<>();
    System.out.print("Cuantos nombres quiere ingresar? ");
    int cantidad = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < cantidad; i++) {
      System.out.print("Ingrese el nombre " + (i + 1) + ": ");
      String nombre = scanner.nextLine();
      char inicial = Character.toUpperCase(nombre.charAt(0));
      nombresMap.putIfAbsent(inicial, new ArrayList<>());
      nombresMap.get(inicial).add(nombre);
    }
    System.out.print("\nIngrese una letra para mostrar los nombres: ");
    char letra = Character.toUpperCase(scanner.next().charAt(0));
    if (nombresMap.containsKey(letra)) {
      System.out.println("Nombre que empieza con '" + letra + "': " + nombresMap.get(letra));
    } else {
      System.out.println("No hay nombres que empiecen con la letra '" + letra + "'.");
    }
  }
}

/*
Explicar los siguientes métodos

.toUpperCase() (Convierte todos los caracteres a mayúsculas)

.putIfAbsent() (Agrega un elemento al mapa si su "clave" no existe)

.toLowerCase() (Convierte todos los caracteres a minúsculas)

.toCharArray() (Convierte un objeto de tipo String en un vector de caracteres (char[]))

*/
