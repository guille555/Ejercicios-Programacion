import java.util.Scanner;

public class TP01E04 {
  public static void main(String[] args) {

    int limite = 30;
    int cantidadCargasTe = 0;
    int[] cargas = new int[limite];
    String[] patentes = new String[limite];
    String[] choferes = new String[limite];
    String[] horasEgresos = new String[limite];// se puede cambiar por un tipo Date
    Scanner capturador = new Scanner(System.in);
    System.out.println("--- CARGA DE DATOS DE CAMIONES QUE SALIERON DE LA PLANTA ---");
    for (int index = 0; index < limite; index++) {
      System.out.print("Ingrese la patente del camion n°" + (index + 1) + ": ");
      patentes[index] = capturador.nextLine();
      System.out.print("Ingrese los datos del chofer a cargo del camion: ");
      choferes[index] = capturador.nextLine();
      System.out.println("Ingrese tipo de carga transportada: [1]Madera [2]Té [3]Yerba");
      System.out.print("Tipo de carga: ");
      cargas[index] = capturador.nextInt();
      capturador.nextLine();// previene lecturas erroneas
      System.out.print("Ingrese la hora de egreso del camion: ");
      horasEgresos[index] = capturador.nextLine();
      if (cargas[index] == 2) {
        cantidadCargasTe = cantidadCargasTe + 1;
      }
      System.out.println("***");
    }
    System.out.println("--- DATOS DE LOS CAMIONES ---");
    for (int index = 0; index < limite; index++) {
      System.out.println("Camion n°" + (index + 1) + ", patente: " + patentes[index] + ", chofer a cargo: " + choferes[index] + ", hora de egreso: " + horasEgresos[index]);
      System.out.print("Tipo de carga transportada: ");
      switch(cargas[index]) {
        case 1:
          System.out.println("MADERA");
          break;
        case 2:
          System.out.println("TÉ");
          break;
        case 3:
          System.out.println("YERBA");
          break;
      }
      System.out.println("***");
    }
    System.out.println("Cantidad de camiones con cargas de té: " + cantidadCargasTe);
    capturador.close();
  }
}

/*
Consigna:

Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30 camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al usuario.
*/
