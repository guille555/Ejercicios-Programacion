import java.util.Scanner;

public class TP02 {

  private final int LIMITE = 100;

  private char[] limpiarButacas() {
    char[] butacas = new char[this.LIMITE];
    for (int index = 0; index < this.LIMITE; index++) {
      butacas[index] = 'O';
    }
    return butacas;
  }

  private void mostrarMapa(char[] butacas) {
    int cantidadFilas = 10;
    int cantidadColumnas = 10;
    int numeroButaca = 0;
    for (int fila = 0; fila < cantidadFilas; fila++) {
      for (int columna = 0; columna < cantidadColumnas; columna++) {
        numeroButaca = (fila * cantidadFilas) + columna + 1;
        System.out.print(String.format("%1$3s", String.valueOf(numeroButaca)).replace(' ', '0') + " ");
      }
      System.out.println();
      for (int columna = 0; columna < cantidadColumnas; columna++) {
        numeroButaca = (fila * cantidadFilas) + columna;
        System.out.print("[" + butacas[numeroButaca] + "] ");
      }
      System.out.println();
      System.out.println();
    }
  }

  private int solicitarNumeroButaca() {
    int numeroButaca = 0;
    Scanner ingreso = new Scanner(System.in);
    while (true) {
      System.out.print("Ingrese el numero de butaca: ");
      numeroButaca = ingreso.nextInt() - 1;
      if ((numeroButaca >= 0) && (numeroButaca < this.LIMITE)) {
        break;
      }
    }
    return numeroButaca;
  }

  private String solicitarCorreoElectronico() {
    String correoElectronico = null;
    Scanner ingreso = new Scanner(System.in);
    System.out.print("Ingrese su correo electronico: ");
    correoElectronico = ingreso.nextLine();
    return correoElectronico;
  }

  private String solicitarTelefono(){
    String telefono = null;
    Scanner ingreso = new Scanner(System.in);
    System.out.print("Ingrese su numero de telefonno: ");
    telefono = ingreso.nextLine();
    return telefono;
  }

  private boolean controlarButaca(char[] butacas, int posicion) {
    boolean control = false;
    if (butacas[posicion] == 'O') {
      control = true;
    }
    return control;
  }

  private void reservar(char[] butacas, String[] correos, String[] telefonos) {
    int coordenada = this.solicitarNumeroButaca();
    boolean control = this.controlarButaca(butacas, coordenada);
    String correo = null;
    String telefono = null;
    if (control) {
      correo = this.solicitarCorreoElectronico();
      telefono = this.solicitarTelefono();
      butacas[coordenada] = 'X';
      correos[coordenada] = correo;
      telefonos[coordenada] = telefono;
    } else {
      System.err.println("butaca reservada");
    }
  }

  private void eliminarReserva(char[] butacas, String[] correos, String[] telefonos) {
    int coordenada = this.solicitarNumeroButaca();
    butacas[coordenada] = 'O';
    correos[coordenada] = null;
    telefonos[coordenada] = null;
  }

  public static void main(String[] args) {
    int opcion = 0;
    TP02 objeto = new TP02();
    Scanner ingreso = null;
    char[] butacas = objeto.limpiarButacas();
    String[] correos = new String[objeto.LIMITE];
    String[] telefonos = new String[objeto.LIMITE];
    while (true) {
      ingreso = new Scanner(System.in);
      objeto.mostrarMapa(butacas);
      System.out.print("Ingrese una opcion, [1]reservar butaca [2]eliminar reserva: ");
      opcion = ingreso.nextInt();
      switch (opcion) {
        case 1:
          objeto.reservar(butacas, correos, telefonos);
          break;
        case 2:
          objeto.eliminarReserva(butacas, correos, telefonos);
          break;
      }
    }
  }
}
