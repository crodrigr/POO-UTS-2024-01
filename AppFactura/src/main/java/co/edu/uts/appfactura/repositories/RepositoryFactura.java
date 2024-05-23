
package co.edu.uts.appfactura.repositories;


import co.edu.uts.appfactura.repositories.entities.Factura;
import java.util.List;



public interface RepositoryFactura {

    List<Factura> listar();

    void crear(Factura factura)throws Exception;
    
}
