
package co.edu.uts.appfactura.services;

import co.edu.uts.appfactura.repositories.entities.Producto;
import java.util.List;



public interface ServiceProducto {

    List<Producto> listar();

    Producto porCodigo(int codigo) throws Exception;

    void crear(Producto cliente);

    void editar(Producto cliente);

    void eliminar(Producto codigo);

}