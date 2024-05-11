/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.uts.appdb;

import co.edu.uts.appdb.repositories.RepositoryCliente;
import co.edu.uts.appdb.repositories.RepositoryClienteImpl;
import co.edu.uts.appdb.repositories.models.Cliente;

/**
 *
 * @author camilo
 */
public class AppDB {

    public static void main(String[] args) {
        
        RepositoryCliente repositoriCliente=new RepositoryClienteImpl();
        
        Cliente cliente=new Cliente();
        cliente.setNombre("Camilo");
        cliente.setNombre("Rodriguez");
        cliente.setCelular("3485858585");
        cliente.setDireccion("xxxxxx");
        cliente.setEmail("crodrigr@gmail.com");
        
        repositoriCliente.crear(cliente);
        
        
        
        
        
        
        
        
    }
}
