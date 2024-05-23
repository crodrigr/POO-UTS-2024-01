
package co.edu.uts.appfactura.services.impl;
import co.edu.uts.appfactura.repositories.RepositoryProducto;
import co.edu.uts.appfactura.repositories.entities.Producto;
import co.edu.uts.appfactura.services.ServiceProducto;
import java.util.List;



public class ServiceProductoImpl implements ServiceProducto {

    private final RepositoryProducto crudRepositoryProducto;

    public ServiceProductoImpl(RepositoryProducto crudRepositoryProducto){
        this.crudRepositoryProducto=crudRepositoryProducto;
    }

    @Override
    public List<Producto> listar() {
         return this.crudRepositoryProducto.listar();
        
    }

    @Override
    public Producto porCodigo(int codigo)throws Exception  {
        Producto producto = this.crudRepositoryProducto.porCodigo(codigo);
        if (producto != null) {
            return producto;
        } else {
            throw new Exception("No se encontro producto por codigo");
        }
        
    }

    @Override
    public void crear(Producto producto) {
        this.crudRepositoryProducto.crear(producto);        
    }

    @Override
    public void editar(Producto producto) {
        this.crudRepositoryProducto.editar(producto);
       
    }

    @Override
    public void eliminar(Producto producto) {
        this.crudRepositoryProducto.eliminar(producto);
    }
    
}