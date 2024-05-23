
package co.edu.uts.appfactura.services;

import co.edu.uts.appfactura.repositories.entities.Cliente;
import java.util.List;



public interface ServiceCliente {
    
    List<Cliente> listar();
    
    Cliente findById(int id);
    
    Cliente crear(Cliente cliente);
    
    void editar(Cliente cliente);
    
    void eliminar(Cliente cliente);
    
}
