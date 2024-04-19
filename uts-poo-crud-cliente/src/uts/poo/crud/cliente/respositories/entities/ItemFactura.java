
package uts.poo.crud.cliente.respositories.entities;


public class ItemFactura {
    
    private int idItemFactura;
    private int cantidad;
    private Producto producto;

    public ItemFactura() {
    }    
    

    public ItemFactura(int idItemFactura, int cantidad, Producto producto) {
        this.idItemFactura = idItemFactura;
        this.cantidad = cantidad;
        this.producto = producto;
    }    
    

    public int getIdItemFactura() {
        return idItemFactura;
    }

    public void setIdItemFactura(int idItemFactura) {
        this.idItemFactura = idItemFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public double getTotalItem(){
       return this.cantidad*this.producto.getPrecioVenta();
    }
   
    
    
    
}
