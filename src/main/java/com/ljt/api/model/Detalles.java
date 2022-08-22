package com.ljt.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tdetalles", schema = "dbtienda")
public class Detalles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdDetalles", nullable = false, length = 45)
    private String idDetalles;
    @Basic
    @Column(name = "NumBoleta", nullable = false)
    private int numBoleta;
    @Basic
    @Column(name = "IdProducto", nullable = false)
    private int idProducto;
    @Basic
    @Column(name = "PrecioUnitario", nullable = false, precision = 2)
    private double precioUnitario;
    @Basic
    @Column(name = "Cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "PrecioTotal", nullable = false, precision = 2)
    private double precioTotal;

    public String getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(String idDetalles) {
        this.idDetalles = idDetalles;
    }

    public int getNumBoleta() {
        return numBoleta;
    }

    public void setNumBoleta(int numBoleta) {
        this.numBoleta = numBoleta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detalles that = (Detalles) o;
        return numBoleta == that.numBoleta && idProducto == that.idProducto && Double.compare(that.precioUnitario, precioUnitario) == 0 && cantidad == that.cantidad && Double.compare(that.precioTotal, precioTotal) == 0 && Objects.equals(idDetalles, that.idDetalles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetalles, numBoleta, idProducto, precioUnitario, cantidad, precioTotal);
    }
}
