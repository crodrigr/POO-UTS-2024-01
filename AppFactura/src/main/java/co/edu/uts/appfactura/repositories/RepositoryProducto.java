
package co.edu.uts.appfactura.repositories;

import co.edu.uts.appfactura.repositories.entities.Producto;
import java.util.List;


public interface RepositoryProducto {

     List<Producto> listar();

    Producto porCodigo(int codigo);

    void crear(Producto producto);

    void editar(Producto producto);

    void eliminar(Producto codigo);
    
    
}
