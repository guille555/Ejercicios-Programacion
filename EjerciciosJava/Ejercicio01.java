import java.util.Scanner;

public class Ejercicio01 {

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
  }
}
