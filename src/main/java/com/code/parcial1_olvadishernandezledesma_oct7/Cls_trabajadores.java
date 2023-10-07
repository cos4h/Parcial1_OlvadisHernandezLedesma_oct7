package com.code.parcial1_olvadishernandezledesma_oct7;

public class Cls_trabajadores {
  private String id;
  private String nombres;
  private String apellidos;
  private String contact;
  private String correo;
  private String direccion;
  private String sexo;
  private double salario;

  public Cls_trabajadores(String id, String nombres, String apellidos,
                          String contact, String correo,
                          String direccion, String sexo,
                          double salario) {
    this.id = id;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.contact = contact;
    this.correo = correo;
    this.direccion = direccion;
    this.sexo = sexo;
    this.salario = salario;
  }

  public Cls_trabajadores() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
