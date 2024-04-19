package uts.poo.crud.cliente.respositories.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {

    private int idFactura;
    private Date fecha;
    private String descripcion;
    private Cliente cliente;
    private List<ItemFactura> itemsFactura;
    private double total;

    public Factura() {
    }

    public Factura(int idFactura, Date fecha, String descripcion, Cliente cliente, double total) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.total = total;
        this.itemsFactura = new ArrayList<>();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<ItemFactura> getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(List<ItemFactura> itemsFactura) {
        this.itemsFactura = itemsFactura;
    }

    public void addItemFactura(ItemFactura itemFactura) {
        this.itemsFactura.add(itemFactura);
    }

    public void calcularTotalFactura() {
        for (ItemFactura item : this.itemsFactura) {
            this.total+=item.getTotalItem();
        }
    }

}
