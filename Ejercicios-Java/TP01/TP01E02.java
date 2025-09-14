import java.util.Scanner;

public class TP01E02 {
  public static void main(String[] args) {

    int limite = 0;
    int cantidadAprobados = 0;
    int cantidadDesaprobados = 0;
    float[] notas;
    Scanner capturador = new Scanner(System.in);
    System.out.print("Ingrese el limite de notas a cargar: ");
    limite = capturador.nextInt();
    notas = new float[limite];
    for(int index = 0; index < limite; index++) {
      System.out.print("Ingrese la nota n°" + (index + 1) + ": ");
      notas[index] = capturador.nextFloat();
      if (notas[index] >= 6.0f) {
        cantidadAprobados = cantidadAprobados + 1;
      } else {
        cantidadDesaprobados = cantidadDesaprobados + 1;
      }
    }
    System.out.println("Cantidad de aprobados: " + cantidadAprobados);
    System.out.println("Cantidad de desaprobados: " + cantidadDesaprobados);
    capturador.close();
  }
}

/*
Consigna:

Cargar un vector con "n" notas e indicar la cantidad de aprobados (Notas mayores o iguales a 6), la cantidad de desaprobados (Notas menores a 6).
*/
