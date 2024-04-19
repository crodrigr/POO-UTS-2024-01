
package uts.poo.crud.cliente.respositories.entities;


public class Producto {
    
    private String codigo;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    
    public Producto(){
    
    }

    public Producto(String codigo, String nombre, double precioCompra, double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public double getUtilidad(){
       return this.precioVenta-this.precioCompra;
    }
    
    
    
}
