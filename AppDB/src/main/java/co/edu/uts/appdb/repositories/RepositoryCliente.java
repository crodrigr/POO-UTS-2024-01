
package co.edu.uts.appdb.repositories;

import co.edu.uts.appdb.repositories.models.Cliente;
import java.util.List;

public interface RepositoryCliente {
    
    List<Cliente> listar();
    
    Cliente findById(int id);
    
    Cliente crear(Cliente cliente);
    
    Cliente editar(Cliente cliente,int id);
    
    void eliminar(Cliente cliente);
    
    
    
}
