package com.ljt.api.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tboleta", schema = "dbtienda")
public class Boleta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NumBoleta", nullable = false)
    private int numBoleta;
    @Basic
    @Column(name = "IdCliente", nullable = false)
    private int idCliente;
    @Basic
    @Column(name = "IdUsuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "Fecha", nullable = false)
    private Date fecha;
    @Basic
    @Column(name = "importe", nullable = false, precision = 2)
    private double importe;
    @Basic
    @Column(name = "Estado", nullable = false, length = 100)
    private String estado;

    public int getNumBoleta() {
        return numBoleta;
    }

    public void setNumBoleta(int numBoleta) {
        this.numBoleta = numBoleta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boleta that = (Boleta) o;
        return numBoleta == that.numBoleta && idCliente == that.idCliente && idUsuario == that.idUsuario && Double.compare(that.importe, importe) == 0 && Objects.equals(fecha, that.fecha) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numBoleta, idCliente, idUsuario, fecha, importe, estado);
    }
}
