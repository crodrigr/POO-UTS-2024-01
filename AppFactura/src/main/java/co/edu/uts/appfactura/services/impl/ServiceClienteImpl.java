
package co.edu.uts.appfactura.services.impl;

import co.edu.uts.appfactura.repositories.RepositoryCliente;
import co.edu.uts.appfactura.repositories.entities.Cliente;
import co.edu.uts.appfactura.services.ServiceCliente;
import java.util.List;

public class ServiceClienteImpl implements ServiceCliente {
    
    private RepositoryCliente repositoryCliente;

    public ServiceClienteImpl(RepositoryCliente repositoryCliente) {
        this.repositoryCliente = repositoryCliente;
    }    

    @Override
    public List<Cliente> listar() {
        return repositoryCliente.listar();
    }

    @Override
    public Cliente findById(int id) {
        return repositoryCliente.findById(id);
    }

    @Override
    public Cliente crear(Cliente cliente) {
        return repositoryCliente.crear(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
       repositoryCliente.editar(cliente);
    }

    @Override
    public void eliminar(Cliente cliente) {
        repositoryCliente.eliminar(cliente);
    }
    
}
