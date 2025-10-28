package io.std.turnero.modelo;

public class Paciente {

  private String dni;
  private String apellidoNombre;
  private String telefono;
  private String correoElectronico;

  public Paciente() {}

  public Paciente(String dni, String apellidoNombre, String telefono, String correoElectronico) {
    this.dni = dni;
    this.apellidoNombre = apellidoNombre;
    this.telefono = telefono;
    this.correoElectronico = correoElectronico;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getApellidoNombre() {
    return apellidoNombre;
  }

  public void setApellidoNombre(String apellidoNombre) {
    this.apellidoNombre = apellidoNombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }
}
