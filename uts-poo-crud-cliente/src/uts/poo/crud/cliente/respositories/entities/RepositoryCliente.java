
package uts.poo.crud.cliente.respositories.entities;

import java.util.ArrayList;
import java.util.List;


public class RepositoryCliente {
    
    public static List<Cliente> listCliente=new ArrayList<>();
    
    public static List<Cliente> findAll(){
         return listCliente;
    }    
    public static Cliente findById(int id){
        
        for(Cliente cliente: listCliente){
            if(cliente.getId()==id){
                return cliente;                
            }
             
        }
        return null;
       
    } 
    
    public static Cliente save(Cliente cliente){
          listCliente.add(cliente);
          return cliente;
    }
    
    public static Cliente update(int id,Cliente cliente){
          for(Cliente c: listCliente){
            if(c.getId()==id){
               c.setNombre(cliente.getNombre());
               c.setApellido(cliente.getApellido());
               c.setEmail(cliente.getEmail());
               c.setDireccion(cliente.getDireccion());
               return c;
            }
             
        }
          return null;
    }
    
    public static void delete(int id){
        Cliente clienteDelete=findById(id);
        if(clienteDelete!=null){
             listCliente.remove(clienteDelete);
        }
    }
    
}
