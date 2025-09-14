import java.util.Scanner;

public class TP01E03 {
  public static void main(String[] args) {

    int limite = 0;
    float precioFinal = 0;
    int[] cantidades;
    float[] precios;
    Scanner capturador = new Scanner(System.in);
    System.out.print("Ingrese el límite de productos a cargar: ");
    limite = capturador.nextInt();
    cantidades = new int[limite];
    precios = new float[limite];
    for (int index = 0; index < limite; index++) {
      System.out.print("Ingrese la cantidad en el inventario del producto n°" + (index + 1) + ": ");
      cantidades[index] = capturador.nextInt();
      System.out.print("Ingrese el precio del producto n°" + (index + 1) + ": ");
      precios[index] = capturador.nextFloat();
    }
    System.out.println("--- PRODUCTOS CON PRECIO FINAL MAYOR A 1000 ---");
    for (int index = 0; index < limite; index++) {
      precioFinal = precios[index] * cantidades[index];
      if (precioFinal > 1000) {
        System.out.println("El producto n°" + (index + 1) + ", precio final: " + precioFinal);
      }
    }
    capturador.close();
  }
}

/*
Consigna:

Se tienen 2 vectores con "n" productos, uno con las cantidades[n] y el otro con los costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.
*/
