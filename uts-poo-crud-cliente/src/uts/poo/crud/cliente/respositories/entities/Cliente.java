
package uts.poo.crud.cliente.respositories.entities;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    
    private int   id;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String direccion;
    private List<Factura> factura;

    public Cliente(int id, String nombre, String apellido, String email, String celular, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.direccion = direccion;
        this.factura=new ArrayList();
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }
    
    
    
    
    
}
