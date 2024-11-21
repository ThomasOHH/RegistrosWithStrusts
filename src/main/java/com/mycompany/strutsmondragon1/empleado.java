/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strutsmondragon1;

/**
 *
 * @author User
 */
public class empleado {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fecha; // Fecha como String para facilitar el formato de entrada
    private String residencia;
    private String telefono; // Telefono como String para manejar valores alfanuméricos
    private String correo;

    // Constructor vacío
    public empleado() {
    }
  public empleado(String apellidoPaterno, String apellidoMaterno, String fecha, String residencia, String telefono, String correo) {
        super();
    }

    // Constructor con parámetros
    public empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String fecha, String residencia, String telefono, String correo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fecha = fecha;
        this.residencia = residencia;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método toString para mostrar los datos del cliente
    @Override
    public String toString() {
        return "Cliente{"
                + "nombre='" + nombre + '\''
                + ", apellidoPaterno='" + apellidoPaterno + '\''
                + ", apellidoMaterno='" + apellidoMaterno + '\''
                + ", fecha='" + fecha + '\''
                + ", residencia='" + residencia + '\''
                + ", telefono='" + telefono + '\''
                + ", correo='" + correo + '\''
                + '}';
    }

}
