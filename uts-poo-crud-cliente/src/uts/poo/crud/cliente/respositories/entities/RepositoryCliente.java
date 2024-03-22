
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
    
    public static void delete(int id){
        Cliente clienteDelete=findById(id);
        if(clienteDelete!=null){
             listCliente.remove(clienteDelete);
        }
    }
    
}
