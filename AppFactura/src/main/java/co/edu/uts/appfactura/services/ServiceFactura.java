
package co.edu.uts.appfactura.services;


import co.edu.uts.appfactura.repositories.entities.Factura;
import java.util.List;



public interface ServiceFactura {

    List<Factura> listar();

    void crear(Factura factura)throws Exception;

    
}