package io.std.tp3ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP3ej1 {

  private static Scanner ingreso = new Scanner(System.in);

  private List<Estudiante> agregarEstudiante(List<Estudiante> lista) {
    int edad = 0;
    float promedio = 0;
    String apellidoNombre = null;
    Estudiante estudiante = null;
    System.out.print("Ingrese el apellido y nombre del estudiante: ");
    apellidoNombre = TP3ej1.ingreso.nextLine();
    System.out.print("Ingrese la edad del estudiante: ");
    edad = TP3ej1.ingreso.nextInt();
    TP3ej1.ingreso.nextLine();
    System.out.print("Ingrese el promedio del estudiante: ");
    promedio = TP3ej1.ingreso.nextFloat();
    TP3ej1.ingreso.nextLine();
    estudiante = new Estudiante(edad, promedio, apellidoNombre);
    lista.add(estudiante);
    return lista;
  }

  private void mostrarEstudiantes(List<Estudiante> lista) {
    for (Estudiante estudiante : lista) {
      if (estudiante.getPromedio() > 7.0f) {
        System.out.println("ESTUDIANTE: " + estudiante.getApellidoNombre() + " EDAD: " + estudiante.getEdad() + " PROMEDIO: " + estudiante.getPromedio());
      }
    }
  }

  private List<Estudiante> limpiarLista(List<Estudiante> lista) {
    Estudiante estudiante = null;
    for (int index = 0; index < lista.size(); index++) {
      estudiante = lista.get(index);
      if (estudiante.getPromedio() < 4.0f) {
        lista.remove(index);
      }
    }
    return lista;
  }

  private void mostrarLista(List<Estudiante> lista) {
    for (Estudiante estudiante : lista) {
      System.out.println("ESTUDIANTE: " + estudiante.getApellidoNombre() + " EDAD: " + estudiante.getEdad() + " PROMEDIO: " + estudiante.getPromedio());
    }
  }

  public static void main(String[] args) {
    char opcion = 'N';
    TP3ej1 obj = new TP3ej1();
    List<Estudiante> lista = new ArrayList<>();
    while (true) {
      System.out.print("¿Quiere cargar un estudiante? ([s]SI [n]NO) Respuesta: ");
      opcion = TP3ej1.ingreso.nextLine().charAt(0);
      if (opcion == 's') {
        lista = obj.agregarEstudiante(lista);
      } else if (opcion == 'n') {
        break;
      }
    }
    System.out.println("--- LISTA DE ESTUDIANTES CON PROMEDIO MAYOR A 7.0 ---");
    obj.mostrarEstudiantes(lista);
    lista = obj.limpiarLista(lista);
    System.out.println("--- LISTA DE ESTUDIANTES ---");
    obj.mostrarLista(lista);
    TP3ej1.ingreso.close();
  }
}
