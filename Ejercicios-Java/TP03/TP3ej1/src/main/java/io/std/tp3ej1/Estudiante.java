package io.std.tp3ej1;

public class Estudiante {

  private int edad;
  private float promedio;
  private String apellidoNombre;

  public Estudiante() {}

  public Estudiante(int edad, float promedio, String apellidoNombre) {
    this.edad = edad;
    this.promedio = promedio;
    this.apellidoNombre = apellidoNombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public float getPromedio() {
    return promedio;
  }

  public void setPromedio(float promedio) {
    this.promedio = promedio;
  }

  public String getApellidoNombre() {
    return apellidoNombre;
  }

  public void setApellidoNombre(String apellidoNombre) {
    this.apellidoNombre = apellidoNombre;
  }
}
