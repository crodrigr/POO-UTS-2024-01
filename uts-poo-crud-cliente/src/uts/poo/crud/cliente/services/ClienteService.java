/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.poo.crud.cliente.services;

import java.util.List;
import uts.poo.crud.cliente.respositories.entities.Cliente;
import uts.poo.crud.cliente.respositories.entities.RepositoryCliente;


public class ClienteService {
       
    
    public static List<Cliente> findAll(){
        return RepositoryCliente.findAll();
    }
    
    public static Cliente findById(int id){
         return RepositoryCliente.findById(id);
    }
    
    public static Cliente save(Cliente cliente){
         return RepositoryCliente.save(cliente);
    }
    
    public static void delete(int id){
        RepositoryCliente.delete(id);
    }
    
}
