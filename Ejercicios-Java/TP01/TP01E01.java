import java.util.Scanner;

public class TP01E01 {
  public static void main(String[] args) {

    int limite = 0;// cantidad de notas a ingresar
    float promedio = 0;// acumulador, primero. Luego promedio de las notas
    float mejorNota = 0;// nota más alta
    float[] notas;
    Scanner capturador = new Scanner(System.in);
    System.out.print("Ingrese el limtie de notas a cargar: ");
    limite = capturador.nextInt();
    notas = new float[limite];
    for (int index = 0; index < limite; index++) {
      System.out.println("Ingrese la nota n°" + (index + 1) + ":");
      notas[index] = capturador.nextFloat();
      promedio = promedio + notas[index];
      if (mejorNota < notas[index]) {
        mejorNota = notas[index];
      }
    }
    promedio = promedio / limite;
    System.out.println("Nota más alta: " + mejorNota);
    System.out.println("Promedio: " + promedio);
    capturador.close();
  }
}

/*
Consigna:

Un alumno tiene "n" notas (Se ingresa por teclado la cantidad de notas) que se deben cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las notas se debe mostrar la nota más alta y el promedio de notas.
*/
