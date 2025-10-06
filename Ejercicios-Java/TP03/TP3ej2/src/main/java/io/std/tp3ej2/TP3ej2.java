package io.std.tp3ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author DEV sprout
 */
public class TP3ej2 {

  private static Scanner ingreso = new Scanner(System.in);

  private List<String> cargarTarea(List<String> lista) {
    String tarea = null;
    System.out.print("Ingrese el nombre de la tarea: ");
    tarea = TP3ej2.ingreso.nextLine();
    lista.add(tarea);
    return lista;
  }

  private List<String> cargarTareaPosicion(List<String> lista, int posicion) {
    String tarea = null;
    System.out.print("Ingrese el nombre de la tarea: ");
    tarea = TP3ej2.ingreso.nextLine();
    lista.set(posicion, tarea);
    return lista;
  }

  private List<String> posicionarTarea(List<String> lista) {
    int posicion = 0;
    while (true) {
      System.out.print("Ingrese una posicion entre 1 y " + lista.size() + ": ");
      posicion = TP3ej2.ingreso.nextInt() - 1;
      TP3ej2.ingreso.nextLine();
      if ((posicion >= 0) && (posicion < lista.size())) {
        break;
      } else {
        System.out.println("Error, valor incorrecto.");
      }
    }
    lista = this.cargarTareaPosicion(lista, posicion);
    return lista;
  }

  private List<String> eliminarTarea(List<String> lista) {
    String tarea = null;
    System.out.print("Ingrese el nombre de una tarea para eliminar: ");
    tarea = TP3ej2.ingreso.nextLine();
    lista.remove(tarea);
    return lista;
  }

  public static void main(String[] args) {
    int opcion = 0;
    boolean control = true;
    TP3ej2 obj = new TP3ej2();
    List<String> listaTareas = new ArrayList<String>();
    while (control) {
      System.out.print("Elija una opcion [1]Cargar tarea [2]Cargaar tarea en posicion especifica [3]Eliminar tarea [_]Salir: ");
      opcion = TP3ej2.ingreso.nextInt();
      TP3ej2.ingreso.nextLine();
      switch(opcion) {
        case 1:
          listaTareas = obj.cargarTarea(listaTareas);
          break;
        case 2:
          listaTareas = obj.posicionarTarea(listaTareas);
          break;
        case 3:
          listaTareas = obj.eliminarTarea(listaTareas);
          break;
        default:
          control = false;
      }
    }
    Collections.sort(listaTareas);
    System.out.println("--- LISTA DE TAREAS ---");
    for (String item : listaTareas) {
      System.out.println("Tarea: " + item);
    }
  }
}
