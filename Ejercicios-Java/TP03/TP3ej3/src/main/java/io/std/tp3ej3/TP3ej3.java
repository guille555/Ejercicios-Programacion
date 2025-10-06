package io.std.tp3ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP3ej3 {

  private static Scanner ingreso = new Scanner(System.in);

  public static void main(String[] args) {
    boolean control = true;
    boolean controlInicial = true;
    boolean controlCarga = false;
    float promedio;
    Integer numeroMayor = 0;
    Integer numeroMenor = null;
    Integer acumulador = 0;
    Integer temporal = null;
    List<Integer> listaNumeros = new ArrayList<>();
    while (control) {
      System.out.print("Cargue un numero positivo (mayor o igual a cero): ");
      temporal = TP3ej3.ingreso.nextInt();
      TP3ej3.ingreso.nextLine();
      if (controlInicial) {
        numeroMenor = temporal;
        numeroMayor = temporal;
        controlInicial = false;
      }
      if ((!listaNumeros.contains(temporal)) && (temporal >= 0)) {
        listaNumeros.add(temporal);
        acumulador = acumulador + temporal;
        controlCarga = true;
      }
      if ((temporal >= 0) && (temporal > numeroMayor) && (controlCarga)) {
        numeroMayor = temporal;
      }
      if ((temporal >= 0) && (temporal < numeroMenor) && (controlCarga)) {
        numeroMenor = temporal;
      }
      if (temporal < 0) {
        control = false;
      }
    }
    promedio = (float) acumulador / listaNumeros.size();
    System.out.println("--- LISTA DE NUMEROS ---");
    for (Integer numero : listaNumeros) {
      System.out.println("Numero: " + numero);
    }
    System.out.println("Numero mayor: " + numeroMayor);
    System.out.println("Numero menor: " + numeroMenor);
    System.out.println("Promedio: " + promedio);
  }
}