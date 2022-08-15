package com.ljt.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tusuarios", schema = "dbtienda")
public class Tusuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdUsuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "Usuario", nullable = false, length = 100)
    private String usuario;
    @Basic
    @Column(name = "Contraseña", nullable = false, length = 100)
    private String contraseña;
    @Basic
    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;
    @Basic
    @Column(name = "DNI", nullable = false)
    private int dni;
    @Basic
    @Column(name = "Cargo", nullable = false, length = 100)
    private String cargo;
    @Basic
    @Column(name = "Estado", nullable = false, length = 100)
    private String estado;
    @Basic
    @Column(name = "img", nullable = true, length = 100)
    private String img;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tusuarios that = (Tusuarios) o;
        return idUsuario == that.idUsuario && dni == that.dni && Objects.equals(usuario, that.usuario) && Objects.equals(contraseña, that.contraseña) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(cargo, that.cargo) && Objects.equals(estado, that.estado) && Objects.equals(img, that.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, usuario, contraseña, nombre, apellido, dni, cargo, estado, img);
    }
}
