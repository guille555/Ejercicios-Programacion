import java.util.Scanner;

public class TP01E07 {
  public static void main(String[] args) {

    int limite = 15;
    int cantidadMujeres = 0;
    int cantidadVarones = 0;
    float porcentajeVarones = 0;
    int[] edades = new int[limite];
    char[] sexos = new char[limite];
    String[] documentos = new String[limite];
    String mensaje = null;
    Scanner capturador = new Scanner(System.in);
    System.out.println("--- CARGA DE DATOS DE PERSONAS ---");
    for (int index = 0; index < limite; index++) {
      System.out.println("--- INGRESE DATOS DE LA PERSONA ---");
      System.out.print("Ingrese el numero de documento: ");
      documentos[index] = capturador.nextLine();
      System.out.print("Ingrese la edad de la persona: ");
      edades[index] = capturador.nextInt();
      capturador.nextLine();
      System.out.println("Opciones: [F]Mujer [M]Varon");
      System.out.print("Ingrese el sexo de la persona: ");
      sexos[index] = capturador.nextLine().charAt(0);
      if (sexos[index] == 'F') {
        cantidadMujeres = cantidadMujeres + 1;
      } else {
        cantidadVarones = cantidadVarones + 1;
      }
      if ((sexos[index] == 'M') && (edades[index] >= 16) && (edades[index] <= 65)) {
        porcentajeVarones = porcentajeVarones + 1;
      }
    }
    porcentajeVarones = (porcentajeVarones / cantidadVarones) * 100;
    System.out.println("--- DATOS DEL CENSO ---");
    System.out.println("Cantidad de personas cesadas: " + documentos.length);
    System.out.println("Cantidad de varones: " + cantidadVarones);
    System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    System.out.println("--- DATOS DE PERSONAS MAYORES DE EDAD ---");
    for (int index = 0; index < limite; index++) {
      if (edades[index] >= 18) {
        System.out.println("DOCUMENTO: " + documentos[index]);
        System.out.println("EDAD: " + edades[index]);
        System.out.println("SEXO: " + sexos[index]);
        System.out.println("***");
      }
    }
    mensaje = String.format("Porcentaje de varones, cuya edad es entre 16 y 65: %.2f", porcentajeVarones);
    System.out.println(mensaje);
    capturador.close();
  }
}

/*
Consigna:

Se realizó un censo provincial y se desea procesar la información obtenida en dicho censo. De cada una de las personas censadas se tiene la siguiente información: número de documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres, porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones, mostrar datos de la persona que registra la mayor edad.
*/
