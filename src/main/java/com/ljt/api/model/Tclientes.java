package com.ljt.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tclientes", schema = "dbtienda")
public class Tclientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdCliente", nullable = false)
    private int idCliente;
    @Basic
    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;
    @Basic
    @Column(name = "DNI", nullable = false)
    private int dni;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tclientes that = (Tclientes) o;
        return idCliente == that.idCliente && dni == that.dni && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombre, apellido, dni);
    }
}
