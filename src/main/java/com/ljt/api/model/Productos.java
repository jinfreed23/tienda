package com.ljt.api.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tproductos", schema = "dbtienda")
public class Productos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdProducto", nullable = false)
    private int idProducto;
    @Basic
    @Column(name = "IdUsuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "Producto", nullable = false, length = 100)
    private String producto;
    @Basic
    @Column(name = "Stock", nullable = true)
    private Integer stock;
    @Basic
    @Column(name = "FechaDeIngreso", nullable = false)
    private Date fechaDeIngreso;
    @Basic
    @Column(name = "Precio", nullable = false, precision = 0)
    private double precio;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productos that = (Productos) o;
        return idProducto == that.idProducto && idUsuario == that.idUsuario && Double.compare(that.precio, precio) == 0 && Objects.equals(producto, that.producto) && Objects.equals(stock, that.stock) && Objects.equals(fechaDeIngreso, that.fechaDeIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, idUsuario, producto, stock, fechaDeIngreso, precio);
    }
}
