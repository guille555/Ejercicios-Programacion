import java.util.Scanner;

public class TP01E05 {
  public static void main(String[] args) {

    int limite = 5;
    int limiteServicio = 3;
    String[] clientes = new String[limite];
    int[] costosClientes = new int[limite];
    String[] servicios = new String[] { "Internet 30M", "Internet 50M", "Interner 100M (En PROMO, 5% OFF)" };
    float[] costos = new float[] { 750.0f, 1100.0f, 1500.0f };
    Scanner capturador = new Scanner(System.in);
    System.out.println("--- CARGA DE DATOS DE LOS CLIENTES ---");
    for (int index = 0; index < limite; index++) {
      System.out.println("INGRESAR DATOS DEL CLIENTE N°" + (index + 1) + ":");
      System.out.print("Ingrese el DNI del cliente: ");
      clientes[index] = capturador.nextLine();
      System.out.print("Ingrese el tipo de servicio, [1]Internet 30M [2]Internet 50M [3]Interner 100M (5% OFF): ");
      costosClientes[index] = capturador.nextInt();
      capturador.nextLine();
      System.out.println("***");
    }
    System.out.println("--- PLANES A COBRAR SEGUN CLIENTE ---");
    for (int index = 0; index < limite; index++) {
      System.out.println("DATOS DEL CLIENTE N°" + (index + 1) + ":");
      System.out.println("DNI del cliente: " + clientes[index]);
      switch (costosClientes[index]) {
        case 1:
          System.out.println(servicios[0] + " - A cobrar: " + costos[0]);
          break;
        case 2:
          System.out.println(servicios[1] + " - A cobrar: " + costos[1]);
          break;
        case 3:
          System.out.println(servicios[1] + " - A cobrar: " + (costos[2] * 0.95f));
          break;
      }
      System.out.println("***");
    }
    capturador.close();
  }
}

/*
Consigna:

Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio con el que cuenta.
*/
